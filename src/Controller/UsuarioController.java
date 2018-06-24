package Controller;

import Model.Usuario;
import Bd.UsuarioBd;
import javax.swing.JOptionPane;
/**
 *
 * @author rafael
 */
public class UsuarioController {
    
    Usuario usuario = new Usuario();
    UsuarioBd usuarioBd = new UsuarioBd();
    
    public void insereUsuario(Usuario usuario){
       // if(usuario.verificaCamposObrigatorios(usuario)){
            usuarioBd.persisteUsuario(usuario);
       // }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
           
    }
    
    public Usuario realizarLogin(Usuario usuario){
        Usuario retUsuario = new Usuario();
        retUsuario = usuarioBd.verificaLoginSenha(usuario);
        JOptionPane.showMessageDialog(null, retUsuario.getTipoUsuario());
        return retUsuario;
    }
}
