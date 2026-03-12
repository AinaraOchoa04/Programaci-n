import java.util.HashSet;

public class Ejr5 {
    public static void main(String[] args) {
        HashSet<String> colores = new HashSet<>();

        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");

        colores.remove("Azul");

        System.out.println(colores);
    }
}