package Cliente_Vendedor;

import Entrada.validar;
import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 25/06/17.
 * Clase que se encarga de inicializar las instancias de
 * los objetos hijos de Usuario: (Cliente, Vendedor)
 */

public class UsuarioBuilder {
    /**
     * Función que se encarga de inicializar una instancia de Cliente
     * sin vehículos en su propiedad.
     *
     * @return un objeto Cliente inicializado.
     */
    public static Cliente ingresarCliente() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese numero de id: ");
        String iD = scanner.nextLine();
        System.out.print("Ingrese telefono: ");
        String tel = validar.ingresarTelefonoValido();
        System.out.print("Ingrese pais: ");
        String pais = scanner.nextLine();
        System.out.print("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese sector: ");
        String sector = scanner.nextLine();
        System.out.print("Ingrese numero de vivienda: ");
        String numVivi = scanner.nextLine();
        Date fecha_ingreso = validar.validarFecha("Ingrese fecha de ingreso: ");
        return new Cliente(nombre, apellido, iD, tel, pais, ciudad, calle, sector, numVivi, fecha_ingreso, vehiculos);
    }

    /**
     * Funcion que se encarga de inicializar un vendedor con los
     * datos ingresados por el usuario.
     *
     * @return un objeto vendedor.
     */
    public static Vendedor ingresarVendedor(ArrayList<String> tipo) {

        /*
        MEJORAR--AGREGAR TIPO DE VENDEDOR, CALCULO DE LA COMISIÓN
        TODO: Validar.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese numero de id: ");
        String iD = scanner.nextLine();
        System.out.print("Ingrese telefono: ");
        String tel = validar.ingresarTelefonoValido();
        String tipo_vendedor =validar.validarTipoVendedor(tipo);
        return new Vendedor(nombre, apellido, iD, tel, tipo_vendedor);
    }
}
