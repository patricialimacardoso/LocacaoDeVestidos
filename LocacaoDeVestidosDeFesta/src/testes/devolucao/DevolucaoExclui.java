package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.exclui(16));
    }
}