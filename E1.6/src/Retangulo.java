class Retangulo extends Quadrado {
    double altura;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return altura * getLado();
    }

    @Override
    double calcularPerimetro() {
        return 2 * (altura + getLado());
    }
}