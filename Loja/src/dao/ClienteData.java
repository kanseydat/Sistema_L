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
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Paulo
 */
public class ClienteData extends Conexão{;
    
    public ClienteData() throws Exception{
    
    }
    
    public Vector search (String pesq) throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT nome, cpf, endereço, cidade, estado FROM cliente WHERE cpf LIKE '"+ pesq +"'";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("nome"));
                n1.add(buscar.getString("cpf"));
                n1.add(buscar.getString("endereço"));
                n1.add(buscar.getString("cidade"));
                n1.add(buscar.getString("estado"));
                tb.add(n1);
            }
            return tb;
}
    
     public Vector MostrarClientes () throws SQLException{
        Vector tb = new Vector();
    String url = "SELECT * FROM cliente";
            PreparedStatement statement = getConnection().prepareStatement(url);
            ResultSet buscar = statement.executeQuery();
            
            while(buscar.next()){
                Vector n1 = new Vector();
                n1.add(buscar.getString("nome"));
                n1.add(buscar.getString("cpf"));
                n1.add(buscar.getString("endereço"));
                n1.add(buscar.getString("cidade"));
                n1.add(buscar.getString("estado"));
                tb.add(n1);
            }
            return tb;
}
     
     
            
            
    }
    

