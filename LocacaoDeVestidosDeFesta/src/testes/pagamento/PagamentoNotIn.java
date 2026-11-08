package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoNotIn {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.leTodosNotIn(1, 2));
    }
}