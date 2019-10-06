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
public class CatedraticoIngles extends Catedratico{
    private String NivelIdioma;

    public String getNivelIdioma() {
        return NivelIdioma;
    }

    public void setNivelIdioma(String NivelIdioma) {
        this.NivelIdioma = NivelIdioma;
    }
    
    @Override
    public double getSueldoliquido() {
      this.Bonificacion=this.SueldoBase*0.15;
      this.Sueldoliquido=this.SueldoBase+this.Bonificacion;
      
        return Sueldoliquido;
    }
}
