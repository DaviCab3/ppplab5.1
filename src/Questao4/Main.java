package Questao4;

public class Main {
    public static void main(String[] args) {
        AcaoBroker corretor = new AcaoBroker();

        // Criamos uma ação custando R$ 35.00
        Acao petr4 = new Acao("PETR4", 35.00);

        // Criamos os investidores já passando seus limites
        Investidor joao = new Investidor("João", petr4, corretor, 30.00, 40.00);
        Investidor maria = new Investidor("Maria", petr4, corretor, 25.00, 38.00);

        // Simulando o sobe e desce do mercado
        petr4.setPrecoAtual(36.00); // Ninguém faz nada
        petr4.setPrecoAtual(39.00); // Maria Vende (passou de 38)
        petr4.setPrecoAtual(29.00); // João Compra (caiu de 30)
    }
}