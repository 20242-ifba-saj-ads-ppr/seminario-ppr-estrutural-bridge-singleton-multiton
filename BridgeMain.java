public class BridgeMain {
    public static void main(String[] args) {
        Forma quadradoVermelho = new Quadrado(new Vermelho());
        System.out.println(quadradoVermelho.desenhar());
        
        Forma circuloAzul = new Circulo(new Azul());
        System.out.println(circuloAzul.desenhar());
    }
}