
import java.util.Scanner;

/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        int opcionPrincipal;
        int opcionMenu;
        do{
            Menú.mostrarMenuPrincipal();
            opcionPrincipal = Menú.ingresarOpcion(1, 8, "Ingrese opción:");
            switch(opcionPrincipal){
                case 1:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 2:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 3:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                
                case 4:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 5:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 6:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 7:
                    do{
                    System.out.println("\n\t1. Ingresar archivo\n\t2. Retroceder");
                        opcionMenu = Menú.ingresarOpcion(1, 2, "Ingrese opción:");
                        if(opcionMenu == 1){
                            
                        }
                        else{
                            System.out.print("\nPRESIONE CUALQUIER TECLA PARA VOLVER AL MENÚ PRINCIPAL\n");
                            keyboard.next();
                        }
                    }while(opcionMenu != 2);
                    break;
                    
                case 8:
                    System.out.println("\n\n"+Color.VERDE+"¡Gracias por visitarnos! =D"+Color.NEGRO+"\n");
                    break;
                    
                
            }
        

    }while(opcionPrincipal != 8);
}
}