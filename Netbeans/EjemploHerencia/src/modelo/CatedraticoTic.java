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
public class CatedraticoTic extends Catedratico{
    @Override
    public double getSueldoliquido() {
      this.Bonificacion=this.SueldoBase*0.20;
      this.Sueldoliquido=this.SueldoBase+this.Bonificacion;
      
        return Sueldoliquido;
    }
    
}
