
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
      ArrayList<Integer> lista = new ArrayList<Integer>();  
      
        lista.add(1);
        lista.add(2);
        lista.add(3);
        shuffle(lista);
        System.out.println(lista);
        
    }
     public static ArrayList shuffle(ArrayList  lista){
         Random ran = new Random();
         for (int c = 0; c < lista.size(); c++) {
             int aleatorio =ran.nextInt(lista.size());
             int a = (int)lista.get(c);
             lista.set(c, lista.get(aleatorio));
            lista.set(aleatorio, a);
       
       
             
         
         
         
         }
    return lista;
         }
         
     

}
