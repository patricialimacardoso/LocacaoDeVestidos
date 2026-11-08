package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.exclui(16));
    }
}