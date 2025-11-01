import java.util.Scanner;

public class ACT12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENÚ DE OPCIONES");
            System.out.println("1. Contar caracteres");
            System.out.println("2. Invertir una cadena");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa una cadena: ");
                    String cadena1 = sc.nextLine();
                    System.out.println("La cadena tiene " + cadena1.length() + " caracteres.");
                    break;

                case 2:
                    System.out.print("Ingresa una cadena: ");
                    String cadena2 = sc.nextLine();
                    String invertida = "";
                    for (int i = cadena2.length() - 1; i >= 0; i--) {
                        invertida += cadena2.charAt(i);
                    }
                    System.out.println("La cadena invertida es: " + invertida);
                    break;

                case 3:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}
