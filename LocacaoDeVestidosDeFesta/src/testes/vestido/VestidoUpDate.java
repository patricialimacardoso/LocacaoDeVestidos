package testes.vestido;

import persistencia.VestidoDAO;

public class VestidoUpDate {

    public static void main(String[] args) throws Exception {
        System.out.println(VestidoDAO.alteraStatusComLikeEMaior(
                "Promoção",
                "Vestido",
                500
        ));
    }
}