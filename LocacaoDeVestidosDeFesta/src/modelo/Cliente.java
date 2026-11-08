package modelo;

public class Cliente extends Pessoa{
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Cliente(){
    }
    
    public Cliente(int id, String nome, String cpf, String telefone, String email, String endereco){
        super(id, nome, cpf, telefone, email);
        this.endereco=endereco;
    }
    
    public String toString(){
        return "\n ================== DADOS DA PESSOA ================== " +
               "\n ---------------------- CLIENTE ---------------------- " + 
               "\n ===================================================== " +
               "\n ID_CLIENTE: " + getId() +
               "\n NOME: " + getNome() +
               "\n CPF: " + getCpf() +
               "\n TELEFONE: " + getTelefone() +
               "\n EMAIL: " + getEmail() +
               "\n ENDEREÇO: " + getEndereco() +
               "\n ===================================================== ";
    }
}
