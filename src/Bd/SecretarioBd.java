package Bd;

import Model.Dentista;
import Model.Secretario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class SecretarioBd {
    Secretario secretario = new Secretario();
    Conexao conexao = new Conexao();
    ResultSet rs;
    Statement stmt;
    
    public void persisteSecretario(Secretario secretario){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "SECRETARIOS(nome, cpf, telefone_fixo) "
                    + "VALUES(?, ?, ?)");
            pst.setString(1, secretario.getNome());
            pst.setLong(2, secretario.getCpf());
            pst.setString(3, secretario.getTelefoneFixo());
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Dados inseridos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado.");
        }
        conexao.desconecta();
    }
    
    public void editaSecretario(Secretario secretario){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("UPDATE "
                    + "SECRETARIOS SET nome = ?, cpf = ?, telefone_fixo = ?" + 
                    " WHERE id = ?");
            pst.setString(1, secretario.getNome());
            pst.setLong(2, secretario.getCpf());
            pst.setString(3, secretario.getTelefoneFixo());
            pst.setLong(4, secretario.getId());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados editados");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados :" + ex);
        }
        conexao.desconecta();
    }
    
    public void excluiSecretario(Secretario secretario){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM "
                    + "SECRETARIOS WHERE CPF = ?");
            pst.setLong(1, secretario.getCpf());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados excluidos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados :" + ex);
        }
        conexao.desconecta();
    }
    
    public boolean verificaCpfExistente(Secretario secretario){
        boolean resultado = true;
        conexao.conecta();
        conexao.executaSql("SELECT ID, CPF FROM SECRETARIOS WHERE CPF = "+secretario.getCpf()+"");
        try {
            
            if(conexao.rs.next()){
               resultado = false;
               if(secretario.getId() == conexao.rs.getLong("id")){
                   return true;
               }
           
        }
           // JOptionPane.showMessageDialog(null, "Validação cpf ok");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo: "+ ex);
            
        }
        
        conexao.desconecta();
       return resultado;
        
    }
    
    public Secretario buscaSecretario(long cpf){
        conexao.conecta();
        conexao.executaSql("SELECT ID, NOME, CPF, TELEFONE_FIXO FROM SECRETARIOS"
                + " WHERE CPF = "+cpf+"");
        try {
            conexao.rs.first();
            secretario.setId(conexao.rs.getLong("id"));
            secretario.setNome(conexao.rs.getString("nome"));
            secretario.setCpf(conexao.rs.getLong("cpf"));
            secretario.setTelefoneFixo(conexao.rs.getString("telefone_fixo"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
        conexao.desconecta();
        return secretario;
    }
    
}
