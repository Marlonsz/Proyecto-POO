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
public class Vehiculo {
    private String marca;
    private String modelo;
    private Date fechafab;
    private String numchasis;
    private String nummotor;
    private String propietario;
    private double cilindraje;
    private double precsug;
    private Date fing;
    private Date fvent;

    public Vehiculo(String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precsug, Date fing, Date fvent) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechafab = fechafab;
        this.numchasis = numchasis;
        this.nummotor = nummotor;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.precsug = precsug;
        this.fing = fing;
        this.fvent = fvent;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechafab() {
        return fechafab;
    }

    public void setFechafab(Date fechafab) {
        this.fechafab = fechafab;
    }

    public String getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(String numchasis) {
        this.numchasis = numchasis;
    }

    public String getNummotor() {
        return nummotor;
    }

    public void setNummotor(String nummotor) {
        this.nummotor = nummotor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecsug() {
        return precsug;
    }

    public void setPrecsug(double precsug) {
        this.precsug = precsug;
    }

    public Date getFing() {
        return fing;
    }

    public void setFing(Date fing) {
        this.fing = fing;
    }

    public Date getFvent() {
        return fvent;
    }

    public void setFvent(Date fvent) {
        this.fvent = fvent;
    }
    
    
}
