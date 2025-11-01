import java.util.Scanner;

public class ACT9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int N = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares desde 1 hasta " + N + " es: " + suma);

        sc.close();
    }
}