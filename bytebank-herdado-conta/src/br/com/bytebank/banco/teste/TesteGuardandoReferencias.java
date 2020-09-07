package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardandoReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        ContaCorrente cc = new ContaCorrente(22, 11);
        guardadorDeReferencias.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente(22, 11);
        guardadorDeReferencias.adiciona(cc2);

        int tamanho = guardadorDeReferencias.getContidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardadorDeReferencias.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
