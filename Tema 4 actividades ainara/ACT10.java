 import java.util.Scanner;

    public class ACT10 {
        static void main() {
            Scanner sc = new Scanner(System.in);

            String cadena;
            String masLarga = "";
            int contador = 0;

            System.out.println("Ingresa varias cadenas (escribe 'salir' para terminar):");

            while (true) {
                System.out.print("Cadena: ");
                cadena = sc.nextLine();

                if (cadena.equalsIgnoreCase("salir")) {
                    break;
                }

                contador++;

                if (cadena.length() > masLarga.length()) {
                    masLarga = cadena;
                }
            }

            System.out.println("\nCantidad de cadenas ingresadas: " + contador);
            if (contador > 0) {
                System.out.println("La cadena más larga es: \"" + masLarga + "\" (" + masLarga.length() + " caracteres)");
            } else {
                System.out.println("No se ingresaron cadenas.");
            }

            sc.close();
        }
    }