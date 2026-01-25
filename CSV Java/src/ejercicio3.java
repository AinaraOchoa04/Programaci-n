import java.io.*;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("datos.csv", true)) {
            String continuar;
            do {
                System.out.print("Introduce nombre,edad,ciudad: ");
                fw.write("\n" + sc.nextLine());
                System.out.print("¿Otra línea? (s/n): ");
                continuar = sc.nextLine();
            } while (continuar.equalsIgnoreCase("s"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
