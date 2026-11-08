package testes.cliente;

import persistencia.ClienteDAO;

public class ClienteAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(ClienteDAO.altera(
                "Cliente Alterado",
                "111.222.333-44",
                "98888-8888",
                "alterado@email.com",
                "Endereço Alterado",
                1
        ));
    }
}