package Entrada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by piero512 on 3/6/17.
 */
public class validar {
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

    public static double ingresarValorNumerico(int n_inicio, String mensaje) {
        double valor;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextDouble()) {
                System.out.println("No ha ingresado un número!");
                entrada.next();
            }
            valor = entrada.nextInt();
        } while (!(valor > n_inicio));
        return valor;
    }

    public static Date validarFecha() {
        Date f_retornar = new Date();
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yy");
        if (entrada.nextLine().equals(""))
            return f_retornar;

        do {
            try {
                f_retornar = df.parse(entrada.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("Fecha no válida!");
            }
        } while (true);
        return f_retornar;
    }

    public static String validarTipoVehiculo(ArrayList<String> tipos) {
        // TODO: Mejorar esta nota.
        Scanner sc = new Scanner(System.in);
        do {
            String tipo = sc.nextLine();
            if (tipos.contains(tipo)) {
                return tipo;
            } else {
                continue;
            }
        } while (true);
    }
    
}
