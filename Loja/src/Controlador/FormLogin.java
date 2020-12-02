
package Controlador;

import dao.Conexão;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

import view.menu;
import view.LoginFuncionário;


/**
 *
 * @author Paulo
 */
public class FormLogin {
    private LoginFuncionário view;

    public FormLogin(LoginFuncionário view) {
        this.view = view;
    }

    public void autenticar() throws SQLException  {
        
        String nome = view.getTxtNome().getText();
        String senha = view.getTxtSenha().getText();        
        
        Usuario usuarioAutententicar = new Usuario(nome,senha);
        
        
        
        
        Connection conexao = new Conexão().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        if(usuarioDao.autenticarUsuario(usuarioAutententicar)){
            menu páginaMenu = new menu();
        páginaMenu.setVisible(true);
        
        }
        
        else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos");
        }
       
    }

    
    
    }

   

    

    

