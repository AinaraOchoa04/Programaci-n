import java.io.*;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palabra a buscar: ");
        String palabra = sc.nextLine();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\s+");
                for (String p : partes) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("Aparece " + contador + " veces.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
