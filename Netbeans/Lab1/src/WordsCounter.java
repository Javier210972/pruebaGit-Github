
import java.util.*;
import java.util.regex.Pattern;

public class WordsCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese oracion: ");
        String texto = scanner.nextLine();
        int i = 0;
        int v = 0;
        boolean vocales = false;
        Scanner cantidad = new Scanner(texto);
        if (!texto.equals("")) {

            while (cantidad.hasNext()) {

                cantidad.next();
                i++;

            }
            for (int c = 0; c <= texto.length() - 1; c++) {
                vocales = Pattern.matches("[aeiouAEIOU]", texto.substring(c, c + 1));

                if (vocales == true) {

                    v++;

                }

            }
            System.out.println("");
            System.out.println("Cantidad de Palabras: " + i);
            System.out.println("Cantidad de Vocales: " + v);
        } else {
            System.out.println("String vacio");
        }

    }

}
