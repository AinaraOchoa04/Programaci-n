import java.util.Scanner;

public class ACT7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}