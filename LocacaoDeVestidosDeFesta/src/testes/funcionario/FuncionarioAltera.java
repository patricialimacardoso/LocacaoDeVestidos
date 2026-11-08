package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.altera(
                "Funcionaria Alterada",
                "111.222.333-55",
                "99999-2222",
                "funcionaria.alterada@email.com",
                "Gerente",
                4000.00,
                4
        ));
    }
}