interface Cor {
    public String aplicarCor();
}

//implementação conclreta das cores
class Vermelho implements Cor{
    public String aplicarCor(){
        return " Vermelho";
    }
}

class Azul implements Cor{
    public String aplicarCor(){
        return " Azul";
    }
}