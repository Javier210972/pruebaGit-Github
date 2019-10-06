import java.util.Scanner;
import java.text.DecimalFormat;
public class Taquilla {
public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
System.out.println("Lab #1 - Ejercicio #2\n" +
        "-----------------------");
System.out.print("\nIngrese Edad: ");
double precio = 0.00;
int edad = scanner.nextInt();
if(edad>=0 && edad<=10){
precio = 15.00;

}
else if(edad>=11 && edad<=18){
precio = 20.00;

}
else if(edad>=19 && edad<=59){
precio = 35.00;

}
else if(edad>=60){
precio = 20.00;

}

    System.out.println("\nPrecio: Q"+precio+"0");




}


}