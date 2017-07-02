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
public class Automovil extends Vehiculo {
    //atributos de automovil
    private boolean descapotable;
    private int numPuertas;
    private boolean camParqueo;//cámara de visión trasera para parqueo

    //constructor de automovil
    public Automovil(boolean descapotable, int numPuertas, boolean camParqueo, String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.descapotable = descapotable;
        this.numPuertas = numPuertas;
        this.camParqueo = camParqueo;
    }
  
   
    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isCamParqueo() {
        return camParqueo;
    }

    public void setCamParqueo(boolean camParqueo) {
        this.camParqueo = camParqueo;
    }
 
}
