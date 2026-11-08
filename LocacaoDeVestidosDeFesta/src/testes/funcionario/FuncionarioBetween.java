package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.leTodosBetween(2000, 3000));
    }
}