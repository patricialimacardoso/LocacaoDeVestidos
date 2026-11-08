package testes.locacao;

import java.sql.Date;
import persistencia.LocacaoDAO;

public class LocacaoGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.grava(
                Date.valueOf("2025-09-01"),
                Date.valueOf("2025-09-05"),
                399.90,
                "Finalizada",
                1,
                1,
                1,
                16,
                16
        ));
    }
}