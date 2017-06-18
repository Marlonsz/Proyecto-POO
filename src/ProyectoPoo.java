import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.Vendedor;
import Vehículos.Automovil;
import Vehículos.Camion;
import Vehículos.Camioneta;
import Vehículos.Moto;

import java.util.ArrayList;


/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    
    
    public static void main(String[] args) {
        //TODO: Terminar el main.
        Patio p_automotor = new Patio(15);
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("otros");
        boolean continuar = true;
        while (continuar) {
            System.out.println("----------------------------------------------------");
            int respuesta = UI.imprimirMenuPrincipal();
            System.out.println(respuesta);
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
                            Camion ca = UI.imprimirMenuIngresoCamion(dc);
                            p_automotor.ingresarVehículo(ca);
                            break;

                        case "motos":
                            ArrayList<Object> mo = UI.ingresoDatos();
                            Moto m = UI.imprimirMenuIngresoMotos(mo);
                            p_automotor.ingresarVehículo(m);
                            break;
                        case "camionetas":
                            // Terminar el menu de camionetas, falta 2 atributos
                            ArrayList<Object> cam = UI.ingresoDatos();
                            Camioneta c = UI.imprimirMenuIngresoCamioneta(cam);
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
                    Cliente c=UI.ingresarCliente(p_automotor.getPatio());
                    cliente.add(c);
                    break;
                case 3:
                    Vendedor v=UI.ingresarVendedor();
                    vendedores.add(v);
                    break;
                case 4:
                    UI.Venta(p_automotor.getPatio(), cliente, vendedores);// TODO: Añadir la salida de autos del patio
                    break;
                case 5:
                    Reportes.reporteVehiculosEnPatio(p_automotor);
                    break;
                case 6:
                    Reportes.reporteClientes(cliente);
                    break;
                case 7:
                    Reportes.reporteVendedores(vendedores);// TODO: Reporte de vendedores y los vehículos que han vendido. 
                    break;
                case 8:
                    System.out.println("Gracias por confiar en nuestro sistema!");
                    continuar = false;
                    break;
                default:
                    // En el imposible caso de que salga un número diferente (que ya validamos) sabremos porqué.
                    throw new IllegalArgumentException();
            }
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}
