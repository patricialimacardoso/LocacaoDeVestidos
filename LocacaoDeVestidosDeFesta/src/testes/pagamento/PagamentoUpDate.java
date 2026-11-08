package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoUpDate {

    public static void main(String[] args) throws Exception {

        System.out.println(PagamentoDAO.alteraValorComLikeEMaior(
                500.00,
                "Pix",
                5
        ));

    }
}