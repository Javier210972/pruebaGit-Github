/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoInte;

import java.util.Scanner;

/**
 *
 * @author toshiba2
 */
public class operacionesaritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Repaso = new Scanner(System.in);
       int Valor1;
       int Valor2;
       
        System.out.println("Ingrese un valor para sacarle RAIZ");
        Valor1=Repaso.nextInt();
        System.out.println("La RAIZ DE "+Valor1+" Es "+ Math.pow(Valor1, 1.0/3));
        System.out.println("");
        //o Importando---> import static java.lang.Math.sqrt;
        
        System.out.println("Ingrese un valor para sacarle POTENCIA");
        Valor1=Repaso.nextInt();
         System.out.println("La POTENCIA DE "+Valor1+" Es "+Math.pow(Valor1,2));
         System.out.println("");
         
         System.out.println("Ingrese un valor para sacarle EXP");
        Valor1=Repaso.nextInt();
         System.out.println("La EXP DE "+Valor1+" Es "+Math.exp(Valor1));
         System.out.println("");
       
         
         System.out.println("Ingrese dos valores para averiguar cual es mayor");
        Valor1=Repaso.nextInt();
        Valor2=Repaso.nextInt();
         System.out.println("El numero mayor es: "+Math.max(Valor1,Valor2));
         System.out.println("");
         
    
    //SIGUIENTE 
    //Transformar numero de double a int o viceversa
   /* int f;
    double g;    
    g= (double)f/5;*/
   
   //SIGUIENTE
   //Cuando se pide que al ingresar una varible acepte decimal
   // a =Ingreso.nextDouble();
    
    //Siguiente
    //MOSTRAR SOLO DETERMINADOS DECIMALES
//System.out.printf("Su promedio es:" + " %.2f ", g); //importante:" %.2f "
    }
    
}
