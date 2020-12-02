/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Paulo
 */
public class ProdutoData extends Conexão{
    
    public ProdutoData() throws Exception{
    
    }
    
    public Vector searchProdutoNome (String pesq) throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT id, nome_produto, gênero, editora, volume, estoque, custo, preço, (preço - custo) as lucro FROM produto WHERE nome_produto LIKE '"+ pesq +"%' order by nome_produto";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("id"));
                n1.add(buscar.getString("nome_produto"));
                n1.add(buscar.getString("gênero"));
                n1.add(buscar.getString("editora"));
                n1.add(buscar.getString("volume"));
                n1.add(buscar.getString("estoque"));
                n1.add(buscar.getString("custo"));
                n1.add(buscar.getString("preço"));
                n1.add(buscar.getString("lucro"));
                tb.add(n1);
            }
            return tb;
}
    
    public Vector searchProdutoEditora (String pesq) throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT id, nome_produto, gênero, editora, volume, estoque, custo, preço, (preço - custo) as lucro FROM produto WHERE editora LIKE '"+ pesq +"%' order by nome_produto";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("id"));
                n1.add(buscar.getString("nome_produto"));
                n1.add(buscar.getString("gênero"));
                n1.add(buscar.getString("editora"));
                n1.add(buscar.getString("volume"));
                n1.add(buscar.getString("estoque"));
                n1.add(buscar.getString("custo"));
                n1.add(buscar.getString("preço"));
                n1.add(buscar.getString("lucro"));
                tb.add(n1);
            }
            return tb;
}
    
    public Vector searchProdutoGênero (String pesq) throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT id, nome_produto, gênero, editora, volume, estoque, custo, preço, (preço - custo) as lucro FROM produto WHERE gênero LIKE '"+ pesq +"%' order by nome_produto";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("id"));
                n1.add(buscar.getString("nome_produto"));
                n1.add(buscar.getString("gênero"));
                n1.add(buscar.getString("editora"));
                n1.add(buscar.getString("volume"));
                n1.add(buscar.getString("estoque"));
                n1.add(buscar.getString("custo"));
                n1.add(buscar.getString("preço"));
                n1.add(buscar.getString("lucro"));
                tb.add(n1);
            }
            return tb;
}
    
     public Vector MostrarProdutos () throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT id, nome_produto, gênero, editora, volume, estoque, custo, preço, (preço - custo) as lucro FROM produto order by nome_produto";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("id"));
                n1.add(buscar.getString("nome_produto"));
                n1.add(buscar.getString("gênero"));
                n1.add(buscar.getString("editora"));
                n1.add(buscar.getString("volume"));
                n1.add(buscar.getString("estoque"));
                n1.add(buscar.getString("custo"));
                n1.add(buscar.getString("preço"));
                n1.add(buscar.getString("lucro"));
                tb.add(n1);
            }
            return tb;
}
    
}
