class Triangulo extends Figura {
    double altura, base, lado1, lado2;
    
    public Triangulo() {
        this.altura = 0;
        this.base = 0;
        this.lado1 = 0;
        this.lado2 = 0;
    }
    public Triangulo(double altura, double base, double lado1, double lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    double calcularArea(){
        return (base * altura) / 2;
    }
    @Override
    double calcularPerimetro(){
        return lado1 + lado2 + base;
    }
}