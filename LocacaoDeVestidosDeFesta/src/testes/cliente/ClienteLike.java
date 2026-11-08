package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteLike {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leTodosLike("Ana"));
    }
}