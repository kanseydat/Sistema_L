/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Paulo
 */
public class vendaM {
    //atributos
    private String cliente;
    private String cpf;
    private String produto;
    private String id_produto;
    private String funcionário;
    private String volume;
    private String estoque;    
    private String preço;
    private String valorRecebido;
    private String troco;
    private String quantidade;

    public vendaM(String cliente, String cpf, String produto, String id_produto, String funcionário, String volume, String estoque, String preço, String valorRecebido, String troco) {
        this.cliente = cliente;
        this.cpf = cpf;
        this.produto = produto;
        this.id_produto = id_produto;
        this.funcionário = funcionário;
        this.volume = volume;
        this.estoque = estoque;
        this.preço = preço;
        this.valorRecebido = valorRecebido;
        this.troco = troco;
    }

    public vendaM(String cpf, String id_produto, String funcionário, String valorRecebido, String quantidade) {
        this.cpf = cpf;
        this.id_produto = id_produto;
        this.funcionário = funcionário;
        this.valorRecebido = valorRecebido;
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    
    
    
    public String getFuncionário() {
        return funcionário;
    }

    public void setFuncionário(String funcionário) {
        this.funcionário = funcionário;
    }    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public String getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(String valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }

    
}
