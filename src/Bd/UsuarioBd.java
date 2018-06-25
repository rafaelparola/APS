package Bd;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class UsuarioBd {
       Usuario usuario = new Usuario();
       Conexao conexao = new Conexao();
       ResultSet rs;
       Statement stm;
       
       public void persisteUsuario(Usuario usuario){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "USUARIOS(login, senha, tipo_usuario, cpf_usuario) "
                    + "VALUES(?, ?, ?, ?)");
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getSenha());
            pst.setString(3, usuario.getTipoUsuario());
            pst.setLong(4, usuario.getCpfUsuario());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados inseridos");
                    } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Usuário já cadastrado.");
        }
        conexao.desconecta();
    }
       public Usuario verificaLoginSenha(Usuario usuario){
           Usuario retUsuario = new Usuario();
           conexao.conecta();
           //JOptionPane.showMessageDialog(null, usuario.getLogin()+" "+usuario.getSenha());
        conexao.executaSql("SELECT LOGIN, SENHA, TIPO_USUARIO, CPF_USUARIO FROM USUARIOS"
                + " WHERE LOGIN = "+"'"+usuario.getLogin()+"' AND SENHA = "+"'"+ usuario.getSenha()+"'");
        try {
            
            if(conexao.rs.next()){
               //retUsuario.setLogin(conexao.rs.getString("login"));
               //retUsuario.setSenha(conexao.rs.getString("senha"));
               retUsuario.setTipoUsuario(conexao.rs.getString("tipo_usuario"));
               retUsuario.setCpfUsuario(conexao.rs.getLong("cpf_usuario"));
              // if(dentista.getId() == conexao.rs.getLong("id")){
                //   return true;
              // }
           
        }else{
                //JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos.");
            }
            //JOptionPane.showMessageDialog(null, "Validação cpf ok");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo: "+ ex);
            
        }
        //JOptionPane.showMessageDialog(null, retUsuario.getTipoUsuario());
        conexao.desconecta();
        return retUsuario;
       }
}
