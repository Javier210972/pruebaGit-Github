
public class MarketQueue {

    private static int numero = 0;
    private static int capacidad = 0;
    private static int conteo = 0;

    public MarketQueue(int nMarket) {

        capacidad = nMarket;
        conteo += 1;
        
         

    }

    public  static int getQueueNumber() {
        return numero;

    }

    public static int getCapacity() {
        return capacidad;
    }

    public static int getNumberOfQueues() {
      
        return conteo;

    }

    public static Integer getMaxCapacityQueue() {
 
        return capacidad;
    }

    @Override
    public String toString() {
        return "cola:" + conteo + "capacidad:" + capacidad;

    }
}
