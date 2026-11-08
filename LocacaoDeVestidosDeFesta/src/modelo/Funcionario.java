package modelo;

public class Funcionario extends Pessoa{
    private String cargo;
    private Double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Funcionario(){
    }
    
    public Funcionario(int id, String nome, String cpf, String telefone, 
            String email, String cargo, Double salario){
        super(id, nome, cpf, telefone, email);
        this.cargo=cargo;
        this.salario=salario;
    }
    
    public String toString(){
        return "\n ================== DADOS DA PESSOA ================== " +
               "\n -------------------- FUNCIONÁRIO -------------------- " + 
               "\n ===================================================== " +
               "\n ID_FUNCIONARIO: " + getId() +
               "\n NOME: " + getNome() +
               "\n CPF: " + getCpf() +
               "\n TELEFONE: " + getTelefone() +
               "\n EMAIL: " + getEmail() +
               "\n CARGO: " + getCargo() +
               "\n SALÁRIO: " + getSalario() +
               "\n ===================================================== " ;
    }
}
