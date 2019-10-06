import java.util.*;

public class CountElements {

	/*** ESTE ES EL METODO QUE TIENE QUE IMPLEMENTAR ***/
	public static int counter(int[][] mat, int n) {
		int cont =0;
		
		for(int array[] : mat){
                    for (int array2: array) {
                        if (array2==n) {
                            cont++;
                        }
                        
                    }
                }
		return cont;
	}


    /*** Para probar que su metodo funciona **/
	public static void main(String[] args) {
		Random r = new Random();
		int altura = r.nextInt(9) + 2;
		int ancho = r.nextInt(9) + 2;
		int[][] matriz = new int[altura][];
		for (int i=0;i<matriz.length;i++) {
			int[] f = new int[ancho];
			for (int j=0;j<f.length;j++) f[j] = r.nextInt(11) + 10;
			matriz[i] = f;
		}
		int abuscar = r.nextInt(11) + 10;
		int count = counter(matriz,abuscar);
		System.out.println("Matriz: ");
		for (int k=0;k<matriz.length;k++) System.out.println(Arrays.toString(matriz[k]));
		System.out.println("Numero que se busco: " + abuscar);
		System.out.println("Ocurrencias en la matriz: " + count);

	}
}
