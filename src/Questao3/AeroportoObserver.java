package Questao3;

public class AeroportoObserver implements Observer {

    @Override
    public void update(double temperatura, double velocidadeVento, double humidade) {

        if (velocidadeVento > 100.0) {
            emitirAlertaVento();
        }
    }

    public void emitirAlertaVento(){
        System.out.println("Aeroporto informa: Rajadas de vento perigosas");


    }
}