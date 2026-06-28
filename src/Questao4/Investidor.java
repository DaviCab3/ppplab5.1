package Questao4;

class Investidor implements Observer {
    private String nome;
    private Acao acaoMonitorada;
    private AcaoBroker broker;

    // Limites simplificados direto na classe
    private double limiteMinimo;
    private double limiteMaximo;

    public Investidor(String nome, Acao acao, AcaoBroker broker, double min, double max) {
        this.nome = nome;
        this.acaoMonitorada = acao;
        this.broker = broker;
        this.limiteMinimo = min;
        this.limiteMaximo = max;

        // O investidor já se inscreve na ação no momento em que é criado
        this.acaoMonitorada.adicionarObservador(this);
    }

    @Override
    public void atualizar(double precoAtual) {
        // Se bater no teto, Vende
        if (precoAtual >= limiteMaximo) {
            System.out.println("Limite máximo de " + nome + " atingido!");
            broker.vender(acaoMonitorada.getNome(), nome, precoAtual);
        }
        // Se bater no piso, Compra
        else if (precoAtual <= limiteMinimo) {
            System.out.println("Limite mínimo de " + nome + " atingido!");
            broker.comprar(acaoMonitorada.getNome(), nome, precoAtual);
        }
    }
}
