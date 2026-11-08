package modelo;

public class Vestido {

    private int idVestido;
    private String modelo;
    private String cor;
    private String tamanho;
    private Double valorLocacao;
    private String status;

    public int getIdVestido() {
        return idVestido;
    }

    public void setIdVestido(int idVestido) {
        this.idVestido = idVestido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Vestido() {
    }

    public Vestido(int idVestido, String modelo, String cor, String tamanho, 
            Double valorLocacao, String status) {
        this.idVestido=idVestido;
        this.modelo=modelo;
        this.cor=cor;
        this.tamanho=tamanho;
        this.valorLocacao=valorLocacao;
        this.status=status;
    }
    
    public String toString(){
        return "\n ================= DADOS DO VESTIDO ================== " +
               "\n ===================================================== " +
               "\n ID_VESTIDO: " + getIdVestido() +
               "\n MODELO: " + getModelo() +
               "\n COR: " + getCor() +
               "\n TAMANHO: " + getTamanho() +
               "\n VALOR DA LOCAÇÃO: " + getValorLocacao() +
               "\n STATUS: " + getStatus() +
               "\n ===================================================== " ;
}
}