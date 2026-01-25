import java.io.*;

public class ejercicio8 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
                FileWriter fw = new FileWriter("adultos.csv")
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int edad = Integer.parseInt(datos[1]);
                if (edad >= 18) {
                    fw.write(linea + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
