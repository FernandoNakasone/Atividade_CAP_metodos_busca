package br.fiap.models;

public class Registro {
    private String nomeProduto;
    private int codigo;
    private String fabricante;
    private double preco;

    public Registro(String nomeProduto, int codigo, String fabricante, double preco) {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto:" + nomeProduto + "\tCodigo:" + codigo + "\tFornecedor:" + fabricante + "\tPreço:R$" + preco ;
    }
}
