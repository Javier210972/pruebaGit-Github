import java.util.*;

public class OddNumbers {
public static void main(String[] args){
Random random = new Random();    
Scanner scanner = new Scanner (System.in);
System.out.print("Ingrese numero entero: ");
int ran=0;
int i =0;
int numero = scanner.nextInt();
System.out.println("");
    if (numero>1) {
        
        System.out.print("Numeros pares:");
       for(int c = 1 ; c<=numero; c++){
        ran = random.nextInt(101);
        
           if (ran%2==0) {
               System.out.print(ran+" ");
           }
           else {
               i++;
               
           }
        
        }
        
       System.out.println("\nCantidad de numeros impares:"+i);
    }

    else
    {
    
        System.out.println("Número ingresado no válido");
    }
}


}
