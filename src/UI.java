import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.UsuarioBuilder;
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
    static int imprimirMenuPrincipal() {

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
    static void imprimirMenuIngresoVehicular() {
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

    /*Ordena el arreglo de vehiculos por fecha de ingreso*/
    @Deprecated
    /*
    Para el  bien de la sanidad mental de todos lo que revisan este código:
    Hay que implementar Comparable en Vehículos.
    O implementar Comparators
    https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
     */
    public static void compare(ArrayList<Vehiculo> vehiculos) {
        Vehiculo aux;
        for (int i = 0; i < vehiculos.size(); i++) {
            for (int j = 1; j < vehiculos.size() - 1; j++) {
                if (vehiculos.get(j).getFecha_ingreso().before(vehiculos.get(i).getFecha_ingreso())) {
                    aux = vehiculos.get(i);
                    vehiculos.remove(i);
                    vehiculos.add(i, vehiculos.get(j));
                    vehiculos.remove(j);
                    vehiculos.add(j, aux);

                }
            }
        }
    }

    /**
     * Realiza la venta del vehículo al cliente llevando un registro y modificando los
     * datos de cada uno
     * @param vehiculo Arreglo con los vehículos que hay en el patio
     * @param cliente Cliente al que se realizará la venta
     * @param vendedor Vendedor que realizará la venta
     */
    public static void Venta(ArrayList<Vehiculo> vehiculo,Cliente cliente,Vendedor vendedor){      
        Vehiculo vh;
        int num=(int)validar.ingresarValorNumerico(1,vehiculo.size(),"Ingrese el numero de vehículos a vender:");
            for(int i = 0; i<num; i++) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Ingrese el numero del " + (i + 1) + " vehiculo vendido: ");
                for (int j = 0; j < vehiculo.size(); j++) {
                    System.out.println((j + 1) + ") " + vehiculo.get(j).toString());
                }
                int op2 =(int) validar.ingresarValorNumerico(1,vehiculo.size(),"Ingrese el número del vehículo adquirido: ");
                System.out.println("");
                cliente.getVh_adq().add(vehiculo.get(op2 - 1));
                vh = vehiculo.get(op2 - 1);
                double precio = PrecioFinal(vh);
                vendedor.setTotcomision(vendedor.getTotcomision() + comisiones(precio, vendedor));
                vendedor.setTotventas(vendedor.getTotventas() + 1);
                vendedor.getVh_vendidos().add(vh);
                System.out.println("Ingrese fecha de venta (vacio si hoy): ");
                Date fecha_egreso = validar.validarFecha("Ingrese fecha de egreso: ");
                vh.setFecha_venta(fecha_egreso);
                vehiculo.remove(vh);
   }
 }

    /*
    *Se asigna la comisión al vendedor, la fecha de salida del vehículo
    y se retira el vehículo del patio
    */

    /**
     * Calcula el precio final del vehículo dependiendo del tipo
     * @param vh Vehículo que se va a vender
     * @param v Vendedor que realiza la venta
     * @return El precio final del vehículo
     */
    public static double PrecioFinal(Vehiculo vh){
        if(vh instanceof Automovil){
            return (vh.getPrecio_sugerido()*0.05)+500+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Camioneta){
            return (vh.getPrecio_sugerido()*0.1)+700+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Camion){
            return (vh.getPrecio_sugerido()*0.15)+850+vh.getPrecio_sugerido();
        }
        else if(vh instanceof Moto){
            return (vh.getPrecio_sugerido()*0.025)+200+vh.getPrecio_sugerido();
        }
        else {
            return (vh.getPrecio_sugerido()*0.025)+250+vh.getPrecio_sugerido();
        }
        
    }

    /**
     * Calcula la comisión del vendedor
     * @param preciofinal Precio final del vehículo a vender
     * @param v Vendedor que realiza la venta
     * @return La comisión que recibe el vendedor por dicha venta
     */
    public static double comisiones(double preciofinal,Vendedor v){
        if("junior".equals(v.getTipo())){
            return preciofinal*0.03;
        }
        else if("semi senior".equals(v.getTipo())){
            return preciofinal*0.06;
        }
        else{
            return preciofinal*0.1;
        }
    }
}
