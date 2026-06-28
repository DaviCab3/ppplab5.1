package Questao3;

public class Main {

    public static void main(String ... args){
        EstacaoTempo estacao = new EstacaoTempo();

        AeroportoObserver aeroporto = new AeroportoObserver();
        estacao.addObserver(aeroporto);

        PrefeituraObserver prefeitura = new PrefeituraObserver();
        estacao.addObserver(prefeitura);

        estacao.setVelocidadeVento(124.0);
        estacao.setTemperatura(35.0);
        estacao.setUmidade(50.0);

        estacao.setUmidade(10.0);
    }

 }