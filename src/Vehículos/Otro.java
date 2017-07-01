/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehículos;

import java.util.Date;

/**
 *
 * @author Marlon
 */
public class Otro extends Vehiculo {
    private int numEje;//número de ejes

    public Otro(int numEje,String marca, String modelo, Date fechafab, String numchasis,
                String nummotor, String propietario,
                double cilindraje, double precsug, Date fing,
                Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario,
        cilindraje, precsug, fing, fvent);
        this.numEje=numEje;
    }

    public int getNumEje() {
        return numEje;
    }

    public void setNumEje(int numEje) {
        this.numEje = numEje;
    }
}
