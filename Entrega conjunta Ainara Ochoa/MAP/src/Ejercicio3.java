import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        int opcion;

        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar número");
            System.out.println("3. Mostrar agenda");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Teléfono:");
                    String telefono = sc.nextLine();
                    agenda.put(nombre, telefono);
                    break;

                case 2:
                    System.out.println("Nombre a buscar:");
                    nombre = sc.nextLine();
                    System.out.println("Teléfono: " + agenda.get(nombre));
                    break;

                case 3:
                    for (Map.Entry<String, String> entry : agenda.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;
            }

        } while (opcion != 4);
    }
}