import java.util.Scanner;

public class Ejercicio3 {
    static void main(){
        //Cálculo de notas y promedio
        Scanner sc = new Scanner(System.in);

        int matematicas;
        int lengua;
        int biologia;
        int filosofia;
        int dibujoTecnico;
        double media;

        System.out.println("-----NOTAS 1ºBACHILLER TECNOLÓGICO-----");
        System.out.println("Matemáticas: ");
        matematicas = sc.nextInt();
        System.out.println("Lengua: ");
        lengua = sc.nextInt();
        System.out.println("Biología: ");
        biologia = sc.nextInt();
        System.out.println("Filosofía: ");
        filosofia = sc.nextInt();
        System.out.println("Dibujo Técnico: ");
        dibujoTecnico = sc.nextInt();

        if (matematicas < 0 || matematicas > 100 ||
            lengua < 0 || lengua > 100 ||
            biologia < 0 || biologia > 100 ||
            filosofia < 0 || filosofia > 100 ||
            dibujoTecnico < 0 || dibujoTecnico > 100) {

            System.out.println("Error 404 lwocj c quqdnf: Cálculo inválido");
        } else {
            media = (matematicas + lengua + biologia + filosofia + dibujoTecnico) / 5.0;

            System.out.println("Media: " + media);
            System.out.println("-------------------🏳️‍⚧️🧑🏿🏳️‍⚧️------------------");
            if (media >= 90){
                System.out.println("Calificación: A");
            } else if (media >= 80) {
                System.out.println("Calificación: B");
            } else if (media >= 70) {
                System.out.println("Calificación: C");
            } else if (media >= 60) {
                System.out.println("Calificación: D");
            } else {
                System.out.println("Calificación: F");
            }
            System.out.println("-------------------🏳️‍⚧️🧑🏿🏳️‍⚧️------------------");
        }
        sc.close();
    }
}