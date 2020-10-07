package java;

public class RelatorioSimples extends Relatorio{

    @Override
    protected String cabecalho(Banco banco) {
        return banco.getNome() + " "
                + banco.getTelefone() + "\n";
    }

    @Override
    protected String corpo(Banco banco) {
        String corpo = "";
        for (Conta conta : banco.getContas())
            corpo += conta.getNomeTitular() + " "
                    + conta.getSaldo() + "\n";
        return corpo;
    }

    @Override
    protected String rodape(Banco banco) {
        return banco.getNome() + " " +
                banco.getTelefone();
    }
}
