
import java.io.*;
import java.util.regex.*;

public class ValidDate {

    /**
     * * ESTE ES EL METODO QUE TIENE QUE IMPLEMENTAR **
     */
    public static boolean isValidDate(String date) {

        return Pattern.matches("((1|2)[0-9]|0[1-9])/(0[1-9]|1[0-2])/\\d{4}", date) == true || (Pattern.matches("30/04/\\d{4}", date) == true||Pattern.matches("30/06/\\d{4}", date) == true || Pattern.matches("30/09/\\d{4}", date) == true || Pattern.matches("30/11/\\d{4}", date) == true || Pattern.matches("31/01/\\d{4}", date) == true || Pattern.matches("31/03/\\d{4}", date) == true || Pattern.matches("31/05/\\d{4}", date) == true || Pattern.matches("31/07/\\d{4}", date) == true || Pattern.matches("31/08/\\d{4}", date) == true || Pattern.matches("31/10/\\d{4}", date) == true || Pattern.matches("31/12/\\d{4}", date) == true || Pattern.matches("28/02/\\d{4}", date) == true);

    }

    /**
     * * Para probar que su metodo funciona *
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Prueba de Valid Date: ");
        while (true) {
            System.out.println("Ingrese fecha a evaluar o solo presione enter para terminar: ");
            String fecha = br.readLine();
            if (fecha.length() == 0) {
                System.out.println("Saliendo...");
                return;
            } else {
                System.out.println("Fecha valida: " + isValidDate(fecha));
            }
        }
    }
}
