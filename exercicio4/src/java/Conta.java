package java;

public class Conta {

    private String numeroDaConta;
    private String nomeTitular;
    private Agencia agencia;
    private double saldo;

    public Conta(String numeroDaConta, String nomeTitular, Agencia agencia, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
