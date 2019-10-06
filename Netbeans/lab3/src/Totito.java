
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Totito {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        Random ran = new Random();
        boolean decision = false;
        int numero = 0;
        String jugador1 = "";
        String jugador2 = "";
        System.out.print("Ingrese Primer Jugador: ");
        String nombre1 = lector.nextLine();
        System.out.print("Ingrese Segundo Jugador: ");
        String nombre2 = lector.nextLine();
        System.out.println("--------------------");
        if (ran.nextBoolean() == true) {
            jugador1 = nombre1;
            jugador2 = nombre2;
            System.out.println("inicia:" + nombre1 + " con las X");
        } else {
            jugador1 = nombre2;
            jugador2 = nombre1;
            System.out.println("inicia:" + nombre2 + " con las X");
        }
        System.out.println("escoja numero");

        String[][] tablero = new String[3][3];

        tablero[0][0] = "1";
        tablero[0][1] = "2";
        tablero[0][2] = "3";
        tablero[1][0] = "4";
        tablero[1][1] = "5";
        tablero[1][2] = "6";
        tablero[2][0] = "7";
        tablero[2][1] = "8";
        tablero[2][2] = "9";

        for (String[] arr2 : tablero) {
            System.out.println(" ");
            for (String val : arr2) {
                System.out.print(val);
                System.out.print(" ");
            }
        }
        System.out.println("");
        int i = 0;
        while (decision == false) {

            System.out.println("");
            numero = lector.nextInt();
            while (tablero(tablero, numero, "X").equals("2") || (numero < 1 || numero > 9)) {
                System.out.println("vuelva ha intetarlo");
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                numero = lector.nextInt();
            }

            if (win(tablero).equals("3")) {

                System.out.println("gana:" + jugador1 + " con las X");
                decision = true;
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                break;
            } else if (win(tablero).equals("4")) {
                System.out.println("gana:" + jugador2 + " con las O");
                decision = true;
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                break;
            }
            i++;
            if (i >= 5) {

                System.out.println("tablero lleno, vuelva a intentarlo");
                for (String[] arr2 : tablero) {
                System.out.println(" ");
                for (String val : arr2) {
                    System.out.print(val);
                    System.out.print(" ");
                }
            }
                break;
            }
           

            for (String[] arr2 : tablero) {
                System.out.println(" ");
                for (String val : arr2) {
                    System.out.print(val);
                    System.out.print(" ");
                }
            }
            System.out.println("");
            numero = lector.nextInt();
            while (tablero(tablero, numero, "O").equals("2") || (numero < 1 || numero > 9)) {
                System.out.println("vuelva ha intetarlo");
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                numero = lector.nextInt();
            }

            if (win(tablero).equals("3")) {
                System.out.println("gana:" + jugador1 + " con las X");
                decision = true;
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                break;
            } else if (win(tablero).equals("4")) {
                System.out.println("gana:" + jugador2 + " con las O");
                decision = true;
                for (String[] arr2 : tablero) {
                    System.out.println(" ");
                    for (String val : arr2) {
                        System.out.print(val);
                        System.out.print(" ");
                    }
                }
                break;
            }
            for (String[] arr2 : tablero) {
                System.out.println(" ");
                for (String val : arr2) {
                    System.out.print(val);
                    System.out.print(" ");
                }
            }
            // System.out.println("numero contador: " + i);

        }

    }

    public static String win(String tab1[][]) {

        if (tab1[0][0].equals("X") && tab1[0][1].equals("X") && tab1[0][2].equals("X")) {

            return "3";
        }
        if (tab1[1][0].equals("X") && tab1[1][1].equals("X") && tab1[1][2].equals("X")) {

            return "3";
        }
        if (tab1[2][0].equals("X") && tab1[2][1].equals("X") && tab1[2][2].equals("X")) {

            return "3";
        }
        if (tab1[0][0].equals("X") && tab1[1][0].equals("X") && tab1[2][0].equals("X")) {

            return "3";
        }
        if (tab1[0][1].equals("X") && tab1[1][1].equals("X") && tab1[2][1].equals("X")) {

            return "3";
        }
        if (tab1[0][2].equals("X") && tab1[1][2].equals("X") && tab1[2][2].equals("X")) {

            return "3";
        }
        if (tab1[0][0].equals("X") && tab1[1][1].equals("X") && tab1[2][2].equals("X")) {

            return "3";
        }
        if (tab1[0][2].equals("X") && tab1[1][1].equals("X") && tab1[2][0].equals("X")) {

            return "3";
        }

        if (tab1[0][0].equals("O") && tab1[0][1].equals("O") && tab1[0][2].equals("O")) {

            return "4";
        }
        if (tab1[1][0].equals("O") && tab1[1][1].equals("O") && tab1[1][2].equals("O")) {

            return "4";
        }
        if (tab1[2][0].equals("O") && tab1[2][1].equals("O") && tab1[2][2].equals("O")) {

            return "4";
        }
        if (tab1[0][0].equals("O") && tab1[1][0].equals("O") && tab1[2][0].equals("O")) {

            return "4";
        }
        if (tab1[0][1].equals("O") && tab1[1][1].equals("O") && tab1[2][1].equals("O")) {

            return "4";
        }
        if (tab1[0][2].equals("O") && tab1[1][2].equals("O") && tab1[2][2].equals("O")) {

            return "4";
        }
        if (tab1[0][0].equals("O") && tab1[1][1].equals("O") && tab1[2][2].equals("O")) {

            return "4";
        }
        if (tab1[0][2].equals("O") && tab1[1][1].equals("O") && tab1[2][0].equals("O")) {

            return "4";
        }
        return "1";
    }

    public static String tablero(String tab1[][], int number, String code) {

        switch (number) {

            case 1:
                if (tab1[0][0].equals("X") || tab1[0][0].equals("O")) {

                    return "2";
                } else {
                    tab1[0][0] = code;
                }
                break;
            case 2:
                if (tab1[0][1].equals("X") || tab1[0][1].equals("O")) {

                    return "2";
                } else {
                    tab1[0][1] = code;
                }
                break;
            case 3:
                if (tab1[0][2].equals("X") || tab1[0][2].equals("O")) {

                    return "2";
                } else {
                    tab1[0][2] = code;
                }
                break;
            case 4:
                if (tab1[1][0].equals("X") || tab1[1][0].equals("O")) {

                    return "2";
                } else {
                    tab1[1][0] = code;
                }
                break;
            case 5:
                if (tab1[1][1].equals("X") || tab1[1][1].equals("O")) {

                    return "2";
                } else {
                    tab1[1][1] = code;
                }
                break;
            case 6:
                if (tab1[1][2].equals("X") || tab1[1][2].equals("O")) {

                    return "2";
                } else {
                    tab1[1][2] = code;
                }
                break;
            case 7:
                if (tab1[2][0].equals("X") || tab1[2][0].equals("O")) {

                    return "2";
                } else {
                    tab1[2][0] = code;
                }
                break;
            case 8:
                if (tab1[2][1].equals("X") || tab1[2][1].equals("O")) {

                    return "2";
                } else {
                    tab1[2][1] = code;
                }
                break;
            case 9:
                if (tab1[2][2].equals("X") || tab1[2][2].equals("O")) {

                    return "2";
                } else {
                    tab1[2][2] = code;
                }
                break;
        }

        return "1";
    }
}
