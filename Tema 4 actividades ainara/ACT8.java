import java.util.Scanner;
import java.util.Random;

public class ACT8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;
        int intento = 0;
        int numeroUsuario;

        System.out.println("¡Adivina el número entre 1 y 100!");

        do {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
            }

        } while (numeroUsuario != numeroSecreto);

        sc.close();
    }
}