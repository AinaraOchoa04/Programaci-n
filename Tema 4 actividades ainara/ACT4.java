import java.util.Random;
import java.util.Scanner;

public class ACT4 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la longitud de la cadena (n): ");
        int n = sc.nextInt();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int indice = random.nextInt(caracteres.length());
            cadena.append(caracteres.charAt(indice));
        }

        System.out.println("Cadena aleatoria generada: " + cadena.toString());

        sc.close();
        }
    }