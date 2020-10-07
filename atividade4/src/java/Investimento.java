package java;

import java.util.Random;

public interface Investimento {

    Random random = new Random();

    double realizaInvestimento(Conta conta);

}
