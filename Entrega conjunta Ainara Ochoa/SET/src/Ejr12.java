import java.util.LinkedHashSet;
import java.util.Random;

public class Ejr12 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Random r = new Random();

        while (numeros.size() < 10) {
            numeros.add(r.nextInt(50));
        }

        System.out.println(numeros);
    }
}