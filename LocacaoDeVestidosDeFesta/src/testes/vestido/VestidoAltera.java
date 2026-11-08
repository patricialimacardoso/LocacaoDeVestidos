package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.altera(
                "Vestido Alterado",
                "Preto",
                "G",
                599.90,
                "Alugado",
                14
        ));
    }
}