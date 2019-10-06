import java.util.Scanner;

public class NewCitizen {
public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
System.out.println("Lab #1 - Ejercicio #1\n" +
        "-----------------------");
System.out.print("\nIngrese Apellido de Padre: ");
String apellidoP = scanner.nextLine();
System.out.print("Ingrese Apellido de Madre: ");
String apellidoM = scanner.nextLine();
System.out.print("Ingrese Primer Nombre: ");
String primerN = scanner.nextLine();
System.out.print("Ingrese Segundo Nombre: ");
String segundoN = scanner.nextLine();
System.out.print("Ingresar fecha de nacimiento (dd-mm-aaaa): ");
String fecha = scanner.nextLine();
String id = primerN.substring(0,1)+segundoN.substring(0,1)+apellidoP.substring(0,1)+apellidoM.substring(0,1);
fecha= fecha.substring(0,2)+"-"+fecha.substring(3,5)+"-"+fecha.substring(6,10);
System.out.println("");
System.out.println("Nombre: "+apellidoP +" "+ apellidoM + ", "+primerN+" "+segundoN);
System.out.println("Nacimiento: "+fecha);
System.out.println("Iniciales: "+id);
System.out.println("ID: "+id+"-"+fecha.substring(6,10));





}


}