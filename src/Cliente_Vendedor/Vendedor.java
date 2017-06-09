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
public class Vendedor {
    private String nombre;
    private String apellidos;
    private String numid;
    private String tel;
    private String tipo;
    private int totventas;
    private int totcomision;

    public Vendedor(String nombre, String apellidos, String numid, String tel, String tipo, int totventas, int totcomision) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numid = numid;
        this.tel = tel;
        this.tipo = tipo;
        this.totventas = totventas;
        this.totcomision = totcomision;
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

    
    
}
