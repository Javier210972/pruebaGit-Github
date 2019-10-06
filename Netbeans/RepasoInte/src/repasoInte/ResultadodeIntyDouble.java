/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoInte;

import java.io.*;
import java.util.*;

/**
 *
 * @author redes
 */
public class ResultadodeIntyDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
//       Scanner fibo = new Scanner(System.in);
//        int valor1;
//        int valor2;
//        int respuesta;
//        System.out.println("Ingrese");
//        valor1=fibo.nextInt();
//        valor2=valor1/3;
//        respuesta=valor2%2;
//        System.out.println(valor2);
        
        Scanner fibo = new Scanner(System.in);
//        double valor1;
//        double valor2;
//        double respuesta;
//        System.out.println("Ingrese");
//        valor1=fibo.nextInt();
//        valor2=valor1/3;
//        respuesta=valor2%2;
//        System.out.println(respuesta);
 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
 String hola = teclado.readLine();
 
 int convertido = Integer.parseInt(hola);
        System.out.println(convertido - 2);
        
 String convertido2 = Integer.toString(convertido);
        System.out.println(convertido2 + 2);

    }
    
}
