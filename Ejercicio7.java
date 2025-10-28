import java.util.Scanner;

public class Ejercicio7 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------- Piedra, Papel, Tijera, Lagarto, Spock -------------");

        System.out.println("Turno Jugador 1: ");
        String jugador1 = sc.nextLine().toLowerCase();
        System.out.println("Turno Jugador 2: ");
        String jugador2 = sc.nextLine().toLowerCase();

        String resultado;

        if (jugador1.equals(jugador2)) {
            resultado = "Empate";
        } else {
            switch (jugador1) {
                case "tijera":
                    switch (jugador2){
                        case "papel":
                            resultado = "Tigeras cortan papel. ¡Gana Jugador 1!";
                            break;
                        case "lagarto":
                            resultado = "Tijeras decapitan lagarto. ¡Gana Jugador 1!";
                            break;
                        default:
                            resultado = "¡Gana Jugador 2!";
                    }
                    break;

                case "papel":
                    switch (jugador2){
                        case "piedra":
                            resultado = "Papel cubren piedra. ¡Gana Jugador 1!";
                            break;
                        case "spock":
                            resultado = "Papel desautoriza a Spock. ¡Gana Jugador 1!";
                            break;
                        default:
                            resultado = "¡Gana Jugador 2!";
                    }
                    break;

                case "piedra":
                    switch (jugador2){
                        case "lagarto":
                            resultado = "Piedra aplasta lagarto. ¡Gana Jugador 1!";
                            break;
                        case "tijera":
                            resultado = "Piedra aplasta tijeras. ¡Gana Jugador 1!";
                            break;
                        default:
                            resultado = "¡Gana Jugador 2!";
                    }
                    break;
                case "lagarto":
                    switch (jugador2){
                        case "spock":
                            resultado = "Lagarto envenena Spock. ¡Gana Jugador 1!";
                            break;
                        case "papel":
                            resultado = "Lagarto come papel. ¡Gana Jugador 1!";
                            break;
                        default:
                            resultado = "¡Gana Jugador 2!";
                    }
                    break;

                case "spock":
                    switch (jugador2){
                        case "tijera":
                            resultado = "Spock rompe tijeras. ¡Gana Jugador 1!";
                            break;
                        case "piedra":
                            resultado = "Spock vaporiza piedra. ¡Gana Jugador 1!";
                            break;
                        default:
                            resultado = "¡Gana Jugador 2!";
                    }
                    break;

                default:
                    resultado = "Opción no válida por parte del jugador 1.";
            }
        }

        System.out.println("\n" + resultado);
        sc.close();



    }
}
