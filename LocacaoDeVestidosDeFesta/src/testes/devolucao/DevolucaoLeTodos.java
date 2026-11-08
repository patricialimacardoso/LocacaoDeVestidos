package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoLeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.leTodos());
    }
}