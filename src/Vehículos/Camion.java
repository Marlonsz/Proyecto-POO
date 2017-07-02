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
public class Camion extends Vehiculo {
    //atributos de camion
    private int numruedas;
    private double capCarga;//capacidad de carga
    private boolean rasSat;//rastreo satelital 

    //constructor de camion
    public Camion(int numruedas, double capCarga, boolean rasSat, String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.numruedas = numruedas;
        this.capCarga = capCarga;
        this.rasSat = rasSat;
    }
    
    public double getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }

    public boolean isRasSat() {
        return rasSat;
    }

    public void setRasSat(boolean rasSat) {
        this.rasSat = rasSat;
    }

    

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }
    
}
