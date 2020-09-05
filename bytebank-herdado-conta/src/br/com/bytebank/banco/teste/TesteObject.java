package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(2);
        System.out.println(false);

        Object cc = new ContaCorrente(12, 23);
        Object cp = new ContaPoupanca(34, 56);
        Object cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);
        //System.out.println(cliente);

        println(cp);

    }

    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    static void println(Object referencia) {}

}
