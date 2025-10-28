import java.util.Scanner;

public class Ejercicio1 {
    static void main (){
        //Sistema de autentificación multiusuario
        Scanner sc = new Scanner(System.in);
        String user;
        String password;

        System.out.println("Seleccione la opción 1, 2, o 3:");
        System.out.println("1.Administrador");
        System.out.println("2.Usuario normal");
        System.out.println("3.Invitado");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("User: ");
        user = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();

        switch (opcion){
            case 1:
                if (user.equals("admin") && password.equals("1234")){
                    System.out.println("Bienvenido, macho alpha, mastodonte, fiera, numero 1, depresador, recompiladora de feas, chulo playa.");
                } else {
                    System.out.println("Acceso denegado 🧑🏿");
                }
                break;

            case 2:
                if (user.equals("user") && password.equals("abcd")) {
                    System.out.println("Bienvenido, usuario normal");
                } else {
                    System.out.println("Acceso denegado 🧑🏿");
                }
                break;

            case 3:
                if (user.equals("guest") && password.equals("xyz")){
                    System.out.println("Bienvenido, invitado");
                } else {
                    System.out.println("Acceso denegado 🧑🏿");
                }
                break;

            default:
                System.out.println("ads");

        }

        sc.close();


    }
}
