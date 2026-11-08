package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoUpDate {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.alteraStatusComLikeEMaior(
                "Concluida",
                "Finalizada",
                300
        ));
    }
}