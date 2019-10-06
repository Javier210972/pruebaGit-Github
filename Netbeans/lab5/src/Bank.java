import java.util.*;

public class Bank {

    public static void main(String[] args) {
        System.out.println("\n\nBienvenidos a Simulacion de Banco");
        System.out.println("----------------------------------");
        System.out.println("Inicializando Banco con 4 agentes ....");
        BankQueues sat = new BankQueues(4);
        sat.printQueues();
        sat.printAgents();
        System.out.println("\nIniciando Simulacion .... \n");
        System.out.println("Esperando Enter...");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        while (true) {
            String text = scan.nextLine();
            int aleatorio = ran.nextInt(4);

            if (aleatorio == 1 || aleatorio == 0) {
                sat.addNormal();
                System.out.println("Ingreso a cola normal");

            } else if (aleatorio == 2) {
                sat.addPriority();
                System.out.println("Ingreso a cola exclusica");

            } else if (aleatorio == 3) {
                sat.nextClient();
                System.out.println("Nuevo cliente siendo atendido por agente");

            }
            sat.printQueues();
            sat.printAgents();
            /*
				Implemente aca las iteraciones
				-(0) Lea el ENTER
				(-1) Elija accion
				-(2) Ejecute accion
				(3) Imprima accion realizada: "Ingreso a cola normal", "Ingreso a cola exclusiva"
					"Nuevo cliente siendo atendido por Agente #"
				(4) Despliegue Colas
				(5) Despliegue Agentes
             */

        }
    }
}

