import Entrada.validar;
import Vehículos.Automovil;
import Vehículos.Camiones;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 08/06/17.
 */
public class UI {
    public static int imprimirMenuPrincipal() {

        System.out.printf("Bienvenido al sistema del Patio Automotor%n" +
                "Las siguientes opciones están disponibles%n" +
                "1) Ingreso de vehículos al patio%n" +
                "2) Ingreso de clientes%n" +
                "3) Ingreso de vendedores%n" +
                "4) Registrar carro saliente%n" +
                "5) Salir%n");
        return validar.capturarNumeroRango(0, 5);
    }

    public static void imprimirMenuIngresoVehicular() {
        // TODO: Hacer que identifique el tipo de vehículo.
        System.out.printf("Bienvenido al ingreso de vehículos%n" +
                "Tenga listo los siguientes datos:%n" +
                "- Tipo de automóvil%n" +
                "- Marca%n" +
                "- Modelo%n" +
                "- Fecha de fabricación%n" +
                "- Número de chasis%n" +
                "- Número de motor%n" +
                "- Propietario (presione enter para dejar sin propietario)%n" +
                "- Cilindraje%n" +
                "- Precio Sugerido%n" +
                "- Fecha de ingreso%n" +
                "- Fecha de venta%n");

    }


    public static String ingresarTipoVehiculo(ArrayList<String> tipos) {
        /*
        
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehículo de los siguientes tipos:");
        System.out.println("Automovil,Motos, Camionetas, Camiones u Otros");
        String cadena;
        boolean terminar;
        do {
            cadena = sc.nextLine();
            if (tipos.contains(cadena.toLowerCase()))
                terminar = true;
            else {
                System.out.println("Ingrese un tipo de vehiculo!");
                terminar = false;
            }
        } while (!terminar);
        return cadena.toLowerCase();
    }

    public static Camiones imprimirMenuIngresoCamiones(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese n\u00famero de ruedas: ");
        int numruedas = (int) validar.ingresarValorNumerico(0, "Ingrese el numero de ruedas") ;
        System.out.print("Ingrese la capacidad de carga: ");
        double capCarga = scanner.nextInt();
        System.out.print("Ingrese 1 si tiene rastreo satelital, o 0 en caso contrario: ");
        int rastreo = scanner.nextInt();
        validar.capturarNumeroRango(0, 1);
        boolean rasSat;
        if (rastreo == 1) {
            rasSat = true;
        } else {
            rasSat = false;
        }
        Date fecha_ingreso = validar.validarFecha();
        Date fecha_venta = validar.validarFecha();
        return new Camiones(numruedas, capCarga, rasSat, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),(double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }

    public static ArrayList<Object> ingresoDatos() {
        ArrayList<Object> datos = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        datos.add(marca);
        System.out.print("Ingrese el modelo : ");
        String modelo = scanner.nextLine();
        datos.add(modelo);
        System.out.print("Ingrese la fecha de fabricaci\u00f3n (en dd-mm-yy): ");
        Date f_fabricacion = validar.validarFecha();
        datos.add(f_fabricacion);
        System.out.print("Ingrese el n\u00famero de chasis: ");
        String n_chasis = scanner.nextLine();
        datos.add(n_chasis);
        System.out.print("Ingrese el n\u00famero del motor: ");
        String n_motor = scanner.nextLine();
        datos.add(n_motor);
        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();
        datos.add(propietario);
        double cilindraje = validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        datos.add(cilindraje);
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido: ");
        datos.add(precio_sugerido);
        System.out.println("Ingrese fecha de ingreso (vacio si hoy): ");
        Date fecha_ingreso = validar.validarFecha();
        datos.add(fecha_ingreso);
        Date fecha_venta = null;
        datos.add(fecha_venta);
        return datos;
    }

    public static Automovil imprimirMenuIngresoAutomovil(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de automovil: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese n\u00famero de puertas: ");
        int numPuertas = (int) validar.ingresarValorNumerico(0, "Ingrese numero de puertas");
        System.out.print("Ingrese 1 si tiene c\u00e1mara de parqueo, o 0 en caso contrario: ");
        int camP;
        camP = validar.capturarNumeroRango(0, 1);
        boolean camParqueo;
        if (camP == 1) {
            camParqueo = true;
        } else {
            camParqueo = false;
        }
        return new Automovil(tipo, numPuertas, camParqueo, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),(double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
}
