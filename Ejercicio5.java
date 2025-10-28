import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.println("----------Introduce las siguientes medidas en cm----------");
        System.out.println("Lado 1: ");
        lado1 = sc.nextInt();
        System.out.println("Lado 2: ");
        lado2 = sc.nextInt();
        System.out.println("Lado 3: ");
        lado3 = sc.nextInt();
        System.out.println("---------------------------------------------------------");

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 >lado1){
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno");
            }

        } else {
            System.out.println("Los lados introducidos no forman un triangulo válido.");
        }

        sc.close();
    }
}
