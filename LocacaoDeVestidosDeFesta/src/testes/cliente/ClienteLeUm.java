package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leUm(1));
    }
}