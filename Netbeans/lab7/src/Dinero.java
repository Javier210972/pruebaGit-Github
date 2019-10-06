/* CC2-2019 - lab7 */

public class Dinero extends Numero {

    protected double valor;

    public Dinero(double x) {
        this.valor = truncate(x);
    }

    private double truncate(double x) {
        double r = (double) Math.floor(x * 100.0) / 100.0;

        return r;
    }

    /* 
		Escriba aqui su codigo
     */
    @Override
    public boolean isZero() {
        return this.valor == 0;
    }

    @Override
    public Dinero add(Numero n) {
        Dinero v = (Dinero) n;
        double a = this.valor;
        double b = v.valor;
        double suma = truncate(a + b);
        Dinero sumaR = new Dinero(suma);
        return sumaR;
    }

    @Override
    public Dinero multiply(Numero n) {
        Dinero m = (Dinero) n;
        double a = this.valor;
        double b = m.valor;
        double multi = truncate(a * b);
        Dinero multiR = new Dinero(multi);
        return multiR;
    }

    @Override
    public void increase() {
        this.valor = truncate(this.valor + 0.01);
       
    }

    @Override
    public void decrease() {

        this.valor = truncate(this.valor - 0.01);
        
    }

    @Override
    public String toString() {
        return Double.toString(this.valor);
    }
}
