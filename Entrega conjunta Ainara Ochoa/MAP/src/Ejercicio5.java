import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");

        System.out.println("Introduce palabra en español:");
        String palabra = sc.nextLine();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Traducción: " + diccionario.get(palabra));
        } else {
            System.out.println("Palabra no encontrada.");
        }
    }
}