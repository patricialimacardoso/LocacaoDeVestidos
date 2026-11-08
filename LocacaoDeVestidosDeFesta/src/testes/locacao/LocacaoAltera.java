package testes.locacao;

import java.sql.Date;
import persistencia.LocacaoDAO;

public class LocacaoAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.altera(
                Date.valueOf("2025-09-02"),
                Date.valueOf("2025-09-06"),
                450.00,
                "Alterada",
                2,
                2,
                2,
                16,
                16,
                16
        ));
    }
}