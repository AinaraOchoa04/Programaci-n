public class Main {
    public static void main(String[] args) {
        
        Empleado pedro = new Empleado("Pedro Pérez", "", 1300, 2, "B");
        Empleado ana = new Empleado("Ana Díez");
        Empleado carmen = new Empleado("Carmen Lorenzo", "", 1250, 6, "D");

        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());
        
        Empleado.setPrimaGlobal(10);

        pedro = new Empleado("Pedro Pérez", "", 1300, 2, "C");

        System.out.println("\nDespués de aplicar prima y cambio de categoría:");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(carmen);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());
    }
}

