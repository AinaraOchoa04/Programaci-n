import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        //Calclo de descuentos en una tienda
        Scanner sc = new Scanner(System.in);

        double precio;
        String tipoCliente;
        double descuento = 0.0;

        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el tipo de cliente (regular / premium / vip): ");
        tipoCliente = sc.nextLine().toLowerCase();

        switch (tipoCliente) {
            case "regular":
                descuento = 0.05;
                break;

            case "premium":
                descuento = 0.10;
                break;

            case "vip":
                descuento = 0.20;
                if (precio > 500) {
                    descuento += 0.05;
                }
                break;

            default:
                System.out.println("Tipo de cliente no válido. No se aplicará descuento.");
                descuento = 0.0;
        }
        double precioFinal = precio - (precio * descuento);

        System.out.println("-------------------🏳️‍⚧️🧑🏿🏳️‍⚧️------------------");
        System.out.println("Tipo de cliente: " + tipoCliente.toUpperCase());
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Precio final: " + precioFinal + "€");
        System.out.println("-------------------🏳️‍⚧️🧑🏿🏳️‍⚧️------------------");

        sc.close();
    }
}
