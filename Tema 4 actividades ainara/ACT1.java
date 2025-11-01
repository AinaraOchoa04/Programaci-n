import java.util.Scanner;

public class ACT1 {
    static void main() {
        //Leer una cadena y decir cuanto scaracteres tiene dicha cadena.
        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.println("Introduce una cadena: ");
        texto = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            contador++;
        }

        System.out.println("La cadena tiene " + contador + " caracteres.");
    }
}