package testes.devolucao;

import persistencia.DevolucaoDAO;

public class DevolucaoBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(DevolucaoDAO.leTodosBetween(0, 30));
    }
}