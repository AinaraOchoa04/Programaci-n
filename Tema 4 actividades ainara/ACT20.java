public class ACT20 {
    static void main() {
        System.out.println("Múltiplos de 5 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}