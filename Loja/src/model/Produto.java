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
public class Produto {
    //atributos
    private String id;
    private String nome;
    private String gênero;    
    private String editora;
    private String volume;
    private String estoque;
    private String custo;
    private String preço;

    public Produto(String nome, String gênero, String editora, String volume, String estoque, String custo, String preço) {
        this.nome = nome;
        this.gênero = gênero;
        this.editora = editora;
        this.volume = volume;
        this.estoque = estoque;
        this.custo = custo;
        this.preço = preço;
    }
    

    public Produto(String id, String nome, String gênero, String editora, String volume, String estoque, String custo, String preço) {
        this.id = id;
        this.nome = nome;
        this.gênero = gênero;
        this.editora = editora;
        this.volume = volume;
        this.estoque = estoque;
        this.custo = custo;
        this.preço = preço;
    }

   
    
    public Produto(String id) {
        this.id = id;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    
}

