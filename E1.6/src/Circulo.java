class Circulo extends Figura {
    double raio;

    public Circulo() {
        this.raio = 0;
    }

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
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
