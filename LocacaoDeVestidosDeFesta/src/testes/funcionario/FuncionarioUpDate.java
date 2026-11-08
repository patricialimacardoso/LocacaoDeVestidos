package testes.funcionario;

import persistencia.FuncionarioDAO;

public class FuncionarioUpDate {

    public static void main(String[] args) throws Exception {
        System.out.println(FuncionarioDAO.alteraSalarioComLikeEMaior(
                2500.00,
                "Vendedora",
                0
        ));
    }
}