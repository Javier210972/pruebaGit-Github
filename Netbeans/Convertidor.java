import java.io.*;

public class Convertidor {
	public static void main(String[] args) throws Exception {
		BufferedReader tec = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.print(">");
		String lectura = tec.readLine();
		String comando = lectura.substring(0, 5);
		if (comando.equals("upper")) {
			System.out.println(">" + lectura.substring(6).toUpperCase());
		} else if (comando.equals("lower")) {
			System.out.println(">" + lectura.substring(6).toLowerCase());			
		} else {
			System.out.println("> ERROR!");
		}

		for(int i = 0, j = 10; i < 20; i++, j-=2) {
			System.out.println(i + " - " + j);
		}
	}
}