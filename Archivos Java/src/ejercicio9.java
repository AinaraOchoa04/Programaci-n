import java.io.*;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palabra: ");
        String palabra = sc.nextLine();

        try (
                BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
                FileWriter fw = new FileWriter("filtrado.txt")
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    fw.write(linea + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
