package testes.locacao;

import persistencia.LocacaoDAO;

public class LocacaoBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(LocacaoDAO.leTodosBetween(200, 600));
    }
}