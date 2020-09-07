package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc = new ContaCorrente(22, 11);
        lista.add(cc);
        ContaCorrente cc2 = new ContaCorrente(22, 11);
        lista.add(cc2);

        System.out.println(lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println("Tamanho: "+ lista.size());

        ContaCorrente cc3 = new ContaCorrente(33, 44);
        lista.add(cc3);
        ContaCorrente cc4 = new ContaCorrente(55, 66);
        lista.add(cc4);

        for(Conta oRef : lista){
            System.out.println(oRef);
        }

    }
}
