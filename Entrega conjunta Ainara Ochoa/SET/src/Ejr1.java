import java.util.HashSet;

public class Ejr1 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Marta");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}