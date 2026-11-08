package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioLike {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.leTodosLike("Vendedora"));
    }
}