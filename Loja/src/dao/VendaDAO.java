/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.vendaM;

/**
 *
 * @author Paulo
 */
public class VendaDAO {
    private final Connection connection;
    public Iterable<vendaM> readForDesc;
    
    public VendaDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    public void insertVenda(vendaM venda) throws SQLException{  
            
            
            String sql = "insert into venda(cpf_cliente,pagamento_cliente,funcionário,id_produto,quantidade_cliente) values ('"+venda.getCpf()+"','"+venda.getValorRecebido()+"','"+venda.getFuncionário()+"','"+venda.getId_produto()+"','"+venda.getQuantidade()+"');"
                    + "update produto set estoque = produto.estoque - venda.quantidade_cliente from venda where id_produto = produto.id;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();

}

    
    
}
