import java.io.*;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        String edad = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();

        try (FileWriter fw = new FileWriter("datos.csv")) {
            fw.write(nombre + "," + edad + "," + ciudad);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
