package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.grava(
                "Funcionaria Teste",
                "111.222.333-55",
                "99999-1111",
                "funcionaria.teste@email.com",
                "Atendente",
                2200.00
        ));
    }
}