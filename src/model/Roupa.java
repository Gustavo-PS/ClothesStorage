package model;

import java.time.LocalDate;

public class Roupa {

    private int cod;
    private String dtEntrada;
    private String localCompra;
    private String marca;
    private String descricao;
    private double valorEtiqueta;
    private double valorPago;
    private double valorMargem;
    private double valorSugerido;

    public int getCod() {
        return cod;
    }

    public void setCod(int codigo) {
        this.cod = codigo;
    }

    public String getDataEntrada() {
        return dtEntrada;
    }

    public void setDataEntrada(LocalDate localDate) {
        this.dtEntrada = localDate.toString();
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String local) {
        this.localCompra = local;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(double vlrEtiqueta) {
        this.valorEtiqueta = vlrEtiqueta;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double vlrPago) {
        this.valorPago = vlrPago;
    }

    public double getValorMargem() {
        return valorMargem;
    }

    public void setValorMargem() {
        this.valorMargem= this.valorPago * 2;
    }

    public double getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public enum Tamanho {
        PP("PP"), P("P"), M("M"), G("G"), GG("GG");

        private String tamanho;

        Tamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public String getTamanho() {
            return tamanho;
        }
    }

    public enum Cor {
        Amarelo("Amarelo"), Azul("Azul"), Branco("Branco"), Cinza("Cinza"), Preto("Preto"), Verde("Verde"),
        Vermelho("Vermelho"), Roxo("Roxo"), Rosa("Rosa");

        private String cor;

        Cor(String cor) {
            this.cor = cor;
        }

        public String getCor() {
            return cor;
        }
    }

    public enum Tipo{
        Vestido("Vestido"), Saia("Saia"), Conjunto("Conjunto"), Camiseta("Camiseta"), Calca("Calça"), Shorts("Shorts");

        private String tipo;

        Tipo(String tipo){
            this.tipo = tipo;
        }

        public String getTipo(){
            return tipo;
        }
    }
}
