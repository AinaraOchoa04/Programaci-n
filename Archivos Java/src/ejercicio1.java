import java.io.*;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        try (FileWriter fw = new FileWriter("archivo1.txt")) {
            fw.write(texto);
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
