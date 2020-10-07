package Java;

public class Conta {

    private double saldo;
    private EstadoConta estado;

    public Conta(double saldo) {
        this.saldo = saldo;
        if (saldo < 0) {
            this.estado = new EstadoNegativo();
        } else {
            this.estado = new EstadoPositivo();
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public EstadoConta getEstado() {
        return estado;
    }

    protected void setEstado(EstadoConta estado) {
        this.estado = estado;
    }

    public void realizaDeposito(double valor) {
        this.estado.realizaDeposito(this, valor);
    }

    public void realizaSaque(double valor) {
        this.estado.realizaSaque(this, valor);
    }

    protected void adicionaAoSaldo(double valor) {
        this.saldo += valor;
    }

    protected void retireDoSaldo(double valor) {
        this.saldo -= valor;
    }
}
