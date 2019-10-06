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
public class Catedratico extends Persona{
    private String especialidad;
   protected double SueldoBase;
    protected double Bonificacion;
    protected double Sueldoliquido;

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public double getBonificacion() {
        return Bonificacion;
    }

   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoliquido() {
      this.Bonificacion=this.SueldoBase*0.10;
      this.Sueldoliquido=this.SueldoBase+this.Bonificacion;
      
        return Sueldoliquido;
    }
    
    
}
