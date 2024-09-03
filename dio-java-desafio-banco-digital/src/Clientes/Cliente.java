package Clientes;
public class Cliente {

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

}
