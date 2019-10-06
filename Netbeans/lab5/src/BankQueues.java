

import java.util.Random;
import java.util.concurrent.*;

public class BankQueues {

    private ConcurrentLinkedQueue<Client> normal, priority;
    private Agent[] agents;
    private int nextNumber;

    public BankQueues(int nagents) {
        normal = new ConcurrentLinkedQueue<Client>();
        priority = new ConcurrentLinkedQueue<Client>();
        nextNumber = 0;

        /**
         * Inicialice aqui las colas y cualquier otro campo que exclusive
         *
         */
        this.agents = new Agent[nagents];
        for (int i = 0; i < this.agents.length; i += 1) {
            agents[i] = new Agent(i + 1);
        }
    }

    // agrega un cliente a la cola normal
    public void addNormal() {
        nextNumber = nextNumber + 1;
        Client uno = new Client(nextNumber, 'N');
        normal.add(uno);

    }

    // agrega un cliente a la cola exclusiva
    public void addPriority() {
        nextNumber = nextNumber + 1;
        Client uno = new Client(nextNumber, 'P');
        priority.add(uno);

    }

    /* 	elige aleatoriamente un agente y le asigna un nuevo cliente,
		si no hay clientes disponibles, asignele null al agente elegido.
		Utilice el metodo setNewClient(Integer cli) de la clase Agent para esto asignar
		un nuevo cliente (Integer) al agente . Devuelva el numero agente elegido para atender
		al cliente. */
//        this.agents = new Agent[nagents];
//    for (int i = 0; i < this.agents.length; i += 1) {
//      agents[i] = new Agent(i+1);
//    }
//  }
    Random ran = new Random();

    public int nextClient() {
        int aleatorio = ran.nextInt(4);
        

        if (priority.isEmpty() == false) {
            System.out.println("priority tiene elementos");
            
            
            agents[aleatorio].setNewClient(priority.peek());
            priority.poll();
            

        } else if (normal.isEmpty() == false) {
            System.out.println("normal tiene elementos");
           
           
            agents[aleatorio].setNewClient(normal.peek());
            normal.poll();
            
        } else {
            System.out.println("no hay nada");
            agents[aleatorio].setNewClient(null);
        }
        return aleatorio;
    }

    //********** No cambie este codigo ************/
    // despliega los agentes y clientes que esta atendiendo
    public void printAgents() {
        System.out.println("------------------\nAGENTES: ");
        for (int i = 0; i < agents.length; i += 1) {
            System.out.println(agents[i]);
        }
        System.out.println("------------------");
    }
    // despliega las colas

    public void printQueues() {
        System.out.println("------------------\nCOLAS: ");
        System.out.println("Normal:    " + this.normal);
        System.out.println("Priority: " + this.priority);
        System.out.println("------------------");
    }

    // Clase que representa a un Agente
    private class Agent {

        private int id;
        private Client client;

        Agent(int id) {
            this.id = id;
            this.client = null;
        }

        void setNewClient(Client c) {
            this.client = c;
        }

        public String toString() {
            String atendiendoA = this.client == null ? "desocupado" : "atendiendo a cliente " + client.toString();
            return "Agent #" + this.id + ": " + atendiendoA;
        }
    }

    private class Client {

        private int id;
        private char type;

        Client(int id, char type) {
            this.id = id;
            this.type = type;
        }

        public String toString() {
            return "[" + this.id + "," + this.type + "]";
        }
    }

    /**
     * ** No cambie este codigo ********************
     */
}
