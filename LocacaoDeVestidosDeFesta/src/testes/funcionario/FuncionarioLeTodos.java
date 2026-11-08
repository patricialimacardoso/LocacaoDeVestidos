package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioLeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.leTodos());
    }
}