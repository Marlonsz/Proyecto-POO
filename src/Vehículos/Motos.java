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
public class Motos extends Vehiculo {
    private String tipo;//tipo de moto
    private String sistArr; //Sistema de arranque-electrico,pedal,etc
    private String transmision;//tipo de transmision -cadena,correa,cardan
    public Motos(String tipo,String sistArr, String transmision,String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSistArr() {
        return sistArr;
    }

    public void setSistArr(String sistArr) {
        this.sistArr = sistArr;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
}
