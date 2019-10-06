/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import modelo.Secretaria;

/**
 *
 * @author javam2018
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       repaso
//        Persona clon= new Persona();
//         Persona clon2= new Persona("soyla", "soy", "12", 0, "fd");
//        clon.setNombre("Soyla");
//        clon.setApellido("sd");
//        
//        System.out.println("Datos clon2");
//        System.out.println("CUI: "+clon2.getCui()+"Nombre: "+clon2.getNombre());
//        System.out.println("datos clon");
//        System.out.println("CUI: "+clon.getCui()+"Nombre: "+clon.getNombre());
       

//HERENCIA
Secretaria sec = new Secretaria();
sec.setNombre("MANU");
        System.out.println(sec.getNombre());

//Catedratico cate = new Catedratico();
//cate.setNombre("Manuel");
//
//Estudiante estudiante = new Estudiante();
//estudiante.setNombre("ma");
//
//CatedraticoIngles cating = new CatedraticoIngles();
//cating.setNombre("Man");
//cating.setEspecialidad("ingles");
//cating.setNivelIdioma("Avanzado");

//polimorfismo
//        Catedratico cate= new Catedratico();
//         cate.setSueldoBase(1000);
//        System.out.println("cate normal: "+cate.getSueldoliquido());
//        
//        CatedraticoIngles cateing = new CatedraticoIngles();
//        cateing.setSueldoBase(1000);
//        System.out.println("cate ing: "+cateing.getSueldoliquido());
//        
//        CatedraticoTic Tic = new CatedraticoTic();
//        Tic.setSueldoBase(1000);
//        System.out.println("cate Tic: "+Tic.getSueldoliquido());

         
    }
    
}
