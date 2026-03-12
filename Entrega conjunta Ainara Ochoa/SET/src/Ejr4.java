import java.util.HashSet;

public class Ejr4 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Plátano");

        if (frutas.contains("Pera")) {
            System.out.println("La fruta existe");
        } else {
            System.out.println("No existe");
        }
    }
}