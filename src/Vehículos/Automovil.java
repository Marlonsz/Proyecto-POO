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
    private String tipo;//Deportivo, clasico,etc
    private int numPuertas;
    private boolean camParqueo;//cámara de visión trasera para parqueo
    public Automovil(String tipo, int numPuertas, boolean camParqueo, String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.tipo = tipo;
        this.numPuertas = numPuertas;
        this.camParqueo = camParqueo;
    }
  
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
