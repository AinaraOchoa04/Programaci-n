import java.io.*;
import java.util.*;

public class ejercicio9 {
    public static void main(String[] args) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            lineas.sort(Comparator.comparing(l -> l.split(",")[0]));

            FileWriter fw = new FileWriter("ordenado.csv");
            for (String l : lineas) {
                fw.write(l + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
