
import java.util.Arrays;

public class TVCable {

    private String[] canales;
    private static int cantidadCanales = 1;

    public TVCable(String[] canales) {
        this.canales = canales;

    }

    public TVCable(int cantidadCanales) {

        this.canales = new String[cantidadCanales];

    }

    public int getCapacidad() {
        return this.cantidadCanales;
    }

    public int getCanal(int n) {

        return n - 1;
    }

    public void setCanal(int n, String c) {

        this.canales[n - 1] = c;

    }

    @Override
    public String toString() {

        return "Canales [" + (this.cantidadCanales++) + "|" + (Arrays.toString(this.canales)) + "]";

    }

    public boolean equals(TVCable c) {

        if (Arrays.toString(canales).equals(Arrays.toString(c.canales))) {
            return true;
        } else {
            return false;
        }

    }
}
