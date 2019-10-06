/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoInte;

import java.util.Scanner;

/**
 *
 * @author redes
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Solucion = new Scanner(System.in);
        int vf;
        System.out.println("Ingrese valor");
        vf = Solucion.nextInt();
        for (int i = 1; i <= vf; i++) {

            System.out.print(i);
            if (i < vf) {
                System.out.print(",");
            }
           
            //solucion del problema 1,3,6,8
           /*
            Scanner Solucion = new Scanner(System.in);
            int vf;
                System.out.println("Ingrese valor");
                vf = Solucion.nextInt();
                for (int i = 1; i <= vf; i++) {
                    
                    System.out.print(i);
                    if(i<vf)
                    {
                        System.out.print(",");
                    }
        */
                //tres
//                Scanner tabla = new Scanner(System.in);
//               int numero;
//               
//                  System.out.println("Ingrese un numero para multiplicarlo");
//            numero=tabla.nextInt();
//                  for (int i=1; i <= 10; i++) {
//             
//                System.out.println(i+"x"+numero+"="+i*numero);
//                
//           }

//seis -- mostrar largo de string y caracter
// String text;
//        String C;
//        int largo;
//        text = numero.nextLine();
//        largo = text.length();
//
//         //C2 = text.substring(0,1);
//        C = text.substring(largo - 1, largo);
//        System.out.println("el largo de texto es de: " + largo);
//        System.out.println("el ultimo caracter es: " + C);

// CICLO INVERTIDO
//for (i = 3; i >= 0; i--) {
//
//            System.out.println(i);
//
//        }


//CICLO NORMAL
//for (i = 0; i <= 3; i++) {
//
//            System.out.println(i);
//
//        }

//CICLOS DECRECIENTE
//System.out.println("decreciente ");
//        for (int j = texto.length()-1; j >= 0; j--) {
//         letra=texto.substring(j,j+1);
//            System.out.println(letra);
//        }

                }
            
            }}
        
    
    

