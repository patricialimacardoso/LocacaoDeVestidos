package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoBetween {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.leTodosBetween(300, 600));
    }
}