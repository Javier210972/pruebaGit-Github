
public class Semaforo {

    public static void main(String[] args) {
        double verdeT = Double.parseDouble(args[0]);
        double amarilloT = Double.parseDouble(args[1]);
        if (verdeT > amarilloT) {

            Interseccion thr = new Interseccion((verdeT * 1000), (amarilloT * 1000), true);
            Interseccion thr2 = new Interseccion((verdeT * 1000), (amarilloT * 1000), false);
            thr.start();
            thr2.start();
        } else {
            System.out.println("vuelva ha intentarlo con el tiempo de verde mayor que el de amarillo");
        }

    }
}
