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
public class Base3ADiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner decimal = new Scanner(System.in);
        
        String Binario;
        int largo;
        
        int i;
       
        int exp;
        double operacion;
        double operacion2;
        double suma = 0;
          String digito;
     
// i es posicion de la cadena
        System.out.println("ingrese un numero binario");
        Binario = decimal.nextLine();
        largo = Binario.length();
           exp=largo;
        for (int j = 0; j < largo; j++) {
            exp = exp-1;
            digito=Binario.substring(j,j+1);
            System.out.println(digito);
            if (digito.equals("1")) {
                operacion =Math.pow(3, exp);
                suma = operacion + suma;
            }
            if (digito.equals("2")) {
                operacion =Math.pow((3), exp);
                operacion2=operacion*2;
                suma = operacion2 + suma;
            }
            
            
           // System.out.println(j+","+(j+1)+"  Exponente "+exp);
        
           
            }
        System.out.println(Binario+" Es igual a: "+suma);  
       
//cadena = String.valueOf(residuo);
    }}
