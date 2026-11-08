package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.exclui(16));
    }
}