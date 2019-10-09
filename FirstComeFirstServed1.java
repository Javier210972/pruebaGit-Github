/*FirstComeFirstServed.java*/

 /*
Hecho por: Javier Salvador
Carnet: 19003362
Sección: C
 */
 /*
clase que representa una de las 3 políticas, con sus respectivos campos la cual hereda de Policy 
e implementa interfaz OrderManager (se utilizará cola)
 */
package policies;

import orders.PaintOrder;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FirstComeFirstServed extends Policy implements OrderManager {

    ConcurrentLinkedQueue<PaintOrder> fcfs = new ConcurrentLinkedQueue<PaintOrder>();
    public int numeroOrden;
    public double tiempoAtencion;

    public FirstComeFirstServed(int numeroOrden, double tiempoAtencion) {
        super();
        this.numeroOrden = numeroOrden;
        this.tiempoAtencion = tiempoAtencion;
        fcfs = new ConcurrentLinkedQueue<PaintOrder>();
    }

    @Override
    public void add(PaintOrder order) {
        fcfs.add(order);
    }

    @Override
    public PaintOrder remove() {
        return fcfs.remove();
    }

    @Override
    public PaintOrder next() {
        return fcfs.poll();
    }

}
