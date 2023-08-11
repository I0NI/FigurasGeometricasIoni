
package figurasgeometricas;

class Rectangulo extends Figura {
    private final double lado1;
    private final double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}