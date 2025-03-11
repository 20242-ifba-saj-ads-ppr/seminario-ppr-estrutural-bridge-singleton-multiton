//classe abstrata de forma
abstract class Forma {
    private Cor cor;

    public Forma (Cor cor) {
        setCor(cor);
    }

    abstract String desenhar();

    protected Cor getCor() {
        return cor;
    }

    protected void setCor(Cor cor) {
        this.cor = cor;
    }
}

//implementação concreta de forma
class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor);
    }

    public String desenhar() {
        return "Desenhando um quadrado" + getCor().aplicarCor();
    }
}

class Circulo extends Forma {
    public Circulo(Cor cor) {
        super(cor);
    }

    public String desenhar() {
        return "Desenhando um círculo" + getCor().aplicarCor();
    }
}
