/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import model.Cliente;
import org.postgresql.core.ConnectionFactory;
import view.CadastroCliente;


/**
 *
 * @author Paulo
 */
public class ClienteDAO {
    private final Connection connection;
    public Iterable<Cliente> readForDesc;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    

    

    

    public void insert(Cliente cliente) throws SQLException{
    
            
            
            String sql = "insert into cliente (nome,cpf,endereço,cidade,estado) values('"+cliente.getNome()+"','"+cliente.getCpf()+"','"+cliente.getEndereço()+"','"+cliente.getCidade()+"','"+cliente.getEstado()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();

}
    
    public void delete(Cliente apg) throws SQLException{
        
          String sql = "DELETE FROM venda WHERE venda.cpf_cliente = '"+apg.getCpf()+"'; DELETE FROM cliente WHERE cpf = '"+apg.getCpf()+"'";
          PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close();

    }
        
     public void update (Cliente upd) throws SQLException{
         String sql = "UPDATE cliente SET nome = '"+upd.getNome()+"', endereço = '"+upd.getEndereço()+"', cidade = '"+upd.getCidade()+"', estado = '"+upd.getEstado()+"' WHERE cpf = '"+upd.getCpf()+"' ";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.execute();
            
         connection.close();
     }       
            
    }
 
    
    
    

