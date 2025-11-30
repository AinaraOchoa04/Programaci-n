public class Empleado {
    private String nombre;
    private String apellidos;
    private double sueldoBase;
    private double retenciones;
    private String categoria;
    private static int numEmpleados = 0;
    private static double primaGlobal = 0;

    // CONSTRUCTOR
    public Empleado(String nombre, String apellidos, double sueldoBase, double retenciones, String categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.retenciones = retenciones;
        this.categoria = categoria;
        numEmpleados++;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.apellidos = "";
        this.sueldoBase = 1500;
        this.retenciones = 5;
        this.categoria = "A";
        numEmpleados++;
    }

    public double calcularSueldo() {
        double incrementoCategoria = 0;
        switch (categoria) {
            case "A":
                incrementoCategoria = 100;
                break;
            case "B":
                incrementoCategoria = 200;
                break;
            case "C":
                incrementoCategoria = 300;
                break;
            case "D":
                incrementoCategoria = 500;
                break;
        }
        double sueldoConCategoria = sueldoBase + incrementoCategoria;
        double sueldoFinal = sueldoConCategoria * (1 + primaGlobal / 100);
        return sueldoFinal - (sueldoFinal * retenciones / 100);
    }
    public String toString() {
        return nombre + " " + apellidos + ", Sueldo final: " + calcularSueldo() + " €";
    }

    public static double getPrimaGlobal() {
        return primaGlobal;
    }

    public static void setPrimaGlobal(double primaGlobal) {
        Empleado.primaGlobal = primaGlobal;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }
}