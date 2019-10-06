import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.*;
public class SemaforoPrueba{
public static void main(String [] args)

{
	//Condicion si el carro es mayor al amarrilo
       
	double tiempo1 = Double.parseDouble(args[0]);
	double tiempo2 = Double.parseDouble(args[1]);
	double tiempo3 = tiempo1 + tiempo2;
        final double salida = tiempo1-1;
	System.out.println(tiempo1);
	System.out.println(tiempo2+1);
	System.out.println(tiempo3);

//random que mete carros a la cola
	Random ran = new Random();
	int cambio = ran.nextInt((int) tiempo1);
	System.out.println("Cambio:"+cambio);

//Primera y segunda cola mas numero y avisar cuando entro
	ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue <String>();
	ConcurrentLinkedQueue<String> cola2 = new ConcurrentLinkedQueue <String>();
	cola.add("dato1");
	cola.add("dato2");
        System.out.println("colaaaa"+cola);
        cola.remove();
        System.out.println("colaaaa"+cola);
	cola2.add("dato2");
	System.out.println(cola+"y"+cola2);

//COLA DINAMICA, CALLE HORIZONTAL AVENIDA VERTICAL, CLASE INTERSECCION CON DOS COLAS
	/*System.out.println(a);
System.out.println("hola");
 for(int counter = 0; counter < args.length; counter++){
            System.out.println("sumar:" + args[counter]+1);}*/  
        

}


}