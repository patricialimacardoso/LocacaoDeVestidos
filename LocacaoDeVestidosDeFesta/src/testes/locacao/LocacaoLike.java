package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoLike {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.leTodosLike("Finalizada"));
    }
}