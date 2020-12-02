/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;

/**
 *
 * @author Paulo
 */
public class ProdutoDAO {
    private final Connection connection;
    public Iterable<Produto> readForDesc;
    
    
    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    
    
        public void insertProduto(Produto produto) throws SQLException{  
            
            
            String sql = "insert into produto(nome_produto,gênero,editora,volume,estoque,custo,preço) values ('"+produto.getNome()+"','"+produto.getGênero()+"','"+produto.getEditora()+"','"+produto.getVolume()+"','"+produto.getEstoque()+"','"+produto.getCusto()+"','"+produto.getPreço()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();

}
        
        public void deleteProduto(Produto apg) throws SQLException{
        
          String sql = "DELETE FROM venda WHERE id_produto = '"+apg.getId()+"';"
                  + "DELETE FROM produto WHERE id = '"+apg.getId()+"';" ;
          PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();

    }
    
    public void updateProduto (Produto upd) throws SQLException{
         String sql = "UPDATE produto SET nome_produto = '"+upd.getNome()+"', gênero = '"+upd.getGênero()+"', editora = '"+upd.getEditora()+"', volume = '"+upd.getVolume()+"', estoque = '"+upd.getEstoque()+"', custo = '"+upd.getCusto()+"', preço = '"+upd.getPreço()+"' WHERE id = '"+upd.getId()+"' ";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.execute();
            
         connection.close();
     }
    
}
