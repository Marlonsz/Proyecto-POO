import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.Vendedor;
import Entrada.validar;
import Vehículos.Automovil;
import Vehículos.Camiones;
import Vehículos.Camionetas;
import Vehículos.Motos;
import Vehículos.Otros;
import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 08/06/17.
 */
public class UI {
    public static int imprimirMenuPrincipal() {
        
        System.out.printf((Color.FONDO_AMARILLO)+"Bienvenido al sistema del Patio Automotor%n" +
                (Color.AZUL)+"Las siguientes opciones están disponibles%n" +
                (Color.MAGENTA)+"1) Ingreso de vehículos al patio%n" +
                (Color.MAGENTA)+"2) Ingreso de clientes%n" +
                (Color.MAGENTA)+"3) Ingreso de vendedores%n" +
                (Color.MAGENTA)+"4) Registrar carro saliente%n" +
                (Color.MAGENTA)+"5) Salir%n");
        return validar.capturarNumeroRango(0, 5);
    }

    public static void imprimirMenuIngresoVehicular() {
        // TODO: Hacer que identifique el tipo de vehículo.
        System.out.printf((Color.FONDO_AMARILLO)+"Bienvenido al ingreso de vehículos%n" +
                (Color.AZUL)+"Tenga listo los siguientes datos:%n" +
                (Color.MAGENTA)+"- Tipo de automóvil%n" +
                (Color.MAGENTA)+"- Marca%n" +
                (Color.MAGENTA)+"- Modelo%n" +
                (Color.MAGENTA)+"- Fecha de fabricación%n" +
                (Color.MAGENTA)+"- Número de chasis%n" +
                (Color.MAGENTA)+"- Número de motor%n" +
                (Color.MAGENTA)+"- Propietario (presione enter para dejar sin propietario)%n" +
                (Color.MAGENTA)+"- Cilindraje%n" +
                (Color.MAGENTA)+"- Precio Sugerido%n" +
                (Color.MAGENTA)+"- Fecha de ingreso%n" +
                (Color.MAGENTA)+"- Fecha de venta%n");

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
        return cadena.toLowerCase();
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
        Date f_fabricacion = validar.validarFecha("Ingrese la fecha de fabricaci\u00f3n (en dd-mm-yy): ");
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
        //ERROR....EN CILINDRAJE Y PRECIO SUGERIDO NO ACEPTA DOUBLE por teclado
        double cilindraje = validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        datos.add(cilindraje);
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido: ");
        datos.add(precio_sugerido);
        //VALIDAR QUE LA FECHA DE INGRESO SEA ANTES QUE LA DE VENTA
        Date fecha_ingreso = validar.validarFecha("Ingrese fecha de ingreso: ");
        datos.add(fecha_ingreso);
        Date fecha_venta = validar.validarFecha("Ingrese fecha de venta: ");
        datos.add(fecha_venta);
        return datos;
    }
     public static Automovil imprimirMenuIngresoAutomovil(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de automovil: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese n\u00famero de puertas: ");
        int numPuertas = scanner.nextInt();
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
     
    public static Camiones imprimirMenuIngresoCamiones(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese n\u00famero de ruedas: ");
        int numruedas = (int) validar.ingresarValorNumerico(0, "Ingrese el numero de ruedas") ;
        System.out.print("Ingrese la capacidad de carga: ");
        double capCarga = scanner.nextInt();
        System.out.print("Ingrese 1 si tiene rastreo satelital, o 0 en caso contrario ");
        int rastreo = scanner.nextInt();
        rastreo=validar.capturarNumeroRango(0, 1);
        boolean rasSat;
        if (rastreo == 1) {
            rasSat = true;
        } else {
            rasSat = false;
        }
        return new Camiones(numruedas, capCarga, rasSat, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),(double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
    
    public static Camionetas imprimirMenuIngresoCamionetas(ArrayList<Object> datos) {
        //TERMINAR MENU Camionetas-FALTA LOS 2 ATRIBUTOS
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese tipo de cabina: ");
        String tipoCab = scanner.nextLine();
        return new Camionetas( tipoCab,(String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
    
   
    public static Motos imprimirMenuIngresoMotos(ArrayList<Object> datos) {
        //TERMINAR MENU MOTOS -FALTA LOS 3 ATRIBUTOS
        return new Motos( (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
    
    public static Otros imprimirMenuIngresoOtros(ArrayList<Object> datos) {
        //TERMINAR MENU Otros -FALTA LOS 3 ATRIBUTOS
        return new Otros( (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
    public static String ingresarTipoVehiculo() {
        // DONDE SE LO USA?
        System.out.println("Ingrese el tipo de veh\u00edculo de los siguientes tipos:");
        System.out.println("Automovil,Motos, Camionetas, Camiones u Otros");
        return null;
    }
    public static void ingresarCliente() {
        //MEJORAR--AGREGAR AL CLIENTE LOS VEHICULOS QUE HA ADQUIRIDO
        ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre=scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido=scanner.nextLine();
        System.out.print("Ingrese numero de id: ");
        String iD=scanner.nextLine();
        System.out.print("Ingrese telefono: ");
        String tel=scanner.nextLine();
        System.out.print("Ingrese pais: ");
        String pais=scanner.nextLine();
        System.out.print("Ingrese ciudad: ");
        String ciudad=scanner.nextLine();
        System.out.print("Ingrese calle: ");
        String calle=scanner.nextLine();
        System.out.print("Ingrese sector: ");
        String sector=scanner.nextLine();
        System.out.print("Ingrese numero de vivienda: ");
        String numVivi=scanner.nextLine();
        System.out.print("Ingrese fecha de ingreso: ");
        String fecha_ingreso=scanner.nextLine();
        System.out.print("Ingrese vehiculo adquirido: ");
        
        
        Cliente perfil= new Cliente(nombre,apellido,iD,tel,pais,ciudad,calle,sector,numVivi,fecha_ingreso,vehiculos);
    }
    public static void ingresarVendedor() {
        //MEJORAR--AGREGAR TIPO DE VENDEDOR, CALCULO DE LA COMISIÓN
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre=scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido=scanner.nextLine();
        System.out.print("Ingrese numero de id: ");
        String iD=scanner.nextLine();
        System.out.print("Ingrese telefono: ");
        String tel=scanner.nextLine();
        System.out.print("Ingrese tipo de vendedor: ");
        String pais=scanner.nextLine();
        System.out.print("Ingrese total de venta: ");
        int totventas=scanner.nextInt();
        System.out.print("Ingrese total de comisión: ");
        int totcomision=scanner.nextInt();
        Vendedor perfil= new Vendedor(nombre,apellido,iD,tel,pais,totventas,totcomision);
    }
}
