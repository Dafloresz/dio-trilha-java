package geometria;

public class Circulo implements FormaGeometrica{
    private final static double PI = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(getRaio(), 2) * PI;
    }

    @Override
    public String toString() {
        return "Círculo: ";
    }
}
