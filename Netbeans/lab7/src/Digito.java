/* CC2-2019 - lab7 */
//import java.Math.io.*;
public class Digito extends Numero {

    /*DecimalFormat formato = new DecimalFormat("#.00");
loat numero1 = 3.3f;
double numero2 = 3.33333d;

DecimalFormat formato1 = new DecimalFormat("#.00");
System.out.println(formato1.format(numero1)); // Resultado => 3,30

     */
    protected byte valor;

    public Digito(byte x) {
        this.valor = (byte) (x % 10);
    }

    @Override
    public boolean isZero() {

        return this.valor == 0;

    }

    @Override
    public Digito add(Numero n) {

        Digito v = (Digito) n;
        int a = this.valor;
        int b = v.valor;
        int suma = a + b;
        Digito sumaR = new Digito((byte) suma);
        return sumaR;

    }

    public Digito extract(Numero n) {
        Digito r = (Digito) n;
        int a = this.valor;
        int b = r.valor;
        int resta = a - b;
        Digito restaR = new Digito((byte) resta);
        return restaR;
    }

    @Override
    public Digito multiply(Numero n) {
        Digito m = (Digito) n;
        int a = this.valor;
        int b = m.valor;
        int multi = a * b;
        Digito multiR = new Digito((byte) multi);
        return multiR;

    }

    @Override
    public void increase() {

        this.valor++;
        if (this.valor > 9) {
            this.valor = 0;
        }
    }

    @Override
    public void decrease() {
        this.valor--;
        if (this.valor < 0) {
            this.valor = 9;
        }

    }

    @Override
    public String toString() {

        return Byte.toString(valor);

    }

}
