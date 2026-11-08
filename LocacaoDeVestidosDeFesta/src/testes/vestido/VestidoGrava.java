package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.grava(
                "Vestido Teste",
                "Azul",
                "M",
                499.90,
                "Disponível"
        ));
    }
}