import java.util.Scanner;
public class ACT15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int contador = 0;
        int num = Math.abs(numero);

        if (num == 0) {
            contador = 1;
        } else {
            while (num > 0) {
                num /= 10;
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " dígitos.");
        sc.close();
    }
}