package br.com.bytebank.banco.teste;

public class TestaString {
    public static void main(String[] args) {
        String nome = "Alura";//objeto literal
        //String outra = nome.replace("A", "a");

        String outra = nome.toLowerCase();
        System.out.println(nome);
        System.out.println(outra);
        
        char c = nome.charAt(3); //char r
        System.out.println(c);

        int pos = nome.indexOf("ura");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
