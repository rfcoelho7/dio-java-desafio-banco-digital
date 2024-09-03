package Contas;
import Clientes.Cliente;

public class ContaPoupanca extends Conta {
    protected final String TIPO = "Conta Poupança";
    public ContaPoupanca(Cliente cliente){
        super(cliente);
        super.TIPO = TIPO;
    }

}
