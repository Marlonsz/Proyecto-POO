/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehículos;


import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Marlon
 */
public class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private Date fechafab;
    private String numchasis;
    private String nummotor;
    private String propietario;
    private double cilindraje;
    private double precio_sugerido;
    private Date fecha_ingreso;
    private Date fecha_venta;


    public Vehiculo(String marca, String modelo, Date fechafab, String numchasis, String nummotor, String propietario, double cilindraje, double precio_sugerido, Date fecha_ingreso, Date fecha_venta) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechafab = fechafab;
        this.numchasis = numchasis;
        this.nummotor = nummotor;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.precio_sugerido = precio_sugerido;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_venta = fecha_venta;
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

    public double getPrecio_sugerido() {
        return precio_sugerido;
    }

    public void setPrecio_sugerido(double precio_sugerido) {
        this.precio_sugerido = precio_sugerido;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public int compareTo(Vehiculo vh) {
        /*
        Comparación por defecto: Comparar por fecha para ordenar.
         */
        return (this.fecha_ingreso.compareTo(vh.fecha_ingreso));
    }
    @Override
    public String toString() {
        return String.format("Marca: %s%n Modelo: %s%n", this.marca, this.modelo)+
                String.format("Fecha de fabricación: %s", this.fechafab.toString()) +
                String.format("%nDatos del vehículo: %nNúmero de chasis: %s%nNúmero del motor: %s%n", this.numchasis, this.nummotor) +
                String.format("Propietario: %s%n", (this.propietario.equals("") ? "Parque automotor" : this.propietario)) +
                String.format("Cilindraje: %.2fL%n", this.cilindraje) +
                String.format("Precio sugerido: %.2f%n", this.precio_sugerido) +
                String.format("Fecha de ingreso: %s%n", this.fecha_ingreso.toString()) +
                String.format("Fecha de venta: %s%n", (this.fecha_venta == null) ? "No se ha vendido" : this.fecha_venta.toString());
    }
    
    
}
