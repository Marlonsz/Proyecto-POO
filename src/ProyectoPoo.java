import Entrada.validar;
import Vehículos.Automovil;
import Vehículos.Camiones;
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
        switch (respuesta) {
            case 1:
                imprimirMenuIngresoVehicular();

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

    public static Automovil imprimirMenuIngresoAutomovil(ArrayList<Object> datos_vh) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de automovil: ");
        String tipo=scanner.nextLine();
        System.out.print("Ingrese número de puertas: ");
        int numPuertas=scanner.nextInt();
        System.out.print("Ingrese 1 si tiene cámara de parqueo, o 0 en caso contrario: ");
        int camP =scanner.nextInt();
        camP=validar.capturarNumeroRango(0, 1);
        boolean camParqueo;
        if (camP ==1)
            camParqueo=true;
        else
            camParqueo=false;
        Date fecha_ingreso = validar.validarFecha();
        Date fecha_venta = validar.validarFecha();
        return new Automovil(tipo,numPuertas,camParqueo,marca, modelo, f_fabricacion, n_chasis, n_motor, propietario, cilindraje, precio_sugerido, fecha_ingreso, fecha_venta);
    }
 public static Camiones imprimirMenuIngresoCamiones() {
     
        Scanner scanner = new Scanner(System.in);
        ingresoDatos();
        System.out.print("Ingrese número de ruedas: ");
        String numruedas=scanner.next();
        System.out.print("Ingrese la capacidad de carga: ");
        double capCarga=scanner.nextInt();
        System.out.print("Ingrese 1 si tiene rastreo satelital, o 0 en caso contrario: ");
        int rastreo =scanner.nextInt();
        validar.capturarNumeroRango(0, 1);
        boolean rasSat;
        if ( rastreo==1)
            rasSat=true;
        else
            rasSat=false;
        Date fecha_ingreso = validar.validarFecha();
        Date fecha_venta = validar.validarFecha();
        return new Camiones( numruedas,capCarga,rasSat,marca, modelo, f_fabricacion, n_chasis, n_motor, propietario, cilindraje, precio_sugerido, fecha_ingreso, fecha_venta);
    }
    public static String ingresarTipoVehiculo() {
        // TODO: Terminar este metodo.
        System.out.println("Ingrese el tipo de vehículo de los siguientes tipos:");
        System.out.println("Automovil,Motos, Camionetas, Camiones u Otros");
        return null;
    }
    public static ArrayList<Object> ingresoDatos(){
        ArrayList<Object> datos = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        datos.add(marca);
        System.out.print("Ingrese el modelo : ");
        String modelo = scanner.nextLine();
        datos.add(modelo);
        System.out.print("Ingrese la fecha de fabricación (en dd-mm-yy): ");
        Date f_fabricacion = validar.validarFecha();
        datos.add(f_fabricacion);
        System.out.print("Ingrese el número de chasis: ");
        String n_chasis = scanner.nextLine();
        datos.add(n_chasis);
        System.out.print("Ingrese el número del motor: ");
        String n_motor = scanner.nextLine();
        datos.add(n_motor);
        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();
        datos.add(propietario);
        double cilindraje = validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        datos.add(cilindraje);
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido: ");
        datos.add(precio_sugerido);
        return datos;
        
        
    }
}
