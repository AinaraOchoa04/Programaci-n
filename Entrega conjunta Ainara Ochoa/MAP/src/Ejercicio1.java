import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    public static void main(String[] args) {

        Map<String, String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlín");
        paises.put("Portugal", "Lisboa");

        for (Map.Entry<String, String> entry : paises.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}