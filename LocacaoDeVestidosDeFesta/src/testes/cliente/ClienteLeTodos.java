package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteLeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leTodos());
    }
}