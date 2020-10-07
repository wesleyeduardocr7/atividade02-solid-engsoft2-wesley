package Java;

public class EstadoNegativo implements EstadoConta {

    public void realizaSaque(Conta conta, double valor) {
        throw new RuntimeException("Saldo negativo!");
    }

    public void realizaDeposito(Conta conta, double valor) {
        conta.adicionaAoSaldo(valor * .95);
        if (conta.getSaldo() >= 0) {
            conta.setEstado(new EstadoPositivo());
        }
    }
}
