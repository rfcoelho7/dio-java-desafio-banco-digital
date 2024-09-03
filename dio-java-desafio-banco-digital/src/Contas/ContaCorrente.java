package Contas;
import Clientes.Cliente;

public class ContaCorrente extends Conta {
    protected final String TIPO = "Conta Corrente";
    public ContaCorrente(Cliente cliente){
        super(cliente);
        super.TIPO = TIPO;
    }

}
