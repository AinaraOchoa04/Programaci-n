import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("Manzanas", 10);
        inventario.put("Peras", 5);

        inventario.put("Manzanas", 20);

        inventario.remove("Peras");

        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}