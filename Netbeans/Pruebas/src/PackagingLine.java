
import java.util.Random;
import java.util.Scanner;

public class PackagingLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        Playera playera = new Playera(0, "");
        playera.ingreso();playera.ingreso();playera.ingreso();playera.ingreso();playera.ingreso();
         System.out.println("Esperando Enter...");
        while (true) {
            String enter = scanner.nextLine();
            int aleatorio = (ran.nextInt(5)) + 1;

            if (aleatorio == 1) {
                System.out.println("Ha elegido INGRESAR");
                playera.ingreso();
            } else if (aleatorio == 2) {
                System.out.println("Ha elegido ESTAMPAR");
                playera.estampar();
            } else if (aleatorio == 3) {
                System.out.println("Ha elegido DOBLAR");
                playera.doblar();
            } else if (aleatorio == 4) {
                System.out.println("Ha elegido EMPACAR");
                playera.empaquetar();
            } else if (aleatorio == 5) {
                System.out.println("Ha elegido CLASIFICAR");
                playera.clasificar();
                playera.vaciar();
            }

        }
    }

}
//        ConcurrentLinkedQueue<Playera> colaI = new ConcurrentLinkedQueue<Playera>();
//        Stack<Playera> pilaEstampadas = new Stack<Playera>();
//        Stack<Playera> pilaDobladas = new Stack<Playera>();
//        Stack<Playera> pilaEmpacadas = new Stack<Playera>();
//        ConcurrentLinkedQueue<Playera> colaDoceRojas = new ConcurrentLinkedQueue<Playera>();
//        ConcurrentLinkedQueue<Playera> colaDoceNegras = new ConcurrentLinkedQueue<Playera>();
//        Random ran = new Random();
//        int id = 0;
//        int contadorR = 0;
//        int contadorN = 0;
//        String color = "";
//
//        //Proceso inicial
//        if (ran.nextBoolean() == true) {
//            color = "Negro";
//        } else {
//            color = "Rojo";
//        }
//        Playera playera = new Playera(id, color);
//        colaI.add(playera);
//        System.out.println("cola inicial: " + colaI);
//        System.out.println("----------");
//        //persona 1 saca de la cola inicial
//        pilaEstampadas.push(colaI.poll());
//        System.out.println("cola inicial: " + colaI);
//        System.out.println("primera pila: " + pilaEstampadas);
//        System.out.println("------------");
////persona 2 saca de pila 1 y pone en pila 2
//        pilaDobladas.push(pilaEstampadas.pop());
//        System.out.println("primera pila: " + pilaEstampadas);
//        System.out.println("Segunda pila: " + pilaDobladas);
//        System.out.println("-----------");
////persona 3 saca de pila 2 y pone en pila 3
//        pilaEmpacadas.push(pilaDobladas.pop());
//        System.out.println("Segunda pila: " + pilaDobladas);
//        System.out.println("Tercera pila: " + pilaEmpacadas);
//        System.out.println("---------");
////persona 4 saca de pila 3 y pone en cola1 o cola2 segun color
//        if (color.equals("Negro")) {
//            colaDoceNegras.add(pilaEmpacadas.pop());
//            System.out.println("Tercera pila: " + pilaEmpacadas);
//            System.out.println("entro a colaNegras:" + colaDoceNegras);
//        } else if (color.equals("Rojo")) {
//            colaDoceRojas.add(pilaEmpacadas.pop());
//            System.out.println("Tercera pila: " + pilaEmpacadas);
//            System.out.println("entro a colaRojas:" + colaDoceRojas);
//
//
//        }
//        //Condicion si se llenan
//        if (colaDoceNegras.size()>=12) {
//            colaDoceNegras.clear();
//            contadorN=contadorN+1;
//            System.out.println(contadorN);
//             System.out.println("entro a colaNegras:" + colaDoceNegras);
//            
//        }
//        if (colaDoceRojas.size()>=12) {
//            colaDoceRojas.clear();
//            contadorR = contadorR+1;
//            System.out.println(contadorR);
//             System.out.println("entro a colaRojas:" + colaDoceRojas);
//        }
