package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.leTodosBetween(200, 600));
    }
}