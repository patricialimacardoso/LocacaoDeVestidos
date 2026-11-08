package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.leTodosBetween(1, 5));
    }
}