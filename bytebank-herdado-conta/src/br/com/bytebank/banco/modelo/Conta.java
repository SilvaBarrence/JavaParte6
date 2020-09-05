package br.com.bytebank.banco.modelo;

/**
 * Classe modelo para criar uma conta no bytebank
 *
 * @author Gabriel de S. Silva Barrence
 * @version 0.1
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;


    /**
     * Contrutor para inicializar o objeto Conto a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);


    /**
     * Valor precisa ser maior que o saldo
     * @param valor
     * @throws SaldoInsulficienteException
     */
    public void saca(double valor)  throws SaldoInsulficienteException{

        if (this.saldo < valor){
            throw new SaldoInsulficienteException("Saldo " + this.saldo + ", valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsulficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Número "+ this.numero+", Agencia: "+ this.agencia;
    }
}