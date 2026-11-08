package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.leUm(1));
    }
}