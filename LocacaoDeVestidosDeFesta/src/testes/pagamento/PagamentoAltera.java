package testes.pagamento;

import persistencia.PagamentoDAO;
import java.sql.Date;

public class PagamentoAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(PagamentoDAO.altera(
                "Cartao",
                450.00,
                Date.valueOf("2025-09-02"),
                16
        ));

    }
}