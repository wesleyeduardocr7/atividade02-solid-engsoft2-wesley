package java;

public class InvestimentoConservador {

    public double realizaInvestimento(Conta conta) {
        return conta.getSaldo() * 0.008;
    }

}
