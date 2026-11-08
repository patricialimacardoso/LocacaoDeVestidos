package modelo;

import java.util.Date;

public class Locacao {

    private int idLocacao;
    private Date dataLocacao;
    private Date dataPrevistaDevolucao;
    private Double valorTotal;
    private String status;

    private Cliente cliente;
    private Funcionario funcionario;
    private Vestido vestido;
    private Pagamento pagamento;
    private Devolucao devolucao;

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
    
    public Locacao() {
    }

    public Locacao(int idLocacao, Date dataLocacao, Date dataPrevistaDevolucao,Double valorTotal, String status, 
            Cliente cliente, Funcionario funcionario, Vestido vestido, Pagamento pagamento, Devolucao devolucao) {
        this.idLocacao = idLocacao;
        this.dataLocacao = dataLocacao;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.valorTotal = valorTotal;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.vestido = vestido;
        this.pagamento=pagamento;
        this.devolucao=devolucao;
    }
    
    public String toString() {
        return  "\n ================== DADOS DA LOCAÇÃO ================= " +
                "\n ===================================================== " +
                "\n ID_LOCAÇÃO: " + getIdLocacao()+
                "\n DATA DA LOCAÇÃO: " + getDataLocacao() +
                "\n DATA PREVISTA DE DEVOLUÇÃO: " + getDataPrevistaDevolucao()+
                "\n VALOR TOTAL: " + getValorTotal() +
                "\n STATUS: " + getStatus() +
                        getCliente() +
                        getFuncionario() +
                        getVestido()+
                        getPagamento()+
                        getDevolucao() ;
    } 
}