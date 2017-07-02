/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Vendedor;
import Vehículos.Vehiculo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marlon
 */
public class Cliente extends Usuario {
    //atributos de cliente
    private String pais;
    private String ciudad;
    private String calle;
    private String sector;
    private String numviv;
    private Date fechaIng;
    private ArrayList<Vehiculo> vh_adq;

    /**
     * Constructor de cliente:
     *
     * @param nombre    del cliente
     * @param apellidos del cliente
     * @param numid     # de cédula del cliente
     * @param tel       # de teléfono del cliente
     * @param pais      País del cliente.
     * @param ciudad    Ciudad del cliente
     * @param calle     Calle
     * @param sector    Sector
     * @param numviv    Número de la villa
     * @param fechaIng  Fecha de ingreso al sistema
     * @param vh_adq    Vehículos comprados por el cliente.
     */
    public Cliente(String nombre, String apellidos, String numid, String tel, String pais, String ciudad, String calle, String sector, String numviv, Date fechaIng, ArrayList<Vehiculo> vh_adq) {
        super(nombre, apellidos, numid, tel);
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.sector = sector;
        this.numviv = numviv;
        this.fechaIng = fechaIng;
        this.vh_adq = vh_adq;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNumviv() {
        return numviv;
    }

    public void setNumviv(String numviv) {
        this.numviv = numviv;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public ArrayList<Vehiculo> getVh_adq() {
        return vh_adq;
    }

    public void setVh_adq(ArrayList<Vehiculo> vh_adq) {
        this.vh_adq = vh_adq;
    }

    /**
     * Función que retorna una representación en
     * String del Objeto: Muestra los atributos no comunes.
     * @return String con datos del objeto.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("País: %s%n", this.pais));
        sb.append(String.format("Ciudad: %s%n", this.ciudad));
        sb.append(String.format("Dirección: %s %s %s%n", this.sector, this.calle, this.numviv));
        sb.append(String.format("Fecha de ingreso: %s%n", this.fechaIng.toString()));
        sb.append(String.format("Vehículos comprados: %n"));
        for (Vehiculo vh : this.vh_adq) {
            sb.append(vh.toString());
            sb.append("\n");
        }
        return "============Cliente========== \n" + super.toString() + sb.toString();
    }
    
}
