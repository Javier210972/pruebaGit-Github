
import java.util.Scanner;
import java.util.regex.*;

public class prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrees");
        String ingreso = scanner.nextLine();
        String regef = "";
        String rege30="((1|2)[0-7]|0[1-9])/(0[1-9]|1[0-2])/\\d{4}";
         
         
         

      

        while (true) {
boolean mes = Pattern.matches(regef, ingreso);
            if (mes == true) {
                System.out.println("cumple");
            }
            else{
             System.out.println("no cumple");
            } 
       ingreso= scanner.nextLine();
        }
       
    }
}
