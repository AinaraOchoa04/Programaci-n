import java.util.Scanner;

public class Gato extends Animal {

    private boolean tieneCola;

    public Gato(String nombre, String especie, boolean tieneCola) {
        super(nombre, especie);
        this.tieneCola = tieneCola;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("¿Tiene cola?: " + (tieneCola ? "Sí" : "No"));
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }

    public void saltar(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El gato está saltando (" + i + ")");
        }
    }

    public static Gato crearGatoPorConsola() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del gato: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la especie del gato: ");
        String especie = sc.nextLine();

        System.out.print("¿El gato tiene cola? (true/false): ");
        boolean tieneCola = sc.nextBoolean();

        return new Gato(nombre, especie, tieneCola);
    }
}
