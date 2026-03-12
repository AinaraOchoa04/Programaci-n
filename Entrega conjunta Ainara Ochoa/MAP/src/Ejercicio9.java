import java.util.*;

class Empleado {

    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}

public class Ejercicio9 {

    public static void main(String[] args) {

        TreeMap<String, Empleado> empleados = new TreeMap<>();

        empleados.put("123A", new Empleado("Ana", 2000));
        empleados.put("111B", new Empleado("Juan", 1800));
        empleados.put("555C", new Empleado("Pedro", 2200));

        for (Map.Entry<String, Empleado> entry : empleados.entrySet()) {

            System.out.println(
                    entry.getKey() + " - " +
                            entry.getValue().nombre + " - " +
                            entry.getValue().salario
            );
        }
    }
}