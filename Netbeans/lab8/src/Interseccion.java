
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interseccion extends Thread {

    public double verdeT;
    public double amarilloT;
    public boolean entrada = false;
    public ConcurrentLinkedQueue<String> cola, cola2;
    public ArrayList<String> semaforo, calle1, calle2;

    public Interseccion(double verdeT, double amarilloT, boolean entrada) {
        super();
        this.verdeT = verdeT;
        this.amarilloT = amarilloT;
        this.entrada = entrada;
        cola = new ConcurrentLinkedQueue<String>();
        cola2 = new ConcurrentLinkedQueue<String>();
        semaforo = new ArrayList<String>();
        calle1 = new ArrayList<String>();
        calle2 = new ArrayList<String>();
    }
//   

//    public synchronized ArrayList shuffe() {
//        semaforo.add("ROJO");
//        semaforo.add("AMARILLO");
//        semaforo.add("VERDE");
//        Random ran = new Random();
//        for (int c = 0; c < semaforo.size(); c++) {
//            int aleatorio = ran.nextInt(semaforo.size());
//            String a = (String) semaforo.get(c);
//            semaforo.set(c, semaforo.get(aleatorio));
//            semaforo.set(aleatorio, a);
//
//        }
//        return semaforo;
//
//    }

    @Override
    public void start() {
        super.start();
        
       
    }

    @Override
    public void run() {
        semaforo.add("VERDE");
        semaforo.add("AMARILLO");
        semaforo.add("ROJO");
       
        while (true) {

            Random ran = new Random();
            int cambio = ran.nextInt((int) verdeT);
            int cambio2 = 0;
            int respuesta = 0;

            if (entrada == true) {

                if (semaforo.contains("VERDE")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR de rojo->verde COLA A");
                    semaforo.remove("VERDE");
                    while (respuesta < this.verdeT) {
                        try {
                            
                            if (!cola.isEmpty()) {
                               cola.remove(); 
                            }

                            System.out.println("carro SALIÓ de cola A, Numeró de carros: " + cola.size());
                            Thread.sleep(cambio);
                            respuesta = (2*cambio) + respuesta;
                            

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }

                    respuesta = 0;
                    semaforo.add("VERDE");
                }
                //////////
                if (semaforo.contains("AMARILLO")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR verde->amarillo COLA A");
                    semaforo.remove("AMARILLO");

                    while (respuesta < this.amarilloT) {
                        try {
                            
                            cola.add("CARROA");
                            System.out.println("carro INGRESO cola A, Numero de carros: "+ cola.size());
                            cambio2 = ran.nextInt((int) verdeT);
                            Thread.sleep(cambio2);
                            respuesta = (2*cambio2) + respuesta;

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }
                    respuesta=0;
                    semaforo.add("AMARILLO");
                }

                ////
                if (semaforo.contains("ROJO")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR amarillo->rojo COLA A");
                    semaforo.remove("ROJO");

                    while (respuesta < (this.amarilloT + this.verdeT)) {
                        try {
                            
                            cola.add("CARROA");
                            System.out.println("carro ingreso cola A, Numeró de carros: " + cola.size());
                            cambio2 = ran.nextInt((int) verdeT);
                            Thread.sleep(cambio2);
                            respuesta = (2*cambio2) + respuesta;

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }
                    respuesta=0;
                    semaforo.add("ROJO");
                }
            }
            if (entrada == false) {

                if (semaforo.contains("ROJO")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR amarillo->rojo COLA B");
                    semaforo.remove("ROJO");

                    while (respuesta < (this.amarilloT + this.verdeT)) {
                        try {
                            
                            cola2.add("CARROB");
                            System.out.println("carro INGRESO cola B, Numero de carros: "+  cola2.size());
                            cambio2 = ran.nextInt((int) verdeT);
                            Thread.sleep(cambio2);
                            respuesta = (2*cambio2) + respuesta;

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }
                    respuesta=0;
                    semaforo.add("ROJO");
                }
                if (semaforo.contains("VERDE")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR rojo->verde COLA B");
                    semaforo.remove("VERDE");

                    while (respuesta < this.verdeT) {
                        try {
                            
                            if (!cola2.isEmpty()) {
                               cola2.remove(); 
                            }
                            System.out.println("carro SALIÓ cola B:, Numero de carros: " + cola2.size());
                            Thread.sleep(cambio);
                            respuesta = (2*cambio) + respuesta;

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }
                    respuesta=0;
                    semaforo.add("VERDE");
                }

                if (semaforo.contains("AMARILLO")) {
                    System.out.println("SEMAFORO CAMBIO DE COLOR verde->amarillo COLA B");
                    semaforo.remove("AMARILLO");

                    while (respuesta < this.amarilloT) {
                        try {
                           
                            cola2.add("CARROB");
                            System.out.println("carro INGRESO cola B, Numero de carros: " + cola2.size());
                            cambio2 = ran.nextInt((int) verdeT);
                            Thread.sleep(cambio2);
                            respuesta =(2*cambio2) + respuesta;

                        } catch (InterruptedException ex) {
                            System.out.println("ERROR" + ex);
                        }

                    }
                    respuesta=0;
                    semaforo.add("AMARILLO");
                }

            }

        }
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(this.num);
//             i += 1;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//               
//            }
//        }
    }
}
