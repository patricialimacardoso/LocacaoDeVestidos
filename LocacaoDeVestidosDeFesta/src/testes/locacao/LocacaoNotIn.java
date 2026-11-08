package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.leTodosNotIn(1, 2));
    }
}