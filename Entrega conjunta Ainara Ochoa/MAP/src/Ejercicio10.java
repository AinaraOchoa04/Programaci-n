import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {

        Map<String, Integer> votos = new HashMap<>();

        votos.put("Ana", 0);
        votos.put("Juan", 0);
        votos.put("Pedro", 0);

        votos.put("Ana", votos.get("Ana") + 1);
        votos.put("Pedro", votos.get("Pedro") + 1);
        votos.put("Ana", votos.get("Ana") + 1);

        String ganador = "";
        int maxVotos = 0;

        for (Map.Entry<String, Integer> entry : votos.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                ganador = entry.getKey();
            }
        }

        System.out.println("Ganador: " + ganador);
    }
}