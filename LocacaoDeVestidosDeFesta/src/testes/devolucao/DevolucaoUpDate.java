package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoUpDate {

    public static void main(String[] args) throws Exception {

        System.out.println(
                DevolucaoDAO.alteraMultaComLikeEMaior(
                        50.00,
                        "atraso",
                        5
                )
        );

    }
}