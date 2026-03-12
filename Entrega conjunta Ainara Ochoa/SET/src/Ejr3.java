import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejr3 {
    public static void main(String[] args) {
        LinkedHashSet<String> palabras = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce palabras (fin para terminar):");

        String palabra;
        while (!(palabra = sc.nextLine()).equals("fin")) {
            palabras.add(palabra);
        }

        System.out.println(palabras);
    }
}