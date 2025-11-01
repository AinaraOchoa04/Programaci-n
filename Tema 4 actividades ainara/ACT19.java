import java.util.Random;

public class ACT19 {
    static void main() {
        Random random = new Random();
        int suma = 0;

        System.out.println("Números generados:");

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) + 1;
            System.out.print(num + " ");
            suma += num;
        }

        double media = suma / 10.0;
        System.out.printf("%nLa media de los números es: %.2f%n", media);
    }
}