package Vehículos;

import Entrada.validar;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 23/06/17.
 */
public class VehiculoBuilder {
    /**
     * Función que se encarga de pedirle al usuario
     * el tipo de vehículo que va a ingresar al sistema.
     *
     * @param tipos lista de tipos admisibles
     * @return cadena con el tipo escogido por el usuario.
     */
    public static String ingresarTipoVehiculo(ArrayList<String> tipos) {
        /*

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehículo de los siguientes tipos:");
        System.out.println("Automovil,Motos, Camionetas, Camiones u Otro");
        String cadena;
        boolean terminar = false;
        do {
            cadena = sc.nextLine();
            if (tipos.contains(cadena.toLowerCase()))
                terminar = true;
            else {
                System.out.println("Ingrese un tipo de vehiculo!");
            }
        } while (!terminar);
        return cadena.toLowerCase();

    }

    /**
     * Función que se encarga de recolectar los
     * datos comunes de los autos.
     *
     * @return Un arreglo de Objetos con todas las propiedades
     * del auto.
     */
    public static ArrayList<Object> ingresoDatos() {
        ArrayList<Object> datos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        datos.add(marca);
        System.out.print("Ingrese el modelo : ");
        String modelo = scanner.nextLine();
        datos.add(modelo);
        Date f_fabricacion = validar.validarFecha("Ingrese la fecha de fabricación (en dd-mm-yy): ");
        datos.add(f_fabricacion);
        System.out.print("Ingrese el numero de chasis: ");
        String n_chasis = scanner.nextLine();
        datos.add(n_chasis);
        System.out.print("Ingrese el numero del motor: ");
        String n_motor = scanner.nextLine();
        datos.add(n_motor);
        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();
        datos.add(propietario);
        double cilindraje = validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        datos.add(cilindraje);
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido: ");
        datos.add(precio_sugerido);
        Date fecha_ingreso = validar.validarFecha("Ingrese fecha de ingreso (vacio si hoy): ");
        datos.add(fecha_ingreso);
        // Aquí se usa null, ya que si se ingresa el automovil, es por que no se ha vendido aún.
        datos.add(null);
        return datos;
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían apropiados en Automóviles.
     *
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Automóvil correctamente inicializado.
     */
    public static Automovil imprimirMenuIngresoAutomovil(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de automovil: ");
        String tipo = scanner.nextLine();
        int numPuertas = (int) validar.ingresarValorNumerico(0, "Ingrese numero de puertas");
        int camP = (int) validar.ingresarValorNumerico(0, 1, "Ingrese 1 si tiene cámara, 0 si no.");
        boolean camParqueo = camP == 1;
        return new Automovil(tipo, numPuertas, camParqueo, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3), (String) datos.get(4), (String) datos.get(5), (double) datos.get(6), (double) datos.get(7), (Date) datos.get(8), (Date) datos.get(9));
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían apropiados en Camion.
     *
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Camion correctamente inicializado.
     */
    public static Camion imprimirMenuIngresoCamion(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero de ruedas: ");
        int numruedas = (int) validar.ingresarValorNumerico(0, "Ingrese el numero de ruedas");
        double capCarga = validar.ingresarValorNumerico(0, "Ingrese la capacidad de carga: ");
        int rastreo;
        rastreo = (int) validar.ingresarValorNumerico(0, 1,
                "Ingrese 1 si tiene rastreo satelital, o 0 en caso contrario ");
        boolean rasSat = rastreo == 1;
        return new Camion(numruedas, capCarga, rasSat, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3), (String) datos.get(4), (String) datos.get(5), (double) datos.get(6), (double) datos.get(7), (Date) datos.get(8), (Date) datos.get(9));
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían relevantes en una camioneta
     *
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Camioneta correctamente inicializado.
     */
    public static Camioneta imprimirMenuIngresoCamioneta(ArrayList<Object> datos) {
        //TERMINAR MENU Camioneta-FALTA LOS 2 ATRIBUTOS
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de cabina: ");
        String tipoCab = scanner.nextLine();
        return new Camioneta(tipoCab, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3), (String) datos.get(4), (String) datos.get(5), (double) datos.get(6),
                (double) datos.get(7), (Date) datos.get(8), (Date) datos.get(9));
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían relevantes en una Moto
     *
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Moto correctamente inicializado.
     */
    public static Moto imprimirMenuIngresoMotos(ArrayList<Object> datos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de moto");
        String tipo = sc.nextLine();
        System.out.println("Ingrese el sistema de arranque de la moto");
        String sisArr = sc.nextLine();
        System.out.println("Ingrese el tipo de transmisión de la moto");
        String transmision = sc.nextLine();
        return new Moto(tipo, sisArr, transmision, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3), (String) datos.get(4), (String) datos.get(5), (double) datos.get(6),
                (double) datos.get(7), (Date) datos.get(8), (Date) datos.get(9));
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían relevantes en otro tipo de vehículos.
     *
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Otro correctamente inicializado.
     */
    public static Otro imprimirMenuIngresoOtros(ArrayList<Object> datos) {
        //TERMINAR MENU Otro -FALTA LOS 3 ATRIBUTOS
        return new Otro((String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3), (String) datos.get(4), (String) datos.get(5), (double) datos.get(6),
                (double) datos.get(7), (Date) datos.get(8), (Date) datos.get(9));
    }
}
