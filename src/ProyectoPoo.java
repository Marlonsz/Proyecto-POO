import Entrada.validar;
import Vehículos.Automovil;
import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    public static void main(String[] args) {
        //TODO: Terminar el main.
        Patio p_automotor = new Patio(15);
        int respuesta = imprimirMenuPrincipal();
        System.out.println(respuesta);
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("otros");
        switch (respuesta) {
            case 1:
                imprimirMenuIngresoVehicular();
                String tipo = ingresarTipoVehiculo(tipos);
                switch (tipo) {
                    case "automovil":
                        Vehiculo vh = imprimirMenuIngresoAutomovil();
                        // TODO: Falta receptar el boolean para determinar si el ingreso del vh es exitoso.
                        p_automotor.ingresarVehículo(vh);
                        break;
                    case "camiones":
                        // Terminar el menu de camiones
                        break;
                    case "camionetas":
                        // Terminar el menu de camionetas
                        break;
                    case "otros":
                        // Terminar el menu para otros vehiculos
                        break;
                    default:
                        // Asi vemos si las validaciones sirven.
                        throw new IllegalArgumentException();
                }
                break;
            case 2:
                // TODO: Añadir el ingreso de clientes
                break;
            case 3:
                // TODO: Añadir el ingreso de vendedores
                break;
            case 4:
                // TODO: Añadir la salida de autos del patio
                break;
            case 5:
                System.out.println("Gracias por confiar en nuestro sistema!");
                System.exit(0);
            default:
                // En el imposible caso de que salga un número diferente (que ya validamos) sabremos porqué.
                throw new IllegalArgumentException();
        }


    }

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

    public static Automovil imprimirMenuIngresoAutomovil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del carro: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la fecha de fabricación (en dd-mm-yy): ");
        Date f_fabricacion = validar.validarFecha();
        System.out.print("Ingrese el número de chasis: ");
        String n_chasis = scanner.nextLine();
        System.out.print("Ingrese el número del motor: ");
        String n_motor = scanner.nextLine();
        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();
        double cilindraje = validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido del automóvil");
        System.out.print("Ingrese la fecha de ingreso (en dd-mm-yy): ");
        Date fecha_ingreso = validar.validarFecha();
        Date fecha_venta = validar.validarFecha();
        return new Automovil(marca, modelo, f_fabricacion, n_chasis, n_motor, propietario, cilindraje, precio_sugerido, fecha_ingreso, fecha_venta);
    }

    public static String ingresarTipoVehiculo(ArrayList<String> tipos) {
        // TODO: Terminar este metodo.
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
        return cadena;
    }
}
