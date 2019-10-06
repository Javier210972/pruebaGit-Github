import java.io.*;
import java.util.*;

public class Precios {
	public static void main(String[] args) throws Exception {
		BufferedReader tec = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.print("Ingrese cantidad: ");
		String lectura = tec.readLine();
		int cant = Integer.parseInt(lectura);
		System.out.print("Ingrese precio: ");
		double precio = Double.parseDouble(tec.readLine());
		double total = 0;
		if (cant > 36) {
			total = cant * precio * 0.8; 
		} else if (cant > 12) {
			total = cant * precio * 0.9;
		} else {
			total = cant * precio;
		}
		System.out.println("El total es: " + total);
	}
}