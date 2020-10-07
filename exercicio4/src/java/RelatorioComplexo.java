package java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioComplexo extends Relatorio{

    @Override
    protected String cabecalho(Banco banco) {
        return banco.getNome() + " " + banco.getEndereco() + " " + banco.getTelefone() + "\n";
    }

    @Override
    protected String corpo(Banco banco) {
        String corpo = "";
        for (Conta conta : banco.getContas())
            corpo += conta.getNomeTitular() + " " + conta.getAgencia() + " " + conta.getNumeroDaConta() + " "
                    + conta.getSaldo() + "\n";
        return corpo;
    }

    @Override
    protected String rodape(Banco banco) {
        return banco.getEmail() + " - " + dataAtual();
    }

    private String dataAtual() {
        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataAtual);
    }
}
