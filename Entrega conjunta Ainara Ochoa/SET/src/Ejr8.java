import java.util.TreeSet;

public class Ejr8 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.clear();

        if (numeros.isEmpty()) {
            System.out.println("El conjunto está vacío");
        }
    }
}