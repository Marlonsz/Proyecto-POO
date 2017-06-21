import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.Vendedor;
import Entrada.validar;
import Vehículos.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 08/06/17.
 */
public class UI {
    /**
     * Función que imprime el menú principal
     *
     * @return entero con la opción seleccionada.
     */
    public static int imprimirMenuPrincipal() {

        System.out.printf((Color.FONDO_AMARILLO)+"Bienvenido al sistema del Patio Automotor%n" +
                (Color.AZUL)+"Las siguientes opciones están disponibles%n" +
                (Color.MAGENTA)+"1) Ingreso de vehículos al patio%n" +
                (Color.MAGENTA)+"2) Ingreso de clientes%n" +
                (Color.MAGENTA)+"3) Ingreso de vendedores%n" +
                (Color.MAGENTA)+"4) Registrar carro saliente%n" +
                (Color.MAGENTA) + "5) Reporte de vehículos actualmente en el patio%n" +
                (Color.MAGENTA) + "6) Reporte de clientes actuales%n" +
                (Color.MAGENTA) + "7) Reporte de vendendores%n" +
                (Color.MAGENTA) + "8) Salir%n" +
                (Color.REINICIAR));
        return validar.capturarNumeroRango(0, 8);
    }

    /**
     *  Función que se encarga de imprimir el
     *  menú de ingreso vehicular.
     */
    public static void imprimirMenuIngresoVehicular() {
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

    /**
     * Función que se encarga de pedirle al usuario
     * el tipo de vehículo que va a ingresar al sistema.
     * @param tipos lista de tipos admisibles
     * @return cadena con el tipo escogido por el usuario.
     */
    public static String ingresarTipoVehiculo(ArrayList<String> tipos) {
        /*
        
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehículo de los siguientes tipos:");
        System.out.println("Automovil,Moto, Camioneta, Camion u Otro");
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

    /**
     * Función que se encarga de recolectar los
     * datos comunes de los autos.
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
        System.out.print("Ingrese el n\u00famero de chasis: ");
        String n_chasis = scanner.nextLine();
        datos.add(n_chasis);
        System.out.print("Ingrese el n\u00famero del motor: ");
        String n_motor = scanner.nextLine();
        datos.add(n_motor);
        System.out.print("Ingrese el propietario: ");
        String propietario = scanner.nextLine();
        datos.add(propietario);
        double cilindraje =  validar.ingresarValorNumerico(0, "Ingrese el cilindraje (en cm3): ");
        datos.add(cilindraje);
        double precio_sugerido = validar.ingresarValorNumerico(0, "Ingrese el valor sugerido: ");
        datos.add(precio_sugerido);
        System.out.println("Ingrese fecha de ingreso (vacio si hoy): ");
        Date fecha_ingreso = validar.validarFecha("Ingrese fecha de ingreso: ");
        datos.add(fecha_ingreso);
        // Aquí se usa null, ya que si se ingresa el automovil, es por que no se ha vendido aún.
        Date fecha_venta = null;
        datos.add(fecha_venta);
        return datos;
    }

    /**
     * Función que se encarga de pedirle al usuario datos adicionales, que
     * sólo serían apropiados en Automóviles.
     * @param datos Recibe el {@link ArrayList<Vehiculo>} de Objetos de la función ingresoDatos
     * @return un objeto Automóvil correctamente inicializado.
     */
    public static Automovil imprimirMenuIngresoAutomovil(ArrayList<Object> datos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tipo de automovil: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese número de puertas: ");
        int numPuertas = (int) validar.ingresarValorNumerico(0, "Ingrese numero de puertas");
        System.out.print("Ingrese 1 si tiene cámara de parqueo, o 0 en caso contrario: ");
        int camP;
        camP = validar.capturarNumeroRango(0, 1);
        boolean camParqueo;
        camParqueo = camP == 1;
        return new Automovil(tipo, numPuertas, camParqueo, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
                (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),(double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
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
        int numruedas = (int) validar.ingresarValorNumerico(0, "Ingrese el numero de ruedas") ;
        System.out.print("Ingrese la capacidad de carga: ");
        double capCarga = scanner.nextInt();
        System.out.print("Ingrese 1 si tiene rastreo satelital, o 0 en caso contrario ");
        int rastreo = validar.capturarNumeroRango(0, 1);
        boolean rasSat;
        rasSat = rastreo == 1;
        return new Camion(numruedas, capCarga, rasSat, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),(double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
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
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese tipo de cabina: ");
        String tipoCab = scanner.nextLine();
        return new Camioneta(tipoCab, (String) datos.get(0), (String) datos.get(1), (Date) datos.get(2),
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
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
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8), (Date) datos.get(9));
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
       (String) datos.get(3),(String) datos.get(4),(String) datos.get(5),(double) datos.get(6),
                (double) datos.get(7), (Date)datos.get(8),(Date) datos.get(9));
    }
/*Ordena el arreglo de vehiculos por fecha de ingreso*/
@Deprecated
    /*
    Para el  bien de la sanidad mental de todos lo que revisan este código:
    Hay que implementar Comparable en Vehículos.
    O implementar Comparators
    https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
     */
public static void compare(ArrayList<Vehiculo> vehiculos ) {
    Vehiculo aux;
    for(int i = 0; i<vehiculos.size(); i++){
        for(int j = 1; j<vehiculos.size()-1; j++){
            if (vehiculos.get(j).getFecha_ingreso().before(vehiculos.get(i).getFecha_ingreso())) {
                aux=vehiculos.get(i);
                vehiculos.remove(i);
                vehiculos.add(i, vehiculos.get(j));
                vehiculos.remove(j);
                vehiculos.add(j, aux);

            }
        }
    }


}

    /**
     * Función que se encarga de inicializar una instancia de Cliente
     *
     * @param disponibles
     */
    public static Cliente ingresarCliente(ArrayList<Vehiculo> disponibles) {
        //MEJORAR--AGREGAR AL CLIENTE LOS VEHICULOS QUE HA ADQUIRIDO
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
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
        //Mejoren el ingreso de la fecha salen 2 mensajes seguidos, tambien el de ingresar valor numerico mejorar
        //implementar como regresar al menu en caso que no haya vehiculos ya que lo que he hecho es terminar el programa si no hay
        System.out.print("Ingrese fecha de ingreso: ");
        Date fecha_ingreso = validar.validarFecha("Ingrese fecha correcta ");
        /*Pregunta el numero de vehiculos que ha comprado*/
        System.out.print("Ingrese el numero de vehiculos vendidos ");
        String nveh = scanner.nextLine();
        int num=validar.ingresarValorNumerico(nveh);
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehículos en el patio en este momento");
            System.exit(0);
        }
        /* muestra un listado con la descripcion de cada vehiculo y permite escoger una opcion*/
        // Pide que ingrese el numero del vehículo que compra y este se añade a s registro de vehículos comprados
        for(int i = 0; i<num; i++){
            System.out.print("Ingrese el numero del "+(i+1)+ " vehiculo vendido: ");
            for(int j = 0; j<disponibles.size(); j++){
                System.out.println((j+1)+disponibles.get(j).toString());
            }
            String op=scanner.nextLine();
            int op2=validar.ingresarValorNumerico(op);
            System.out.println("");
            vehiculos.add(disponibles.get(op2-1));


        }

        return new Cliente(nombre,apellido,iD,tel,pais,ciudad,calle,sector,numVivi, fecha_ingreso, vehiculos);
    }

    /**
     * Funcion que se encarga de inicializar un vendedor con los
     * datos ingresados por el usuario.
     *
     * @return un objeto vendedor.
     */
    public static Vendedor ingresarVendedor() {
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
        String tel = scanner.nextLine();
        while (!validar.esTelefonoValido(tel)) {
            System.out.print("Ingrese telefono: ");
            tel = scanner.nextLine();
        }   
        System.out.print("Ingrese tipo de vendedor(Junior/Semi Senior/Senior): ");
        String tipo = scanner.nextLine().toLowerCase();
        tipo = validar.validarTipoVendedor(tipo);
        return new Vendedor(nombre, apellido,iD,tel,tipo);
    }
    
    /**
     * Realiza la venta del vehículo al cliente llevando un registro y modificando los
     * datos de cada uno
     * @param vehiculo Arreglo con los vehículos que hay en el patio
     * @param cliente Clientes de la concesionaria
     * @param vendedor Vendedores de la concesionaria
     */
    public static void Venta(ArrayList<Vehiculo> vehiculo,ArrayList<Cliente> cliente, ArrayList<Vendedor> vendedor){
        Scanner scanner = new Scanner(System.in);
        int c=0;
        int v=0;
        Vehiculo vh;
        /* Identifica al cliente por su numero de identificacion, en caso de no estar
        lo registra
        */
        System.out.println("Ingrese el numero de identificación del cliente:");
        String numid=scanner.nextLine();
        for(int i=0;i<cliente.size();i++){
            if(cliente.get(i).getNumid().contains(numid)){
                c=i;
                break;
            }
            else if((!cliente.get(i).getNumid().contains(numid))
                    && (i==cliente.size()-1)){
                cliente.add(ingresarCliente(vehiculo));
                c=cliente.size()-1;
                break;
                
            }
        }
        /* Identifica al vendedor por su numero de identificacion, en caso de no estar
        lo registra
        */
        System.out.println("Ingrese el numero de identificación del Vendedor:");
        String numid2=scanner.nextLine();
        for(int i=0;i<vendedor.size();i++){
            if(vendedor.get(i).getNumid().contains(numid2)){
                v=i;
                break;
            }
            else if((!vendedor.get(i).getNumid().contains(numid2))
                    && (i==vendedor.size()-1)){
                vendedor.add(ingresarVendedor());
                v=vendedor.size()-1;
                break;
                
            }
        }
        /* 
        *Muestra una lista con los vehículos y el usuario selecciona los vehículos 
        que ha vendido
        */
        Cliente c1=cliente.get(c);
        Vendedor v1=vendedor.get(v);
        System.out.println("Ingrese el numero de vehículos a vender:");
        String nveh = scanner.nextLine();
        int num=validar.ingresarValorNumerico(nveh);
        if(vehiculo.isEmpty()){
            System.out.println("No hay vehículos en el patio en este momento");
            System.exit(0);
        }
        for(int i = 0; i<num; i++){
            System.out.print("Ingrese el numero del "+(i+1)+ "vehiculo vendido: ");
            for(int j = 0; j<vehiculo.size(); j++){
                System.out.println((j+1)+vehiculo.get(j).toString());
            }
            String op=scanner.nextLine();
            int op2=validar.ingresarValorNumerico(op);
            System.out.println("");
            c1.getVh_adq().add(vehiculo.get(op2-1));
            vh=vehiculo.get(op2-1);
            double precio=PrecioFinal(vh,v1);
                    v1.setTotcomision(v1.getTotcomision()+comisiones(precio,v1));
                    v1.setTotventas(v1.getTotventas()+1);
                    v1.getVh_vendidos().add(vh);
                    System.out.println("Ingrese fecha de venta (vacio si hoy): ");
                    Date fecha_egreso = validar.validarFecha("Ingrese fecha de egreso: ");
                    vh.setFecha_venta(fecha_egreso);
                    vehiculo.remove(vh);

        }
        /* 
        *Se asigna la comisión al vendedor, la fecha de salida del vehículo
        y se retira el vehículo del patio
        */
        
          
    } 
    /**
     * Calcula el precio final del vehículo dependiendo del tipo
     * @param vh Vehículo que se va a vender
     * @param v Vendedor que realiza la venta
     * @return El precio final del vehículo
     */
    public static double PrecioFinal(Vehiculo vh,Vendedor v){
        if(vh instanceof Automovil){
            return (vh.getPrecio_sugerido()*(5/100))+500+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Camioneta){
            return (vh.getPrecio_sugerido()*(10/100))+700+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Camion){
            return (vh.getPrecio_sugerido()*(15/100))+850+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Moto){
            return (vh.getPrecio_sugerido()*(2.5/100))+200+vh.getPrecio_sugerido();
        }
        else {
            return (vh.getPrecio_sugerido()*(2.5/100))+250+vh.getPrecio_sugerido();
        }
        
    }
    /**
     * Calcula la comisión del vendedor
     * @param preciofinal Precio final del vehículo a vender
     * @param v Vendedor que realiza la venta
     * @return La comisión que recibe el vendedor por dicha venta
     */
    public static double comisiones(double preciofinal,Vendedor v){
        if("junior".contentEquals(v.getTipo())){
            return preciofinal*(3/100);
        }
        else if("semi senior".contentEquals(v.getTipo())){
            return preciofinal*(6/100);
        }
        else{
            return preciofinal*(10/100);
        }
    }
    

}
