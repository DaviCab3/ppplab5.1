package Questao1;

public class CartaoPagamento implements PagamentoStrategy {


    public void pagar(double total) {
        System.out.println("Pagando com cartao");
    }

}