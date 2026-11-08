package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoLeTodos {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.leTodos());
    }
}