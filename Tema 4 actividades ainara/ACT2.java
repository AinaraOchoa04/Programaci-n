import java.util.Scanner;

public class ACT2 {
    static void main(){
        //Buscar una letra en una cadena y especificar cuantas veces sale dicha letra

        Scanner sc = new Scanner(System.in);
        String texto;
        char letra;
        int contador = 0;

        System.out.println("Introduce una cadena de texto: ");
        texto = sc.nextLine();
        System.out.println("¿Que letra desea buscar?: ");
        letra = sc.next().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra "+ letra + " aparece " + contador + " veces en la cadena.");
    }
}