import java.util.Scanner;

public class ACT18 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine().toLowerCase();

        String consonantes = "bcdfghjklmnpqrstvwxyz";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (consonantes.indexOf(letra) != -1) {
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " consonantes.");
        sc.close();
    }
}