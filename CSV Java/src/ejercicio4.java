import java.io.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("datos.csv")) {
            String continuar;
            do {
                System.out.print("Introduce nombre,edad,ciudad: ");
                fw.write(sc.nextLine() + "\n");
                System.out.print("¿Otra línea? (s/n): ");
                continuar = sc.nextLine();
            } while (continuar.equalsIgnoreCase("s"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
