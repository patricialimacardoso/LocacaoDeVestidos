package modelo;

import java.util.Date;

public class Devolucao {

    private int idDevolucao;
    private Date dataDevolucao;
    private Double multa;
    private String observacao;

    public int getIdDevolucao() {
        return idDevolucao;
    }

    public void setIdDevolucao(int idDevolucao) {
        this.idDevolucao = idDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Devolucao() {
    }

    public Devolucao(int idDevolucao, Date dataDevolucao,
            Double multa, String observacao) {

        this.idDevolucao=idDevolucao;
        this.dataDevolucao=dataDevolucao;
        this.multa=multa;
        this.observacao=observacao;
    }
    
    public String toString() {
        return "\n ================ DADOS DA DEVOLUÇÃO ================= " +
               "\n ===================================================== " +
               "\n ID_DEVOLUÇÃO: " + getIdDevolucao() +
               "\n DATA DE DEVOLUÇÃO: " + getDataDevolucao() +
               "\n MULTA: " + getMulta() +
               "\n OBSERVAÇÃO: " + getObservacao() +
               "\n ===================================================== " ;
    }            
}
