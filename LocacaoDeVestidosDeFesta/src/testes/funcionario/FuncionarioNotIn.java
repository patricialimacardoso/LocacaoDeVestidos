package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.leTodosNotIn(1, 2));
    }
}