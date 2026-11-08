package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.leUm(1));
    }
}