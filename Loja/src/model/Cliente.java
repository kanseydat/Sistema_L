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
public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    
    private String endereço;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpf, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    
public Cliente(String nome, String endereco, String cidade, String estado) {
        this.nome = nome;        
        this.endereço = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }
   
    public Cliente(String cpf) {
        this.cpf = cpf;
    }
      
    
    
    //GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
//    public void limpaCliente(){
//       nome = "";
//       cpf = "";
//       endereço = "";
//       cidade = "";
//       estado = "";
//    }   
}
