package java;

abstract  class Relatorio {

    protected abstract String cabecalho(Banco banco);

    protected abstract String corpo(Banco banco);

    protected abstract String rodape(Banco banco);

}
