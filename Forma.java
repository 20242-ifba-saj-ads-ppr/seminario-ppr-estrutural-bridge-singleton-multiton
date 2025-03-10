//classe abstrata de forma
abstract class Forma {
    protected Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    abstract void desenhar();
}

//implementação concreta de forma
class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.println("Desenhando um quadrado");
        cor.aplicarCor();
    }
}

class Circulo extends Forma {
    public Circulo(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.println("Desenhando um círculo");
        cor.aplicarCor();
    }
}
