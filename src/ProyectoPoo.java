import Vehículos.Vehiculo;

import java.util.ArrayList;


/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    public static void main(String[] args) {
        //TODO: Terminar el main.
        Patio p_automotor = new Patio(15);
        int respuesta = UI.imprimirMenuPrincipal();
        System.out.println(respuesta);
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("otros");
        switch (respuesta) {
            case 1:
                UI.imprimirMenuIngresoVehicular();
                String tipo = UI.ingresarTipoVehiculo(tipos);
                switch (tipo) {
                    case "automovil":
                        Vehiculo vh = UI.imprimirMenuIngresoAutomovil();
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

}
