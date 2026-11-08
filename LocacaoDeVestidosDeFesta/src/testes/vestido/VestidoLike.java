package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoLike {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.leTodosLike("Longo"));
    }
}