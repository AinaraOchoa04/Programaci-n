import java.io.*;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        File archivo = new File("archivo2.txt");
        Scanner sc = new Scanner(System.in);

        if (archivo.exists()) {
            System.out.print("¿Eliminar archivo? (s/n): ");
            String resp = sc.nextLine();

            if (resp.equalsIgnoreCase("s")) {
                archivo.delete();
                System.out.println("Archivo eliminado.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}

