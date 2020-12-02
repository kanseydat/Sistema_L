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
public class VendaData extends Conexão{
    
    public VendaData() throws Exception{
    
    }
    
    public Vector MostrarVendas () throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT cliente.nome,cliente.cpf,produto.nome_produto,produto.volume, quantidade_cliente,(produto.preço * quantidade_cliente) as preço, pagamento_cliente, (pagamento_cliente - produto.preço * quantidade_cliente) as troco, funcionário, data_venda FROM venda inner join cliente on cliente.cpf = venda.cpf_cliente  inner join produto on produto.id = venda.id_produto";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("nome"));
                n1.add(buscar.getString("cpf"));
                n1.add(buscar.getString("nome_produto"));
                n1.add(buscar.getString("volume"));
                n1.add(buscar.getString("quantidade_cliente"));
                n1.add(buscar.getString("preço"));
                n1.add(buscar.getString("pagamento_cliente"));
                n1.add(buscar.getString("troco")); 
                n1.add(buscar.getString("funcionário"));
                n1.add(buscar.getString("data_venda"));
                tb.add(n1);
            }
            return tb;
}
    
    
}
