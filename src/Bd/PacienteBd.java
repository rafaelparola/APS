package Bd;

import Model.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class PacienteBd {
    Paciente paciente = new Paciente();
    Conexao conexao = new Conexao();
    ResultSet rs;
    Statement stm;
    
    public void persistePaciente(Paciente paciente){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "PACIENTES(nome, cpf, telefone_fixo, email) "
                    + "VALUES(?, ?, ?, ?)");
            pst.setString(1, paciente.getNome());
            pst.setLong(2, paciente.getCpf());
            pst.setString(3, paciente.getTelefoneFixo());
            pst.setString(4, paciente.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.desconecta();
    }
    
    public boolean verificaCpfExistente(Paciente paciente){
        boolean resultado = true;
        conexao.conecta();
        conexao.executaSql("SELECT ID, CPF FROM PACIENTES WHERE CPF = "+paciente.getCpf()+"");
        try {
            
            if(conexao.rs.next()){
               resultado = false;
               if(paciente.getId() == conexao.rs.getLong("id")){
                   return true;
               }
           
        }
            JOptionPane.showMessageDialog(null, "Validação cpf ok");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo: "+ ex);
            
        }
        
        conexao.desconecta();
       return resultado;
    }
    
    public void editaPaciente(Paciente paciente){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("UPDATE "
                    + "PACIENTES SET NOME = ?, CPF = ?, TELEFONE_FIXO = ?, EMAIL = ?" + 
                    " WHERE id = ?");
            pst.setString(1, paciente.getNome());
            pst.setLong(2, paciente.getCpf());
            pst.setString(3, paciente.getTelefoneFixo());
            pst.setString(4, paciente.getEmail());
            pst.setLong(5, paciente.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados :" + ex);
        }
        conexao.desconecta();
    }
    
    public void excluiPaciente(Paciente paciente){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM "
                    + "PACIENTES WHERE CPF = ?");
            pst.setLong(1, paciente.getCpf());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados excluidos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados :" + ex);
        }
        conexao.desconecta();
    }
    
}
