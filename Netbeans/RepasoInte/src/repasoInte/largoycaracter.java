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
public class largoycaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner numero = new Scanner(System.in);
        System.out.println("ingrese una palabra o numero");
        String text;
        String C;
        int largo;
        text = numero.nextLine();
        largo = text.length();

         //C2 = text.substring(0,1);
        C = text.substring(largo - 1, largo);
        System.out.println("el largo de texto es de: " + largo);
        System.out.println("el ultimo caracter es: " + C);

    }
    
}
