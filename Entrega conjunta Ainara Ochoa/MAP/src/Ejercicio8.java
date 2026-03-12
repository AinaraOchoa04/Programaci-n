import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();

        for (char c : palabra.toCharArray()) {
            contador.put(c, contador.getOrDefault(c, 0) + 1);
        }

        System.out.println(contador);
    }
}