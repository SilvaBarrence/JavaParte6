package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardandoConta {

    public static void main(String[] args) {

        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(22, 11);
        guardadorDeContas.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente(22, 11);
        guardadorDeContas.adiciona(cc2);

        int tamanho = guardadorDeContas.getContidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDeContas.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
