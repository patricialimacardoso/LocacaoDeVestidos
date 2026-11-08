package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.leUm(1));
    }
}