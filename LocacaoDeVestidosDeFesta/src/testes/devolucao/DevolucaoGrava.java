package testes.devolucao;

import java.sql.Date;
import persistencia.DevolucaoDAO;

public class DevolucaoGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(DevolucaoDAO.grava(
                Date.valueOf("2025-09-10"),
                15.00,
                "Vestido devolvido com pequeno atraso"
        ));

    }
}