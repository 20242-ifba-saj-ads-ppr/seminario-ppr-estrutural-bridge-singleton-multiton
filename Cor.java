interface Cor {
    void aplicarCor();
}

//implementação conclreta das cores
class Vermelho implements Cor{
    public void aplicarCor(){
        System.out.println("Vermelho");
    }
}

class Azul implements Cor{
    public void aplicarCor(){
        System.out.println("Azul");
    }
}