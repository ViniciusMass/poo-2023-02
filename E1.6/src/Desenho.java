interface Desenho {
    String desenhar();
}

class DesenhoQuad implements Desenho {
    public String desenhar() {
        return "Desenhando a Figura Quadrado:";
    }
}

class DesenhoCirc implements Desenho {
    public String desenhar() {
        return "Desenhando a Figura Circulo:";
    }
}

class DesenhoTri implements Desenho {
    public String desenhar() {
        return "Desenhando a Figura Triangulo:";
    }
}

class DesenhoRet implements Desenho {
    public String desenhar() {
        return "Desenhando a Figura Retangulo:";
    }
}