package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteUpDate {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.alteraEmailComLikeEMaior(
                "emailnovo@email.com",
                "Ana",
                0
        ));
    }
}