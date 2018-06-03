package Bd;

import Model.Dentista;
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
public class DentistaBd{
    Dentista dentista = new Dentista();
    Conexao conexao = new Conexao();
    ResultSet rs;
    Statement stmt;
    
    public void persisteDentista(Dentista dentista){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "DENTISTAS(nome, cpf, cro, telefone_fixo, hora_inicio, hora_fim) "
                    + "VALUES(?, ?, ?, ?, ?, ?)");
            pst.setString(1, dentista.getNome());
            pst.setLong(2, dentista.getCpf());
            pst.setLong(3, dentista.getCro());
            pst.setString(4, dentista.getTelefoneFixo());
            pst.setString(5, dentista.getHoraInicio());
            pst.setString(6, dentista.getHoraFim());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados inseridos");
                    } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Usuário já cadastrado.");
        }
        conexao.desconecta();
    }
    
    public void editaDentista(Dentista dentista){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("UPDATE "
                    + "DENTISTAS SET nome = ?, cpf = ?, cro = ?, telefone_fixo = ?, hora_inicio = ?, hora_fim = ?" + 
                    " WHERE id = ?");
            pst.setString(1, dentista.getNome());
            pst.setLong(2, dentista.getCpf());
            pst.setLong(3, dentista.getCro());
            pst.setString(4, dentista.getTelefoneFixo());
            pst.setString(5, dentista.getHoraInicio());
            pst.setString(6, dentista.getHoraFim());
            pst.setLong(7, dentista.getId());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados editados");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados :" + ex);
        }
        conexao.desconecta();
    }
    
    public void excluiDentista(Dentista dentista){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("DELETE FROM "
                    + "DENTISTAS WHERE CPF = ?");
            pst.setLong(1, dentista.getCpf());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados excluidos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados :" + ex);
        }
        conexao.desconecta();
    }
    
    public boolean verificaCpfExistente(Dentista dentista){
        boolean resultado = true;
        conexao.conecta();
        conexao.executaSql("SELECT ID, CPF FROM DENTISTAS WHERE CPF = "+dentista.getCpf()+"");
        try {
            
            if(conexao.rs.next()){
               resultado = false;
               if(dentista.getId() == conexao.rs.getLong("id")){
                   return true;
               }
           
        }
            //JOptionPane.showMessageDialog(null, "Validação cpf ok");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo: "+ ex);
            
        }
        
        conexao.desconecta();
       return resultado;
    }
    public Dentista buscaDentista(long cpf){
        conexao.conecta();
        conexao.executaSql("SELECT ID, NOME, CPF, CRO, TELEFONE_FIXO, HORA_INICIO, HORA_FIM FROM DENTISTAS"
                + " WHERE CPF = "+cpf+"");
        try {
            conexao.rs.first();
            dentista.setId(conexao.rs.getLong("id"));
            dentista.setNome(conexao.rs.getString("nome"));
            dentista.setCpf(conexao.rs.getLong("cpf"));
            dentista.setCro(conexao.rs.getInt("cro"));
            dentista.setTelefoneFixo(conexao.rs.getString("telefone_fixo"));
            dentista.setHoraInicio(conexao.rs.getString("hora_inicio"));
            dentista.setHoraFim(conexao.rs.getString("hora_fim"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
        conexao.desconecta();
        return dentista;
    }
}
   
