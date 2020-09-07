package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

//        ContaCorrente cc1 = new ContaCorrente(22, 22);
//        ContaCorrente cc2 = new ContaCorrente(22, 22);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(22, 11);
        lista.add(cc);
        ContaCorrente cc2 = new ContaCorrente(22, 11);
        lista.add(cc2);
        ContaCorrente cc3 = new ContaCorrente(22, 11);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe?: " + existe);

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }

    }
}
