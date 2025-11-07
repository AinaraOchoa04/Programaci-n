public class EmpleadoFijo extends Empleado {
    private double salarioMensual;
    private double bono;

    public EmpleadoFijo(String nombre, String id, double salarioMensual, double bono) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual + bono;
    }
}
