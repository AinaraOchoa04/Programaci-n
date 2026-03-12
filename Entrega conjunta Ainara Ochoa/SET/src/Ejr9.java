import java.util.*;

public class Ejr9 {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");

        List<String> lista = new ArrayList<>(nombres);

        Collections.sort(lista);

        System.out.println(lista);
    }
}