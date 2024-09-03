import Clientes.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nome Cliente 1" , "123.123.123-12");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.depositar(100);
        cc.transferir(20, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
}
