/*LastComeFirstServed.java*/

 /*
Hecho por: Javier Salvador
Carnet: 19003362
Sección: C
 */
 /*
clase que representa una de las 3 políticas, con sus respectivos campos la cual hereda de Policy 
e implementa interfaz OrderManager (se utilizará pila)
 */
package policies;

import java.util.Stack;
import orders.PaintOrder;

public class LastComeFirstServed extends Policy implements OrderManager {

    Stack<PaintOrder> lcfs = new Stack<PaintOrder>();
    public int numeroOrden;
    public double tiempoAtencion;

    public LastComeFirstServed() {
        super();
        this.numeroOrden = numeroOrden;
        this.tiempoAtencion = tiempoAtencion;
        lcfs = new Stack<PaintOrder>();
    }

    @Override
    public void add(PaintOrder order) {
        lcfs.push(order);
    }

    @Override
    public PaintOrder remove() {
      return lcfs.remove(numeroOrden);
    }

    @Override
    public PaintOrder next() {
       return lcfs.pop();
    }

}
