import java.io.*;

public class ejercicio7 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("archivo3.txt")) {
            copiar("archivo1.txt", fw);
            copiar("archivo2.txt", fw);
            System.out.println("Archivos concatenados.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void copiar(String archivo, FileWriter fw) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            fw.write(linea + "\n");
        }
        br.close();
    }
}
