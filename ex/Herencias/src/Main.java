import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CREAR PERRO ===");
        Perro perro = Perro.crearPerroPorConsola();
        System.out.print("¿Cuántas veces debe mover la cola?: ");
        int mov = sc.nextInt();
        perro.mostrarDetalles();
        perro.hacerSonido();
        perro.moverCola(mov);

        sc.nextLine();

        System.out.println("\n=== CREAR GATO ===");
        Gato gato = Gato.crearGatoPorConsola();
        System.out.print("¿Cuántas veces debe saltar?: ");
        int saltos = sc.nextInt();
        gato.mostrarDetalles();
        gato.hacerSonido();
        gato.saltar(saltos);

        sc.nextLine();

        System.out.println("\n=== CREAR LORO ===");
        Loro loro = Loro.crearLoroPorConsola();
        System.out.print("¿Cuántas veces debe volar?: ");
        int vuelos = sc.nextInt();
        loro.mostrarDetalles();
        loro.hacerSonido();
        loro.volar(vuelos);

        sc.close();
    }
}