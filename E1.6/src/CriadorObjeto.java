public class CriadorObjeto {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(2, 4);
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(8, 5, 7, 6);

        DesenhoQuad desQuad = new DesenhoQuad();
        DesenhoRet desRet = new DesenhoRet();
        DesenhoCirc desCirc = new DesenhoCirc();
        DesenhoTri desTri = new DesenhoTri();

        Figura[] figuras = { quadrado, retangulo, circulo, triangulo };
        int i = 0;
        for (Figura figura : figuras) {
            switch (i) {
                case 0:
                    System.out.println(desQuad.desenhar());
                    break;
                case 1:
                    System.out.println(desRet.desenhar());
                    break;
                case 2:
                    System.out.println(desCirc.desenhar());
                    break;
                case 3:
                    System.out.println(desTri.desenhar());
                    break;
            }
            i++;
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro() + "\n");
        }
    }
}