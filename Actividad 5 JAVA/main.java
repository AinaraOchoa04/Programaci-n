public class main {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoHoras("Carlos Pérez", "E001", 45, 15.0);
        Empleado e2 = new EmpleadoFijo("María López", "E002", 2000.0, 300.0);

        System.out.println(e1.getNombre() + " gana: " + e1.calcularSalario() + "€");
        System.out.println(e2.getNombre() + " gana: " + e2.calcularSalario() + "€");
    }
}