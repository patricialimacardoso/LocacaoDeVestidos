package testes.devolucao;

import java.sql.Date;
import persistencia.DevolucaoDAO;

public class DevolucaoAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(DevolucaoDAO.altera(
                Date.valueOf("2025-09-11"),
                20.00,
                "Observacao alterada",
                16
        ));

    }
}