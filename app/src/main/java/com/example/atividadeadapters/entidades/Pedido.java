package com.example.atividadeadapters.entidades;

import java.math.BigDecimal;

public class Pedido {

    protected String cliente;
    protected String data;
    protected BigDecimal valor;
    protected String produto;

    public Pedido() {
    }

    public Pedido(String cliente, String data,  String produto,BigDecimal valor) {

        this.cliente = cliente;
        this.data = data;
        this.produto = produto;
        this.valor = valor;
    }



    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", data='" + data + '\'' +
                ", valor='" + valor + '\'' +
                ", produto='" + produto + '\'' +
                '}';
    }
}
