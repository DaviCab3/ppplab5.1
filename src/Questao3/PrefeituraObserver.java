package Questao3;

public class PrefeituraObserver implements Observer {

    @Override
    public void update(double temperatura, double velocidadeVento, double humidade) {

        if (humidade < 10.0) {
            emitirAlertaHumidade();
        }
    }

    public void emitirAlertaHumidade(){
        System.out.println("Prefeitura informa: Defesa civil alerta: baixa humidade!");


    }

 }