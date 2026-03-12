import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> estudiantes = new HashMap<>();

        ArrayList<Integer> notasAna = new ArrayList<>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> notasJuan = new ArrayList<>(Arrays.asList(6, 5, 7));

        estudiantes.put("Ana", notasAna);
        estudiantes.put("Juan", notasJuan);

        for (String nombre : estudiantes.keySet()) {

            ArrayList<Integer> notas = estudiantes.get(nombre);
            double suma = 0;

            for (int nota : notas) {
                suma += nota;
            }

            double promedio = suma / notas.size();

            System.out.println(nombre + " promedio: " + promedio);
        }
    }
}