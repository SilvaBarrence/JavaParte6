package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29);// Autoboxing
        System.out.println(idadeRef.doubleValue());
        int valor = idadeRef.intValue(); //Unboxing

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);


        String s = args[0];
        //Integer num = Integer.valueOf(s);
        int num = Integer.parseInt(s);
        System.out.println(num);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // Autoboxing
    }
}
