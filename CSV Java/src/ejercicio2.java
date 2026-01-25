import java.io.*;

public class ejercicio2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
