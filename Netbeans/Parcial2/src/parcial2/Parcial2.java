
package parcial2;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
 *
 * @author USUARIO
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random ();
      String arr [] = {"434","dssd","dss"};
        System.out.println("array mostrado"+Arrays.toString(arr));
        int random1 = 3+(ran.nextInt(3));
        for(int c=0; c<100;c++){
            random1 = 3+(ran.nextInt(3));
            System.out.println(c+"random="+random1);
            ////////////////////////
            BufferedReader hola = new BufferedReader(new InputStreamReader(System.in));
            Stack<String> pila = new Stack<>();
            ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue<String>();
     
        
        }
    }
    
}
