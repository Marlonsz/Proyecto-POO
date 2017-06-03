/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */

import java.util.*;

/**
 * Esta clase contiene métodos static, los cuáles representan
 * las diferentes opciones de menú que el usuario podrá visualizar en
 * la ejecución del programa. Además de un método que valida el ingreso
 * de las opciones en los diferentes menú y un método que valida el
 * ingreso correcto de un nombre de un archivo de texto, el cual debe
 * tener una extensión .txt.
 * @author Luis Moya, Leiber Rivas, Marlon Segarra.
 */

public class Menú {
    
    /**
     * Permite mostrar las opciones del menú principal.
     */
    public static void mostrarMenuPrincipal(){
        System.out.println(Color.VERDE+"\n\t\t¡Bienvenido a nuestro patio de compra/venta de vehículos"
                + " de sentimientos!"+Color.NEGRO+"\n");
        System.out.println("\t1. Ingreso de vehículos al patio y sus datos\n"
                + "\t2. Ingreso de datos del cliente\n"
                + "\t3. Ingreso de datos de vendedores\n" 
                + "\t4. Venta de vehículo\n" 
                + "\t5. Reporte de Vehículos\n"
                + "\t6. Reporte de clientes y vehículos adquiridos\n" 
                + "\t7. Reporte de vendedores y vehículos vendidos\n" 
                + "\t8. Salir\n");
        System.out.println(Color.AZUL+"\t¿Que desea hacer?"+Color.NEGRO);
    }//Cierre del método.
    
    /**
     * Permite validar el ingreso de enteros en un rango de valores,
     * lo cuál es útil para validar el ingreso de opciones en los diferentes
     * menú del programa.
     * @param limitInf Entero mínimo que se puede ingresar.
     * @param limitSup Entero máximo que se puede ingresar.
     * @param mensaje Mensaje que indica lo que representa el entero a ingresar.
     * @return Entero entre el rango de valores dado como parámetro.
     */
    public static int ingresarOpcion(int limitInf, int limitSup, String mensaje){
        /*
        Inicializacion de un objeto escaner para el ingreso de datos
        */
        Scanner escaner = new Scanner (System.in);
        escaner.useLocale(Locale.US);
        escaner.useDelimiter("\n");
        /*
        Opción que será retornada y estará entre el límite dado
        */
        int opcion = -1;
        /*
        Se le solicitará una opción al usuario hasta que la misma sea de tipo
        entero y se encuentre en el intervalo dado como límite.
        */
        do{
            System.out.print(Color.AZUL+mensaje+(char)27+Color.NEGRO);
            String cad_opcion = escaner.next();
            try{
                if(Integer.parseInt(cad_opcion) >= limitInf && Integer.parseInt(cad_opcion) <= limitSup)
                    opcion=Integer.parseInt(cad_opcion);
            }
            catch(NumberFormatException e){
                System.out.println(Color.ROJO+"TIPO DE DATO NO VÁLIDO"+Color.NEGRO);
            }
        }while(opcion == -1);
        return opcion;

    }//Cierre del método. 
}
