import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        sc.close();
    }
}