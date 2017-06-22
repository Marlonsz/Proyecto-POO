package Entrada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
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
            if (!(numero >= n_inicio && numero <= n_final))
                System.out.println("El número no está entre las opciones!");
        } while (!(numero >= n_inicio && numero <= n_final));
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
        } while (!(valor > n_inicio && valor < n_final));
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
        } while (!(valor > 0 && valor < 15));
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
    
 
    
    
    public static String validarTipoVendedor(String tipo){
        Scanner sc = new Scanner(System.in);
        List<String> lista_rangos = Arrays.asList("junior", "semi senior", "senior");
        while (!lista_rangos.contains(tipo)) {
            System.out.print("Ingrese tipo de vendedor(Junior/Semi Senior/Senior): ");
            tipo=sc.nextLine().toLowerCase();
        }
        return tipo;
    }
    
    
    /**
     * Función que valida que el usuario
     * ingrese un número de teléfono válido.
     *
     * @param tel número de teléfono.
     * @return verdadero si es válido, falso de otra manera.
     */
    public static boolean esTelefonoValido(String tel) {
        final Pattern patt = Pattern.compile("[0-9]+");
        return patt.matcher(tel).matches();
    }
}
