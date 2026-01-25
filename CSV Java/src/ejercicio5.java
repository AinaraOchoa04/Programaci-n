import java.io.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("Total de líneas: " + contador);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
