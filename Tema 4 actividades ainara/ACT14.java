import java.util.Scanner;

public class ACT14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una cadena: ");
        String cadena = sc.nextLine();
        String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                resultado += Character.toUpperCase(c);
            }
            else {
                resultado += c;
            }
        }

        System.out.println("Cadena con el caso cambiado: " + resultado);

        sc.close();
    }
}