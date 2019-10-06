import java.util.Scanner;

public class Taquilla {
public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
System.out.print("Ingrese Edad: ");
double precio = 0.0;
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
    System.out.printf("Precio: "+"Q"+"%.2f",precio);




}


}