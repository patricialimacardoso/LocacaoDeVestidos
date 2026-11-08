package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.leTodosNotIn(1, 2));
    }
}