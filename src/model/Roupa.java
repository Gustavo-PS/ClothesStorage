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
    private CorRoupa corRoupa;

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

    public CorRoupa getCor() {
        return corRoupa;
    }

    public void setCor(CorRoupa corRoupa) {
        this.corRoupa = corRoupa;
    }

    public enum Tamanho {
      P("P"), M("M"), G("G");

        private String tamanho;

        Tamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public String getTamanho() {
            return tamanho;
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
