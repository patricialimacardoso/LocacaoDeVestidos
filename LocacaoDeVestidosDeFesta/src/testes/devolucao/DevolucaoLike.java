package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoLike {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.leTodosLike("perfeito"));
    }
}