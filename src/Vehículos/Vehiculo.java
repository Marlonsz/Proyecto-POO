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
public class Vehiculo {
    private String marca;
    private String modelo;
    private String fechafab;
    private int numchasis;
    private int nummotor;
    private String propietario;
    private int cilindraje;
    private double precsug;
    private String fing;
    private String fvent;

    public Vehiculo(String marca, String modelo, String fechafab, int numchasis, int nummotor, String propietario, int cilindraje, double precsug, String fing, String fvent) {
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

    public String getFechafab() {
        return fechafab;
    }

    public void setFechafab(String fechafab) {
        this.fechafab = fechafab;
    }

    public int getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(int numchasis) {
        this.numchasis = numchasis;
    }

    public int getNummotor() {
        return nummotor;
    }

    public void setNummotor(int nummotor) {
        this.nummotor = nummotor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecsug() {
        return precsug;
    }

    public void setPrecsug(double precsug) {
        this.precsug = precsug;
    }

    public String getFing() {
        return fing;
    }

    public void setFing(String fing) {
        this.fing = fing;
    }

    public String getFvent() {
        return fvent;
    }

    public void setFvent(String fvent) {
        this.fvent = fvent;
    }
    
    
}
