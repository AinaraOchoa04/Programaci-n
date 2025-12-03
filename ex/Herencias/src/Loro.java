import java.util.Scanner;

public class Loro extends Animal {

    private String color;

    public Loro(String nombre, String especie, String color) {
        super(nombre, especie);
        this.color = color;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Color del loro: " + color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El loro dice: ¡Piiiip piiiip!");
    }

    public void volar(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El loro está volando (" + i + ")");
        }
    }

    public static Loro crearLoroPorConsola() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del loro: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la especie del loro: ");
        String especie = sc.nextLine();

        System.out.print("Introduce el color del loro: ");
        String color = sc.nextLine();

        return new Loro(nombre, especie, color);
    }
}