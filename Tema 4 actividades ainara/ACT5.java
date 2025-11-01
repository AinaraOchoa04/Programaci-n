import java.util.Scanner;

public class ACT5 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Comprobador de numeros palíndromos----------");
        System.out.println("Introduce un número o una palabra: ");
        String texto = sc.nextLine();

        //Esto lo utilizamos para convertir en miniscula y borrar los espacios
        texto = texto.toLowerCase().replace("","");

        //boolean lo utilizamos para hacer que X tenga un valor variable, lo declaramos verdadero pero si en un if sale que es falso, éste cambia su variable a falso.
        boolean esPalindromo = true;

        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        sc.close();
    }

}