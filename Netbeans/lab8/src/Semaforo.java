
import java.util.Random;
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
public class Semaforo {

    public static void main(String[] args) {
        double verdeT = Double.parseDouble(args[0]);
        double amarilloT = Double.parseDouble(args[1]);
        
        Interseccion thr = new Interseccion((verdeT*1000), (amarilloT*1000), true);
        Interseccion thr2 = new Interseccion((verdeT*1000), (amarilloT*1000), false);
        thr.start();
        thr2.start();

    }
}
