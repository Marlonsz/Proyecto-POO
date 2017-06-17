import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Collections;

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
        Collections.sort(vehiculos);
        for (Vehiculo vh : vehiculos) {
            System.out.print(vh.toString());

        }

    }

}
