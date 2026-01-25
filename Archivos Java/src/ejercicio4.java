import java.io.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una línea: ");
        String texto = sc.nextLine();

        try (FileWriter fw = new FileWriter("archivo1.txt", true)) {
            fw.write("\n" + texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
