package testes.pagamento;

import persistencia.PagamentoDAO;
import java.sql.Date;

public class PagamentoGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(PagamentoDAO.grava(
                "Pix",
                399.90,
                Date.valueOf("2025-09-01")
        ));

    }
}