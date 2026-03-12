import java.util.TreeSet;

public class Ejr2 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);
    }
}