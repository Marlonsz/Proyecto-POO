/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Vendedor;

/**
 *
 * @author Marlon
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String numid;
    private String tel;
    private String pais;
    private String ciudad;
    private String calle;
    private String sector;
    private String numviv;
    private String fechaIng;
    private String vad;

    public Cliente(String nombre, String apellidos, String numid, String tel, String pais, String ciudad, String calle, String sector, String numviv, String fechaIng, String vad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numid = numid;
        this.tel = tel;
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.sector = sector;
        this.numviv = numviv;
        this.fechaIng = fechaIng;
        this.vad = vad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getVad() {
        return vad;
    }

    public void setVad(String vad) {
        this.vad = vad;
    }
    
}
