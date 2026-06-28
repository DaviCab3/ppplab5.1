package Questao4;

class AcaoBroker {
public void vender(String nomeAcao, String investidor, double preco) {
    System.out.println(" -> BROKER: Vendendo " + nomeAcao + " para " + investidor + " por R$ " + preco);
}

public void comprar(String nomeAcao, String investidor, double preco) {
    System.out.println(" -> BROKER: Comprando " + nomeAcao + " para " + investidor + " por R$ " + preco);
}
}
