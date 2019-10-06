/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javam2018
 */
public class Secretaria  extends Persona {
    private String EsatadoCivil;
    private String Nacionalidad;

    public String getEsatadoCivil() {
        return EsatadoCivil;
    }

    public void setEsatadoCivil(String EsatadoCivil) {
        this.EsatadoCivil = EsatadoCivil;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
}
