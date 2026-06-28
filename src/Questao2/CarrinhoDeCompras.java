package Questao2;

import Questao1.Item;
import Questao1.PagamentoStrategy;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    PagamentoStrategy pagamentoStrategy;

    List<Item> itens  = new ArrayList();


    public CarrinhoDeCompras(PagamentoStrategy ps){
        this.pagamentoStrategy = ps;
    }

    public void adicionaItem(Item item){
        this.itens.add(item);
    }

    public void removeItem(Item item){
        this.itens.remove(item);
    }

    public float calculaTotal(){
        float total = 0;

        for(Item i : itens){
            total += i.getPreco();
        }
        return total;
    }

    public void realizaPagamento(){
        float total = calculaTotal();
        pagamentoStrategy.pagar(total);
    }

    public double calculaFrete(FreteStrategy freteStrategy) {
        return freteStrategy.calcular();
    }


    public void realizaPagamento(PagamentoStrategy pagamentoStrategy, double valorFrete) {
        double total = calculaTotal() + valorFrete;
        pagamentoStrategy.pagar(total);
    }

}
