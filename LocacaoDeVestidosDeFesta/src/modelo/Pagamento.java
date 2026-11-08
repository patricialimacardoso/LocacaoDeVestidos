package modelo;

import java.util.Date;

public class Pagamento {

    private int idPagamento;
    private String formaPagamento;
    private Double valorPago;
    private Date dataPagamento;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public Pagamento() {
    }
    
    public Pagamento(int idPagamento, String formaPagamento, Double valorPago, 
            Date dataPagamento) {
        this.idPagamento=idPagamento;
        this.formaPagamento=formaPagamento;
        this.valorPago=valorPago;
        this.dataPagamento=dataPagamento;
    }
    
    public String toString(){
        return "\n ================= DADOS DO PAGAMENTO ================ " +
               "\n ===================================================== " +
               "\n ID_PAGAMENTO: " + getIdPagamento() +
               "\n FORMA DE PAGAMENTO: " + getFormaPagamento() +
               "\n VALOR PAGO: " + getValorPago() +
               "\n DATA DO PAGAMENTO: " + getDataPagamento() +
               "\n ===================================================== " ;
    }
    
}
