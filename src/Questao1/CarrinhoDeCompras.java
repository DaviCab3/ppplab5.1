package Questao1;
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

}
