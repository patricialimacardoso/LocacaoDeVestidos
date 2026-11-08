package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.exclui(16));
    }
}