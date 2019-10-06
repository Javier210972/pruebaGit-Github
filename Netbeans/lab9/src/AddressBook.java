
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;

public class AddressBook {

    public static void main(String[] args) throws Exception {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
       
        HashMap<String, Contact> tabla1 = new HashMap<String, Contact>();
        Contact contact = new Contact("", "", "");
        int opcion = -1;
        String scanP = scan.nextLine();
        do {
            System.out.println("MENU PRINCIPAL: ");
            System.out.println("1: Ingreso de nuevo Contact");
            System.out.println("2. Remover Contact");
            System.out.println("3. Buscar Contact");
            System.out.println("4: Salir\n");
            System.out.print("Ingrese su opcion: ");

            try {
                opcion = Integer.parseInt(teclado.readLine());
                System.out.println("");
                switch (opcion) {
                    case 1: {
                        boolean flag1 = false;

                        String direccion = "";
                        String contactoN = "";
                        String tel = "";
                        while (!flag1) {
                            System.out.print("Ingrese nombre de Contacto: ");
                            contactoN = teclado.readLine();
                            if (tabla1.get(contactoN) == null) {
                                System.out.print("Ingrese Direccion: ");
                                direccion = teclado.readLine();
                                System.out.print("Ingrese Telefono: ");
                                tel = teclado.readLine();
                                tabla1.put(contactoN, new Contact(contactoN, direccion, tel));
                                System.out.println("\nUsuario ingresado exitosamente!");
                                System.out.println(tabla1.get(contactoN) + "\n");

                            } else {
                                System.out.println(tabla1.get(contactoN) + "\n");
                                System.out.println("Quiere ingresar un nuevo telefono? (Si= s/No= cualquier tecla)");

                                String pregunta = teclado.readLine();
                                if (pregunta.equalsIgnoreCase("S")) {
                                    System.out.println("ingrese su telefono");
                                    tel = teclado.readLine();

                                    tabla1.put(contactoN, new Contact(contactoN, direccion, tel));
                                    System.out.println(tabla1.get(contactoN));
                                    
                                }

                            }

                            //tabla.put(uname, new User(uname, n, p));
                            flag1 = true;

                        }
                        break;
                    }
                    case 2: {
                        boolean flag2 = false;

                        while (!flag2) {
                            System.out.print("Ingrese key para borrar ");
                            String contactoN = teclado.readLine();
                            if (contactoN.equals("")) {
                                System.out.println("Error: key vacia \n");
                            } else if (tabla1.get(contactoN) != null) {
                                System.out.println("\n Se ha encontrado key para borrar");
                                System.out.println(tabla1.get(contactoN) + "\n");
                                tabla1.remove(contactoN);
                                System.out.println("");
                                flag2 = true;
                            } else {
                                System.out.println("\n No se encontro key asociado a ese contact");
                                System.out.println("\n------------------------");
                                flag2 = true;
                            }
                        }
                        break;
                    }
                    case 3: {
                        boolean flag3 = false;

                        while (!flag3) {
                            System.out.print("Ingrese key para buscar: ");
                            String contactoN = teclado.readLine();
                            if (contactoN.equals("")) {
                                System.out.println("Error: key vacia \n");
                            } else if (tabla1.get(contactoN) != null) {
                                System.out.println("\nSe ha encontrado el contact");
                                System.out.println(tabla1.get(contactoN) + "\n");
                                System.out.println("\n");
                                flag3 = true;
                            } else {
                                System.out.println("\n No se encontro contact");
                                System.out.println("\n");
                                flag3 = true;
                            }
                        }
                        break;
                    }

                    case 4: {

                        System.out.println("Saliendo del programa\n\n");
                        break;
                    }
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Vuelva a intentarlo");
                opcion = -1;
            }
        } while (opcion != 4);
    }

}
