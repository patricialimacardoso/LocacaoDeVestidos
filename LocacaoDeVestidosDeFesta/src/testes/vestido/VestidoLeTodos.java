package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoLeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.leTodos());
    }
}