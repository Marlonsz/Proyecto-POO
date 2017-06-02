/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehículos;

/**
 *
 * @author Marlon
 */
public class Camiones extends Vehiculo{
    /*Poner 2 atributos unicos de una camioneta*/
    private int numruedas;
    public Camiones(String marca, String modelo, String fechafab, int numchasis, int nummotor, String propietario, int cilindraje, double precsug, String fing, String fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
    }

    public Camiones(int numruedas, String marca, String modelo, String fechafab, int numchasis, int nummotor, String propietario, int cilindraje, double precsug, String fing, String fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.numruedas = numruedas;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }
    
}
