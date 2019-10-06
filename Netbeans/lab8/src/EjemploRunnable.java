
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class EjemploRunnable implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("que tal");
             i += 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               
            }

        }
    }
    
}
