package Entrada;

import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.Vendedor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by piero512 on 3/6/17.
 */
public class validar {
    /**
     * Función para validar el ingreso de datos numéricos en un rango
     *
     * @param n_inicio número inicial del rango
     * @param n_final  número final del rango
     * @return número capturado dentro del rango.
     */
    public static int capturarNumeroRango(int n_inicio, int n_final) {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese la opción deseada: ");
            while (!input.hasNextInt()) {
                System.out.println("No ha ingresado un número!");
                System.out.print("Ingrese la opción deseada: ");
                input.next(); // this is important!
            }
            numero = input.nextInt();
            if (!(numero > n_inicio && numero <= n_final))
                System.out.println("El número no está entre las opciones!");
        } while (!(numero > n_inicio && numero <= n_final));
        return numero;
    }

    /**
     * Función que permite el ingreso de un dato numérico, mostrando
     * un mensaje adecuado cuando el usuario ingresa un número incorrecto
     * @param n_inicio número de inicio
     * @param n_final número final
     * @param mensaje mensaje a mostrar en caso de error
     * @return número capturado al usuario dentro del rango
     */
    public static double ingresarValorNumerico(int n_inicio, int n_final, String mensaje) {
        double valor;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextDouble()) {
                System.out.println("No ha ingresado un número!");
                entrada.next();
            }
            valor = entrada.nextInt();
        } while (!(valor >= n_inicio && valor <= n_final));
        return valor;
    }

    /**
     * Función que permite el ingreso de un valor numérico cualquiera
     * @param mensaje Mensaje mostrado en caso de error
     * @return número pedido al usuario
     */
    public static int ingresarValorNumerico(String mensaje) {
        int valor;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextInt()) {
                System.out.println("No ha ingresado un número!");
                entrada.next();
            }
            valor = entrada.nextInt();
        } while (!(valor > 0 && valor <= 15));
        return valor;
    }

    /**
     * Función que valida la entrada de un valor numérico
     * con un inicio y un mensaje de error.
     * @param n_inicio número de inicio.
     * @param mensaje mensaje a mostrar en caso de error.
     * @return número pedido al usuario.
     */
    public static double ingresarValorNumerico(int n_inicio, String mensaje) {
        double valor;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextDouble()) {
                System.out.println("No ha ingresado un número!");
                entrada.next();
            }
            valor = entrada.nextDouble();
        } while (!(valor > n_inicio));
        return valor;
    }

    /**
     * Función que valida el ingreso de una fecha
     * en el formato DD-MM-AA
     * @param mensaje mensaje mostrado en caso de
     *                fecha incorrecta.
     * @return un objeto fecha con la fecha ingresada por el usuario
     */
    public static Date validarFecha(String mensaje) {
        Date f_retornar = new Date();
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yy");
        System.out.print(mensaje);
        String input = entrada.nextLine();
        if (input.equals("")) {
            return f_retornar;
        } else {
            do {
                try {
                    f_retornar = df.parse(input);
                    break;
                } catch (ParseException e) {
                    System.out.println("Fecha no válida!");
                    System.out.println("Ingrese una fecha valida");
                    input = entrada.nextLine();
                }
            } while (true);
            return f_retornar;
        }
    }

    /**
     * Función que valida el ingreso de los tipos de carros
     * soportados por este sistema.
     * @param tipos recibe una lista con los tipos soportados.
     * @return cadena con el tipo especificado por el usuario.
     */
    public static String validarTipoVehiculo(ArrayList<String> tipos) {
        // TODO: Mejorar esta nota.
        Scanner sc = new Scanner(System.in);
        do {
            String tipo = sc.nextLine();
            if (tipos.contains(tipo)) {
                return tipo;
            }
        } while (true);
    }
    
 
    
    /**
     * Valida el tipo de vendedor que se ingresa entre los posibles
     * @param tipo Arreglo de strings donde estan los tipos de vendedores
     * posibles
     * @return String con el tipo de vendedor
     */
    public static String validarTipoVendedor(ArrayList<String> tipo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vendedor de los siguientes tipos:");
        System.out.println("Junior, semi senior y Senior");
        String cadena;
        boolean terminar = false;
        do {
            cadena = sc.nextLine();
            if (tipo.contains(cadena.toLowerCase()))
                terminar = true;
            else {
                System.out.println("Ingrese un tipo de vendedor!");
            }
        } while (!terminar);
        return cadena.toLowerCase();
    }
    
    
    /**
     * Función que valida que el usuario
     * ingrese un número de teléfono válido.
     *
     * @return verdadero si es válido, falso de otra manera.
     */
    public static String ingresarTelefonoValido() {
        final Pattern patt = Pattern.compile("[0-9]+");
        Scanner scanner = new Scanner(System.in);
        String tel;
        tel = scanner.nextLine();
        while (!patt.matcher(tel).matches()) {
            System.out.println("Ingrese un número de teléfono correcto!");
            tel = scanner.nextLine();
        }
        return tel;
    }
    
    /**
     * Metodo que verifica si el id del cliente y vendedor se encuentran en el registro
     * @param clientes registro de clientes del sistema
     * @param vendedores registro de vendedores del sistema
     * @param mensaje1 mensaje para ingresar el cliente
     * @param mensaje2 mensaje para ingresar el vendedor
     * @return Arreglo que contiene el cliente, el vendedor y un booleano como verificacion
     * de que se encuentran en el sistema
     */
    public static ArrayList<Object> ValidarActores(ArrayList<Cliente> clientes,ArrayList<Vendedor> vendedores,String mensaje1,String mensaje2){
        ArrayList<Object> act=new ArrayList<>();
        Scanner id=new Scanner(System.in);
        System.out.println(mensaje1);
        String id_cliente=id.next();
        act.ensureCapacity(3);
        boolean existe_cliente=false;
        boolean existe_vendedor=false;
        for(int i=0;i<clientes.size();i++){
            if(id_cliente.equals(clientes.get(i).getNumid())){
                existe_cliente= true;
                act.add(0, clientes.get(i));
            }
        }
        if (!existe_cliente) {
            act.add(0, null);
        }
        System.out.println(mensaje2);
        String id_vendedor=id.next();
        for(int i=0;i<vendedores.size();i++){
            if(id_vendedor.equals(vendedores.get(i).getNumid())){
                existe_vendedor= true;
                act.add(1, vendedores.get(i));
            }
        }
        if (!existe_vendedor) {
            act.add(1, null);
        }
        if (existe_cliente && existe_vendedor) {
            act.add(2, true);
        }
        else{
            act.add(2, false);
        }
        return act;         
    }
}
