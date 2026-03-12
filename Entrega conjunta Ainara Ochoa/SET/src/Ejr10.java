import java.util.*;

public class Ejr10 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,2,3,4,4,5);

        HashSet<Integer> unicos = new HashSet<>(lista);

        System.out.println("Elementos únicos: " + unicos.size());
    }
}