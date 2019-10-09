import java.util.Random;

//cambioooo
public class generador {
    public static void main(String[] args) {
        String[] abc ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random ran = new Random();
        String placa = ran.nextInt(10)+""+ran.nextInt(10)+""+ran.nextInt(10)+""+abc[ran.nextInt(28)]+abc[ran.nextInt(28)]+abc[ran.nextInt(28)];
        System.out.println(placa);
    }
}
