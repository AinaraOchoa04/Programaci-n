import java.util.Scanner;

public class Ejercicio10 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        final int num_materias = 6;
        double[] calificaciones = new double[num_materias];
        double[] pesos = new double[num_materias];

        double sumaPesos = 0;
        double promedioPonderado = 0;

        System.out.println("---------- Sistema de Gestión de Calificaciones ----------");

        // Pedir calificaciones y pesos
        for (int i = 0; i < num_materias; i++) {
            System.out.print("Introduce la calificación de la materia " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();

            System.out.print("Introduce el peso porcentual de la materia " + (i + 1) + " (%): ");
            pesos[i] = sc.nextDouble();

            sumaPesos += pesos[i];
        }

        if (sumaPesos != 100) {
            System.out.println("\nError: la suma de los pesos debe ser igual a 100%. Actualmente es " + sumaPesos + "%.");
        } else {
            for (int i = 0; i < num_materias; i++) {
                promedioPonderado += calificaciones[i] * (pesos[i] / 100);
            }

            System.out.println("Promedio ponderado:" + promedioPonderado);

            if (promedioPonderado < 60) {
                System.out.println("Resultado: Suspenso 😞");
            } else {
                System.out.println("Resultado: Aprobado 🎉");
            }
        }

        sc.close();

    }
}
