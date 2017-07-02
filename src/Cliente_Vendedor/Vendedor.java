/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Vendedor;

import Vehículos.Vehiculo;

import java.util.ArrayList;

/**
 *
 * @author Marlon
 */
/**
 * Clase para agrupar datos del vendedor
 */
public class Vendedor extends Usuario {
    //atributos de vendedor
    private String tipo;
    private int totventas;
    private double totcomision;
    private ArrayList<Vehiculo> vh_vendidos = new ArrayList<>();

    /**
     * Constructor por defecto de Vendedor.
     * Permite inicializarlo con todos los datos necesarios
     * @param nombre del vendedor
     * @param apellidos del vendedor
     * @param numid # de cédula del vendedor
     * @param tel # de teléfono del vendedor
     * @param tipo del vendedor: Junior, Master, Amateur, etc.
     * @param totventas total de ventas del vendedor
     * @param totcomision total de comisiones del vendedor.
     */

    //DONDE SE LO USA?
    public Vendedor(String nombre, String apellidos, String numid, String tel, String tipo, int totventas, double totcomision) {
        super(nombre,apellidos, numid, tel);
        this.tipo = tipo;
        this.totventas = 0;
        this.totcomision = 0;
    }

    public Vendedor(String nombre, String apellidos, String numid, String tel,String tipo) {
        super(nombre,apellidos, numid, tel);
        this.tipo = tipo;
    }

    public ArrayList<Vehiculo> getVh_vendidos() {
        return vh_vendidos;
    }

    public void setVh_vendidos(ArrayList<Vehiculo> vh_vendidos) {
        this.vh_vendidos = vh_vendidos;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTotventas() {
        return totventas;
    }

    public void setTotventas(int totventas) {
        this.totventas = totventas;
    }

    public double getTotcomision() {
        return totcomision;
    }

    public void setTotcomision(double totcomision) {
        this.totcomision = totcomision;
    }

    /**
     * Método toString del vendedor
     * @return Datos del vendedor en una String.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehículos vendidos: ");
        for (Vehiculo vh : this.vh_vendidos) {
            sb.append(vh.toString());
            sb.append("\n");
        }
        
        return "===========Vendedor=========== \n" + super.toString() + sb.toString()+"\nTipo: "+this.tipo
                +"\nTotal de ventas: "+this.totventas+" \nTotal de comisión: "+this.totcomision;
    }
    
}
