package java;

public class InvestimentoArrojado implements Investimento{

    public double realizaInvestimento(Conta conta) {
        if ( random.nextDouble() < 0.2 ) {
            return conta.getSaldo() * 0.05;
        }
        else if ( random.nextDouble() < 0.5 ) {
            return conta.getSaldo() * 0.06;
        }
        return conta.getSaldo() * 0.006;
    }
}
