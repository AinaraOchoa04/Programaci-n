import java.io.*;
import java.util.*;

public class ejercicio10 {
    public static void main(String[] args) {
        Set<String> datos = new HashSet<>();

        try {
            leer("datos.csv", datos);
            leer("copia_datos.csv", datos);

            FileWriter fw = new FileWriter("combinado.csv");
            for (String linea : datos) {
                fw.write(linea + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void leer(String archivo, Set<String> datos) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            datos.add(linea);
        }
        br.close();
    }
}
