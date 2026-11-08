package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leTodosNotIn(1, 2));
    }
}