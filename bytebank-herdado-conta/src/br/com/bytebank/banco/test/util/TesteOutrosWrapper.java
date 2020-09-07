package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);// Autoboxing
        System.out.println(idadeRef.doubleValue());//Unboxing

        Double dRef = Double.valueOf(2.3);// Autoboxing
        System.out.println(dRef.doubleValue());//Unboxing

        Boolean bRef = Boolean.FALSE;// Autoboxing
        System.out.println(bRef.booleanValue());//Unboxing

        List<Number> list = new ArrayList<>();
        list.add(10);
        list.add(23.4);
        list.add(24.6f);

    }
}
