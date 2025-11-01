import java.util.Random;
import java.util.Scanner;

public class ACT17 {
    static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;
        int intento;
        boolean adivinado = false;

        System.out.println("Adivina el número (entre 1 y 10):");

        while (!adivinado) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Adivinaste el número ");
                adivinado = true;
            } else {
                System.out.println("No es correcto, intenta de nuevo.");
            }
        }

        sc.close();
    }
}