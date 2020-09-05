package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TestesTributaveis {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222, 333);
        contaCorrente.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());

    }

}
