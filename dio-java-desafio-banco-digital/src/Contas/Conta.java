package Contas;

import Clientes.Cliente;

public abstract class Conta implements Contas.IConta {
    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String TIPO;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;        
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor; 
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);        
    }
    @Override
    public void imprimirExtrato(){
        System.out.println(String.format("\n=== Extrato: %s ===", this.TIPO));
        System.out.println(String.format("\tTitular %s", this.cliente.getNome()));
        System.out.println(String.format("\tAgencia %d", this.agencia));
        System.out.println(String.format("\tNumero %d", this.numero));
        System.out.println(String.format("\tSaldo %.2f\n", this.saldo));
    }

}
