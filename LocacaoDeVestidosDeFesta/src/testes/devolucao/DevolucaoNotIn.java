package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.leTodosNotIn(1, 2));
    }
}