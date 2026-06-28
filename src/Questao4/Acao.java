package Questao4;
import java.util.ArrayList;
import java.util.List;
class Acao implements Sujeito {
    private String nome;
    private double precoAtual;
    private List<Observer> investidores = new ArrayList<>(); // Lista de interessados

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.precoAtual = precoInicial;
    }

    public String getNome() {
        return nome;
    }

    // O método principal que altera o preço e avisa todo mundo
    public void setPrecoAtual(double novoPreco) {
        System.out.println("\n[MERCADO] O preço da ação " + this.nome + " mudou para R$ " + novoPreco);
        this.precoAtual = novoPreco;
        notificarObservadores();
    }

    @Override
    public void adicionarObservador(Observer o) {
        investidores.add(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer investidor : investidores) {
            investidor.atualizar(this.precoAtual);
        }
    }
}
