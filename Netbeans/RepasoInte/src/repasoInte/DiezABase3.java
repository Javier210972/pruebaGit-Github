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
public class DiezABase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner binario = new Scanner(System.in);
        
        
        int numero;
        int resultado;
        int residuo;
        int finalCiclo;
        String cadena;
        String acumulador="";
        
        System.out.println("Ingrese un numero");
        numero = binario.nextInt();
        
        finalCiclo = numero;
        
        for (int i = 1; i<=finalCiclo; i++) {
            resultado=numero/3;
            residuo=numero%3;
            numero=resultado;
            cadena = String.valueOf(residuo);
            System.out.println(cadena);
            
            acumulador = cadena + acumulador;
            if (numero==0) {
                i = finalCiclo+1;
            }
            
        }
            
        System.out.println("Numero convertido: " + acumulador);
                  
        
    }
}