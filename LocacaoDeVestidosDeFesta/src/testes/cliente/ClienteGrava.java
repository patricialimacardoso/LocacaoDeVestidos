package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.grava(
                "Teste Cliente",
                "111.222.333-44",
                "99999-9999",
                "teste@email.com",
                "Rua Teste, Brasília - DF"
        ));
    }
}