 import java.util.Scanner;
public class ACT16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int suma = 0;
        int num = Math.abs(numero);

        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
        sc.close();
    }
}