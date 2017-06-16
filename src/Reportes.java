import Vehículos.Vehiculo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by piero512 on 16/06/17.
 */
public class Reportes {

    public static void reporteVehiculosEnPatio(Patio p) {
        ArrayList<Vehiculo> vehiculos = p.getPatio();
        Collections.sort(vehiculos);
        for (Vehiculo vh : vehiculos) {
            System.out.print(vh.toString());

        }

    }

}
