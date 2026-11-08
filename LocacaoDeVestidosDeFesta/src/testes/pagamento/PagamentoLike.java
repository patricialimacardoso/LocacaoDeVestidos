package testes.pagamento;

import persistencia.PagamentoDAO;

public class PagamentoLike {

    public static void main(String[] args) throws Exception {
        System.out.println(PagamentoDAO.leTodosLike("Pix"));
    }
}