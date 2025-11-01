import java.util.Scanner;

public class ACT3 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        //Invertir una cadena
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();

        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println("La cadena invertida es: " + invertida);
    }
}