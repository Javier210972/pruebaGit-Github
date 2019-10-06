
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterseccionPrueba extends Thread {

    public ArrayList<String> semaforo;

    public InterseccionPrueba() {
        super();
        semaforo = new ArrayList<String>();
        
    }

    

    public ArrayList shuffe(ArrayList lista) {

        Random ran = new Random();
        for (int c = 0; c < lista.size(); c++) {
            int aleatorio = ran.nextInt(lista.size());
            String a =  (String) lista.get(c);
            lista.set(c, lista.get(aleatorio));
            lista.set(aleatorio, a);

        }
        return lista;

    }
     @Override
    public synchronized void  start() {
        super.start();
        System.out.println("inicienado");
    }

    @Override
    public void run() {
         
     
    
    
    }
}
