import java.util.Scanner;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String especie, String raza) {
        super(nombre, especie);
        this.raza = raza;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    public void moverCola(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El perro está moviendo la cola (" + i + ")");
        }
    }

    public static Perro crearPerroPorConsola() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del perro: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la especie del perro: ");
        String especie = sc.nextLine();

        System.out.print("Introduce la raza del perro: ");
        String raza = sc.nextLine();

        return new Perro(nombre, especie, raza);
    }
}
