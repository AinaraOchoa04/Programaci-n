import java.io.*;

public class ejercicio7 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
                FileWriter fw = new FileWriter("copia_datos.csv")
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
