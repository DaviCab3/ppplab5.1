package Questao1;

public class Main {

    public static void main(String ... args){

        PagamentoStrategy strategy = new PixPagamento();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(strategy);

        // adicionou itens
        Item bala = new Item();
        bala.setPreco(2.5);

        carrinho.adicionaItem(bala);
        carrinho.realizaPagamento();


    }
}
