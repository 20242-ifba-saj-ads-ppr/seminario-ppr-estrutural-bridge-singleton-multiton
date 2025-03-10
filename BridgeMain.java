public class BridgeMain {
    public static void main(String[] args) {
        Forma quadradoVermelho = new Quadrado(new Vermelho());
        quadradoVermelho.desenhar();
        
        Forma circuloAzul = new Circulo(new Azul());
        circuloAzul.desenhar();
    }
}