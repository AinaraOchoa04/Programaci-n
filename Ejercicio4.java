import java.util.Scanner;

public class Ejercicio4 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        //Validación de una fecha
        int day;
        int month;
        int year;

        System.out.println("Introduce el día: ");
        day = sc.nextInt();
        System.out.println("Introduce el mes: ");
        month = sc.nextInt();
        System.out.println("Introdude el año: ");
        year = sc.nextInt();

        int diasDelMes = 0;
        boolean fechaValida = true;

        boolean bisiesto;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            bisiesto = true;
        } else {
            bisiesto = false;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasDelMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasDelMes = 30;
            case 2:
                if (bisiesto)
                    diasDelMes = 29;
                else
                    diasDelMes = 28;
                break;
            default:
                fechaValida = false;
        }

        if (fechaValida) {
            if (day < 1 || day > diasDelMes){
                fechaValida = false;
            }
        }

        if (fechaValida)
            System.out.println("La fecha " + day + "/" + month + "/" + year + " es válida");
        else
            System.out.println("La fecha introducida no es válida");

        sc.close();







    }
}
