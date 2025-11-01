import java.util.Scanner;

public class ACT6 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();

        int contador = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La cadena contiene " + contador + " vocal(es).");

        sc.close();
    }
}