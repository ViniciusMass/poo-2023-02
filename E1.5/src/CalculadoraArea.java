public class CalculadoraArea {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo(5.0);
        formas[1] = new Retangulo(2.0, 4.0);
        formas[2] = new Triangulo(3.0, 4.0);

        double soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += formas[i].calcularArea();
        }

        System.out.println("A soma das áreas é: " + soma);
    }
}