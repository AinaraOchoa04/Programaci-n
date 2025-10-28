import java.util.Scanner;

public class Ejercicio6 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        double ingresos_anuales;
        double tasa;
        int dependientes;
        //Si el usuario tiene más de 3 dependientes restarle un 5% al impuesto total

        System.out.println("¿Cuantos dependientes tiene?");
        dependientes = sc.nextInt();
        System.out.println("Inserte sus ingresos anuales: ");
        ingresos_anuales = sc.nextDouble();

        if (ingresos_anuales < 20000) {
            tasa = 0.05;
        } else if (ingresos_anuales < 40000) {
            tasa = 0.10;
        } else if (ingresos_anuales < 80000) {
            tasa = 0.20;
        } else {
            tasa = 0.30;
        }
        if(dependientes > 3) {
            tasa -= 0.05;
            System.out.println("Se reducira su impuesto un 5% por dependientes numeros.");
        } else {
            System.out.println("Se aplicará un impuesto del " + tasa + "%");
        }
        double impuesto = ingresos_anuales * tasa;

        System.out.println("Tasa de impuesto aplicada: "+ tasa + 100);
        System.out.println("Impuesto total a pagar: " + impuesto);

        sc.close();
    }
}
