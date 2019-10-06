import java.util.Random;
import java.io.*;

public class EmergencyRoom {
	public static void main(String[] args) throws Exception{
		System.out.println("**** SIMULADOR ATENCION DE PACIENTES - Lab#7 ****");
		System.out.println("Inicializando....");
		PatientsLine eline = new PatientsLine();
		String[] names = {"Juan","Andrea","Jose","Maria","Marvin","Ricardo","Carlos","Karla","Roberto","Carolina","Julio","Josue","Juan Pablo","Mario","Celia","Marcos","Alejandra","Cecilia","Otto", "Ali"};
		String[] apps = {"Perez","Morales","Arenas","Rodriguez","Martinez","Lemus","Jimenez","Rodas","Galvez","Ruiz","Vasquez","Lopez","Garcia","Castillo"};
		System.out.println("Patient Line vacia: " + eline);
		System.out.println("Iniciando ciclo de simulacion. Precione ENTER para elegir");
		System.out.println("opcion aleatoriamente, cualquier otra cosa para terminar programa");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Random r = new Random();
		while(true) {
			String s = input.readLine();
			if (!s.equals("")) break;
			int opcion = r.nextInt(50)%2;
			if (opcion == 1) {
				System.out.println("Ingreso nuevo paciente");
				String n = names[r.nextInt(names.length)];
				String a = apps[r.nextInt(apps.length)];
				String ss = n + " " + a;
				byte p = (byte)r.nextInt(25);
				System.out.println(ss);
				eline.enqueue(ss,p);
				System.out.println("Linea: " + eline);
			} else {
                                if (!eline.isEmpty()) {
                                    Patient pp = eline.attend();
                                    System.out.println("Se atendio al paciente:" + pp);
                                } else {
                                    System.out.println("Se intento atender un paciente pero la cola esta vacia");
                                }
				System.out.println("Linea: " + eline);
			}
		}
	}
}
