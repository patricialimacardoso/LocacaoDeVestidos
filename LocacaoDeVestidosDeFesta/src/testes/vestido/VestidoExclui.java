package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.exclui(14));
    }
}