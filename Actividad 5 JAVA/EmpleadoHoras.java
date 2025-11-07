public class EmpleadoHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHoras(String nombre, String id, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        if (horasTrabajadas > 40) {
            double horasExtra = horasTrabajadas - 40;
            return (40 * tarifaPorHora) + (horasExtra * tarifaPorHora * 1.5);
        }
        return horasTrabajadas * tarifaPorHora;
    }
}