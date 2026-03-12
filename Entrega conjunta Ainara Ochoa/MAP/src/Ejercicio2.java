import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> contador = new HashMap<>();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}