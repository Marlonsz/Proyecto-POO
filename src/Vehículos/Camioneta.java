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
public class Camioneta extends Vehiculo {
    private String tipocabina;//Regular, SuperCab, Cabina Doble
    private String tipoTraccion;//trasera, delantera o integral
    private boolean balde;


    public Camioneta(String tipocabina, String tipoTraccion, boolean balde,String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.tipocabina = tipocabina;
        this.tipoTraccion=tipoTraccion;
        this.balde=balde;
    }

    public String getTipocabina() {
        return tipocabina;
    }

    public void setTipocabina(String tipocabina) {
        this.tipocabina = tipocabina;
    }

    public String getTipoTraccion() {return tipoTraccion;}

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    public boolean isValde() {
        return balde;
    }

    public void setValde(boolean valde) {
        this.balde = valde;
    }
}
