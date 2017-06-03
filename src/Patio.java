import Vehículos.Vehiculo;

import java.util.ArrayList;

/**
 * Created by piero512 on 02/06/17.
 */
public class Patio {
    private ArrayList<Vehiculo> patio = new ArrayList<>();
    private int capacidad;

    public Patio(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean ingresarVehículo(Vehiculo vh) {
        if (this.patio.size() < this.capacidad) {
            this.patio.add(vh);
            return true;
        } else {
            System.out.println("El patio está lleno!");
            return false;
        }
    }

    public boolean retirarVehiculo(String marca, String modelo, String nuevo_propietario) {
        for (Vehiculo vh : this.patio) {
            if (vh.getMarca().equals(marca) && vh.getModelo().equals(modelo)) {
                vh.setPropietario(nuevo_propietario);
                return true;
            }
        }
        return false;
    }
}