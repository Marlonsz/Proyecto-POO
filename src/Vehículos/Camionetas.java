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
public class Camionetas extends Vehiculo{
    /*Poner 2 atributos unicos de una camioneta*/
    private String tipocabina;

    public Camionetas(String marca, String modelo, String fechafab, String numchasis, String nummotor, String propietario, int cilindraje, double precsug, String fing, String fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
    }

    public Camionetas(String tipocabina, String marca, String modelo, String fechafab, String numchasis, String nummotor, String propietario, int cilindraje, double precsug, String fing, String fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario, cilindraje, precsug, fing, fvent);
        this.tipocabina = tipocabina;
    }

    public String getTipocabina() {
        return tipocabina;
    }

    public void setTipocabina(String tipocabina) {
        this.tipocabina = tipocabina;
    }
    
}
