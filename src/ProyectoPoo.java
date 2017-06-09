import Vehículos.Automovil;
import Vehículos.Camiones;
import Vehículos.Camionetas;
import Vehículos.Motos;

import java.util.ArrayList;


/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    public static void main(String[] args) {
        //TODO: Terminar el main.
        Patio p_automotor = new Patio(15);

        System.out.println("----------------------------------------------------");
        int respuesta = UI.imprimirMenuPrincipal();
        System.out.println(respuesta);
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("otros");

        while (respuesta!=8){
            switch (respuesta) {
                case 1:
                    UI.imprimirMenuIngresoVehicular();
                    String tipo = UI.ingresarTipoVehiculo(tipos);
                    switch (tipo) {
                        case "automovil":
                            ArrayList<Object> datos_comunes = UI.ingresoDatos();
                            Automovil vh = UI.imprimirMenuIngresoAutomovil(datos_comunes);
                            p_automotor.ingresarVehículo(vh);
                            break;
                        case "camiones":
                            ArrayList<Object> dc = UI.ingresoDatos();
                            Camiones ca = UI.imprimirMenuIngresoCamiones(dc);
                            p_automotor.ingresarVehículo(ca);
                            break;

                        case "motos":
                            ArrayList<Object> mo = UI.ingresoDatos();
                            Motos m = UI.imprimirMenuIngresoMotos(mo);
                            p_automotor.ingresarVehículo(m);
                            break;
                        case "camionetas":
                            // Terminar el menu de camionetas, falta 2 atributos
                            ArrayList<Object> cam = UI.ingresoDatos();
                            Camionetas c = UI.imprimirMenuIngresoCamionetas(cam);
                            p_automotor.ingresarVehículo(c);
                            break;
                        case "otros":
                            // Terminar el menu de motos, falta 3 atributos
                            ArrayList<Object> otros = UI.ingresoDatos();
                            Automovil o = UI.imprimirMenuIngresoAutomovil(otros);
                            p_automotor.ingresarVehículo(o);
                            break;
                        default:
                            // Asi vemos si las validaciones sirven.
                            throw new IllegalArgumentException();
                    }
                    break;
                case 2:
                    UI.ingresarCliente();
                    break;
                case 3:
                    UI.ingresarVendedor();
                    break;
                case 4:
                    // TODO: Añadir la salida de autos del patio
                    break;
                case 5:
                    /* TODO: Reporte de vehículos actualmente en el patio, 
                    ordenados por fecha de ingreso 
                    */
                    break;
                case 6:
                    /* TODO:Reporte de clientes y los vehículos que han 
                    adquirido en el caso de que hayan comprado alguno, 
                    el mismo que se debe ordenar por país, ciudad del cliente 
                    */
                    break;
                case 7:
                    // TODO: Reporte de vendedores y los vehículos que han vendido. 
                    break;
                case 8:
                    System.out.println("Gracias por confiar en nuestro sistema!");
                    System.exit(0);
                default:
                    // En el imposible caso de que salga un número diferente (que ya validamos) sabremos porqué.
                    throw new IllegalArgumentException();
            }
            System.out.println("-----------------------------------------------------------------------");
            respuesta = UI.imprimirMenuPrincipal();

        }
    }
}
