package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 3451);

        conta.deposita(200.0);
        try {
            conta.saca(210.0);
        } catch (SaldoInsulficienteException ex) {
            System.out.println("Ex: "+ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }
}
