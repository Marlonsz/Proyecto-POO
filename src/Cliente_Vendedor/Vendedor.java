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
public class Vendedor extends Usuario {
    private String tipo;
    private int totventas;
    private int totcomision;
    private ArrayList<Vehiculo> vh_vendidos = new ArrayList<>();

    public Vendedor(String nombre, String apellidos, String numid, String tel, String tipo, int totventas, int totcomision) {
        super(nombre, numid, tel, apellidos);
        this.tipo = tipo;
        this.totventas = totventas;
        this.totcomision = totcomision;
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

    public int getTotcomision() {
        return totcomision;
    }

    public void setTotcomision(int totcomision) {
        this.totcomision = totcomision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehículos vendidos: ");
        for (Vehiculo vh : this.vh_vendidos) {
            sb.append(vh.toString());
            sb.append("\n");
        }
        return "Vendedor: \n" + super.toString() + sb.toString();
    }
    
}
