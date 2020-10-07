package java;

public class RealizadorDeInvestimento {

    protected double imposto = 0.25;

    public void calculaInvestimento(Conta conta, Investimento investimento) {

        double retornoInvestimento = investimento.realizaInvestimento(conta);

        double retornoInvestimentoComImposto = retornoInvestimento * imposto;

        conta.adicionaInvestimento(retornoInvestimento - retornoInvestimentoComImposto);
    }

}
