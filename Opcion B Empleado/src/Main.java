public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado pedro = new Empleado("Pedro Pérez", "", 1300, 2, "B");
        Empleado ana = new Empleado("Ana Díez");
        Empleado carmen = new Empleado("Carmen Lorenzo", "", 1250, 6, "D");

        // Mostrar los empleados
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());

        // Aplicar prima global del 10%
        Empleado.setPrimaGlobal(10);

        // Pedro asciende a la categoría C
        pedro = new Empleado("Pedro Pérez", "", 1300, 2, "C");

        // Mostrar los empleados nuevamente
        System.out.println("\nDespués de aplicar prima y cambio de categoría:");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());
    }
}

