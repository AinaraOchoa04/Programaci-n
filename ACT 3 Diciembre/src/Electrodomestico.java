public class Electrodomestico {

    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico; // A+, A, B, C, D, E, F
    protected double peso;

    private final static double PRECIO_DEF = 100;
    private final static Color COLOR_DEF = Color.BLANCO;
    private final static String CONSUMO_DEF = "A";
    private final static double PESO_DEF = 10;

    public Electrodomestico() {
        this(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF, PESO_DEF);
    }

    public Electrodomestico(double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public String getConsumoEnergetico() { return consumoEnergetico; }
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    private String comprobarConsumoEnergetico(String letra) {
        String[] validos = {"A+", "A", "B", "C", "D", "E", "F"};
        for (String v : validos) {
            if (v.equalsIgnoreCase(letra)) return v.toUpperCase();
        }
        return CONSUMO_DEF;
    }

    @Override
    public String toString() {
        return "Precio base: " + precioBase +
                ", Consumo energético: " + consumoEnergetico +
                ", Peso: " + peso + " kg";
    }

    public double precioFinal() {
        double total = precioBase;

        switch (consumoEnergetico) {
            case "A+": total += 120; break;
            case "A":  total += 100; break;
            case "B":  total += 80; break;
            case "C":  total += 60; break;
            case "D":  total += 50; break;
            case "E":  total += 30; break;
            case "F":  total += 10; break;
        }

        if (peso < 20) total += 10;
        else if (peso < 50) total += 30;
        else if (peso < 80) total += 50;
        else total += 100;

        return total;
    }
}

