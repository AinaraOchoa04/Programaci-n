import java.util.Scanner;
public class ACT11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        int contador = 0;
        boolean dentroPalabra = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ' && !dentroPalabra) {
                dentroPalabra = true;
                contador++;
            }
            else if (c == ' ') {
                dentroPalabra = false;
            }
        }

        System.out.println("La frase contiene " + contador + " palabra(s).");

        sc.close();
    }
}