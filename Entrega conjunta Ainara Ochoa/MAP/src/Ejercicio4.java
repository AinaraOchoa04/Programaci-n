import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList(
                "Ana", "Juan", "Ana", "Pedro", "Juan", "Ana"
        );

        Map<String, Integer> mapa = new HashMap<>();

        for (String nombre : nombres) {
            mapa.put(nombre, mapa.getOrDefault(nombre, 0) + 1);
        }

        System.out.println(mapa);
    }
}