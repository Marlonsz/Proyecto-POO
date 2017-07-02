import Vehículos.Vehiculo;

import java.util.ArrayList;

/**
 * Created by piero512 on 02/06/17.
 */
public class Patio {
    private final ArrayList<Vehiculo> patio = new ArrayList<>();
    private final int capacidad;

    public Patio(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Vehiculo> getPatio() {
        return patio;
    }

    public boolean ingresarVehículo(Vehiculo vh) {
        if (this.patio.size() < this.capacidad) {
            this.patio.add(vh);
            return true;
        } else {
            System.out.println((Color.ROJO)+"El patio está lleno!");
            return false;
        }
    }

}