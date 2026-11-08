package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.exclui(4));
    }
}