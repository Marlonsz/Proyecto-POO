import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.UsuarioBuilder;
import Cliente_Vendedor.Vendedor;
import Entrada.validar;
import Vehículos.*;

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
        ArrayList<String> clases=new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("moto");
        tipos.add("otros");
        clases.add("junior");
        clases.add("semi senior");
        clases.add("senior");
        boolean continuar = true;
        while (continuar) {
            System.out.println("----------------------------------------------------");
            int respuesta = UI.imprimirMenuPrincipal();
            System.out.println(respuesta);
            switch (respuesta) {
                case 1:
                    UI.imprimirMenuIngresoVehicular();
                    String tipo = VehiculoBuilder.ingresarTipoVehiculo(tipos);
                    switch (tipo) {
                        case "automovil":
                            ArrayList<Object> datos_comunes = VehiculoBuilder.ingresoDatos();
                            Automovil vh = VehiculoBuilder.imprimirMenuIngresoAutomovil(datos_comunes);
                            p_automotor.ingresarVehículo(vh);
                            break;
                        case "camiones":
                            ArrayList<Object> dc = VehiculoBuilder.ingresoDatos();
                            Camion ca = VehiculoBuilder.imprimirMenuIngresoCamion(dc);
                            p_automotor.ingresarVehículo(ca);
                            break;

                        case "moto":
                            ArrayList<Object> mo = VehiculoBuilder.ingresoDatos();
                            Moto m = VehiculoBuilder.imprimirMenuIngresoMotos(mo);
                            p_automotor.ingresarVehículo(m);
                            break;
                        case "camionetas":
                            ArrayList<Object> cam = VehiculoBuilder.ingresoDatos();
                            Camioneta c = VehiculoBuilder.imprimirMenuIngresoCamioneta(cam);
                            p_automotor.ingresarVehículo(c);
                            break;
                        case "otros":
                            // Terminar el menu de motos, falta 2 atributos
                            ArrayList<Object> otros = VehiculoBuilder.ingresoDatos();
                            Otro o = VehiculoBuilder.imprimirMenuIngresoOtros(otros);
                            p_automotor.ingresarVehículo(o);
                            break;
                        default:
                            // Asi vemos si las validaciones sirven.
                            throw new IllegalArgumentException();
                    }
                    break;
                case 2:
                    Cliente c = UsuarioBuilder.ingresarCliente();
                    cliente.add(c);
                    break;
                case 3:
                    Vendedor v = UsuarioBuilder.ingresarVendedor(clases);
                    vendedores.add(v);
                    break;
                case 4:
                    if (p_automotor.getPatio().isEmpty()) {
                        System.out.println("No hay vehiculos en el patio...");
                        break;
                    }
                    ArrayList<Object> actores=validar.ValidarActores(cliente, vendedores,"Ingrese el ide del cliente: ","Ingrese el id del vendedor: ");
                    if (!(boolean) actores.get(2)) {
                        System.out.println("id de cliente/vendedor no existe, por favor registre al cliente/vendedor antes de realizar la venta");
                        break;
                    }
                    UI.Venta(p_automotor.getPatio(),(Cliente)actores.get(0),(Vendedor)actores.get(1));
                    break;
                case 5:
                    Reportes.reporteVehiculosEnPatio(p_automotor);
                    break;
                case 6:
                    Reportes.reporteClientes(cliente);
                    break;
                case 7:
                    // TODO: Reporte de vendedores y los vehículos que han vendido.
                    Reportes.reporteVendedores(vendedores);
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
