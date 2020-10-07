package Java;

public class EstadoPositivo implements EstadoConta {

    public void realizaSaque(Conta conta, double valor) {

        conta.retireDoSaldo(valor);

        if (conta.getSaldo() < 0) {
            conta.setEstado(new EstadoNegativo());
        }
    }

    public void realizaDeposito(Conta conta, double valor) {
        conta.adicionaAoSaldo(valor * .98);
    }
}
