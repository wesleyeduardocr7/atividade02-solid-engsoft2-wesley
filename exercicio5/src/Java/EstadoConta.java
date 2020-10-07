package Java;

public interface EstadoConta {

    void realizaSaque(Conta conta, double valor);

    void realizaDeposito(Conta conta, double valor);
}
