
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
class Playera {

    private ConcurrentLinkedQueue<Playera> colaI, colaDoceRojas, colaDoceNegras;
    private Stack<Playera> pilaEstampadas, pilaDobladas, pilaEmpacadas;
    private int id = 0;
    private int contadorR = 0;
    private int contadorN = 0;
    String color = "";
    Random ran = new Random();

    public Playera(int id, String color) {
        this.id = id;
        this.color = color;
        colaI = new ConcurrentLinkedQueue<Playera>();
        colaDoceNegras = new ConcurrentLinkedQueue<Playera>();
        colaDoceRojas = new ConcurrentLinkedQueue<Playera>();
        pilaEstampadas = new Stack<Playera>();
        pilaDobladas = new Stack<Playera>();
        pilaEmpacadas = new Stack<Playera>();
    }

    public void ingreso() {
        if (ran.nextBoolean() == true) {
            this.color = "Negro";
        } else {
            this.color = "Rojo";
        }
        id = id + 1;
        Playera playera = new Playera(id, this.color);
        colaI.add(playera);
        System.out.println("cola inicial: " + colaI);
    }

    public void estampar() {
        pilaEstampadas.push(colaI.poll());
        System.out.println("cola inicial: " + colaI);
        System.out.println("primera pila: " + pilaEstampadas);
    }

    public void doblar() {
        if (!pilaEstampadas.isEmpty()) {

            pilaDobladas.push(pilaEstampadas.pop());
            System.out.println("primera pila: " + pilaEstampadas);
            System.out.println("Segunda pila: " + pilaDobladas);
        } else {
            System.out.println("No hay playeras estampadas");
        }
    }

    public void empaquetar() {
        if (!pilaDobladas.isEmpty()) {

            pilaEmpacadas.push(pilaDobladas.pop());
            System.out.println("Segunda pila: " + pilaDobladas);
            System.out.println("Tercera pila: " + pilaEmpacadas);
        } else {
            System.out.println("No hay playeras dobladas");
        }
    }

    public void clasificar() {
        if (!pilaEmpacadas.isEmpty()) {

            if (pilaEmpacadas.peek().color.equals("Negro")) {
                colaDoceNegras.add(pilaEmpacadas.pop());
                System.out.println("Tercera pila: " + pilaEmpacadas);
                System.out.println("entro a colaNegras:" + colaDoceNegras);
            } else if (pilaEmpacadas.peek().color.equals("Rojo")) {
                colaDoceRojas.add(pilaEmpacadas.pop());
                System.out.println("Tercera pila: " + pilaEmpacadas);
                System.out.println("entro a colaRojas:" + colaDoceRojas);
            }
        } else {
            System.out.println("No hay playeras empacadas");
        }
    }

    public void vaciar() {
        if (colaDoceNegras.size() >= 12) {
            colaDoceNegras.clear();
            contadorN = contadorN + 1;
            System.out.println("paquetes de playeras negras:" + contadorN);
            System.out.println("colaNegras VACIADO:" + colaDoceNegras);

        }
        if (colaDoceRojas.size() >= 12) {
            colaDoceRojas.clear();
            contadorR = contadorR + 1;
            System.out.println("paquetes de playeres rojas:" + contadorR);
            System.out.println("colaRojas VACIADO:" + colaDoceRojas);
        }
    }

    @Override
    public String toString() {
        return "Playera " + this.id + ":" + this.color;
    }

}
