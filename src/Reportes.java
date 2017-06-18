import Cliente_Vendedor.Cliente;
import Cliente_Vendedor.Vendedor;
import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by piero512 on 16/06/17.
 */
public class Reportes {
    /**
     * Función que tomando los vehículos del patio,
     * genera un reporte.
     *
     * @param p Objeto patio que alberga un arreglo de vehículos.
     */
    public static void reporteVehiculosEnPatio(Patio p) {
        ArrayList<Vehiculo> vehiculos = p.getPatio();
        Collections.sort(vehiculos,comparatorvh);
        for (Vehiculo vh : vehiculos) {
            System.out.print(vh.toString());

        }

    }
    /**
     * Crea el reporte de vendedores con sus unidades vendidas
     * @param vendedores  Lista con los vendedores de la concesionaria
     */
    public static void reporteVendedores(ArrayList<Vendedor> vendedores){
        for(Vendedor v:vendedores){
            System.out.println(v.toString());           
        }
    }
    /**
 * Compara los clientes por su pais y su ciudad
 */
public static Comparator<Cliente> comparator = new Comparator<Cliente>() {
    public int compare( Cliente a, Cliente b ) {
        int resultado = a.getPais().compareTo( b.getPais());
        if ( resultado != 0 ) { return resultado; }
        resultado = a.getCiudad().compareTo(b.getCiudad()); 
        if ( resultado != 0 ) { return resultado; }
       
        return resultado;
    }
};

/**
 * Compara los vehículos por su fecha de ingreso
 */
public static Comparator<Vehiculo> comparatorvh = new Comparator<Vehiculo>() {
    public int compare( Vehiculo a, Vehiculo b ) {
        int resultado = a.getFecha_ingreso().compareTo( b.getFecha_ingreso());
        if ( resultado != 0 ) { return resultado; }
        
       
        return resultado;
    }
};
/**
 * Crea el reporte de clientes ordenado por pais y ciudad mostrando los vehiculos comprados
 * @param clientes Arreglo de clientes que tiene la concesionaria
 */
public static void reporteClientes(ArrayList<Cliente> clientes){
        Collections.sort(clientes,comparator);
        for (Cliente c : clientes) {
            System.out.print(c.toString());

        }
    }

}
