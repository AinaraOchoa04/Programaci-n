import java.util.Scanner;

public class Ejercicio9 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Calculadora Avanzada ----------");
        System.out.println("Operaciones disponibles:");
        System.out.println("+  → Suma");
        System.out.println("-  → Resta");
        System.out.println("*  → Multiplicación");
        System.out.println("/  → División");
        System.out.println("^  → Potencia");
        System.out.println("√  → Raíz cuadrada");
        System.out.println("!  → Factorial");

        System.out.print("Elige una operación: ");
        String operacion = sc.next();

        double resultado = 0;

        switch (operacion) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "^":
                System.out.print("Introduce el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Introduce el segundo número: ");
                double num2 = sc.nextDouble();

                switch (operacion) {
                    case "+":
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "-":
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "*":
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                    case "^":
                        if (num2 < 0 && num1 == 0) {
                            System.out.println("Error: 0 elevado a exponente negativo no está definido.");
                        } else {
                            resultado = Math.pow(num1, num2);
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                }
                break;

            case "√":
                System.out.print("Introduce el número: ");
                double n = sc.nextDouble();
                if (n < 0) {
                    System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
                } else {
                    resultado = Math.sqrt(n);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case "!":
                System.out.print("Introduce un número entero no negativo: ");
                int num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Error: el factorial no está definido para números negativos.");
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= num; i++) {
                        factorial *= i;
                    }
                    System.out.println("Resultado: " + factorial);
                }
                break;

            default:
                System.out.println("Operación no válida.");
        }

        sc.close();
    }
}
