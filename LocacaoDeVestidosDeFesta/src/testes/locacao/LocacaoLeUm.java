package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.leUm(1));
    }
}