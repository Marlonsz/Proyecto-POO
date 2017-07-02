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
    //atributos de otro
    private int numEje;//número de ejes
    private int numAsientos;
    private String tipoDireccion;//Mecánicos -cremallera, Hidráulicos, Hidráulico-electrónicos

    //onstructor de moto
    public Otro(int numEje,int numAsientos, String tipoDireccion,String marca, String modelo, Date fechafab, String numchasis,
                String nummotor, String propietario,
                double cilindraje, double precsug, Date fing,
                Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario,
        cilindraje, precsug, fing, fvent);
        this.numEje=numEje;
        this.numAsientos=numAsientos;
        this.tipoDireccion=tipoDireccion;
    }

    public int getNumEje() {
        return numEje;
    }

    public void setNumEje(int numEje) {
        this.numEje = numEje;
    }

    public int getNumAsientos() { return numAsientos;}

    public void setNumAsientos(int numAsientos) {this.numAsientos = numAsientos;}

    public String getTipoDireccion() {return tipoDireccion;}

    public void setTipoDireccion(String tipoDireccion) {this.tipoDireccion = tipoDireccion;}
}
