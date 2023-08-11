
package figurasgeometricas;

class Triangulo extends Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    double calcularPerimetro() {
        return 3 * base;
    }
}