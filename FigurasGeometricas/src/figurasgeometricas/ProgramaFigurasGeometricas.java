
package figurasgeometricas;

public class ProgramaFigurasGeometricas {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        Figura triangulo = new Triangulo(3.0, 4.0);

        System.out.println("El Área del círculo es: " + circulo.calcularArea());
        System.out.println("El Perímetro del círculo es: " + circulo.calcularPerimetro());

        System.out.println("El Área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El Perímetro del rectángulo es: " + rectangulo.calcularPerimetro());

        System.out.println("El Área del triángulo es: " + triangulo.calcularArea());
        System.out.println("El Perímetro del triángulo es: " + triangulo.calcularPerimetro());
        System.out.println("Gracias por ver :b, bueno programar......");
    }
}
