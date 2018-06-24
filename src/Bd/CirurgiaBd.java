package Bd;

import Model.Cirurgia;
import Model.Consulta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class CirurgiaBd {
    Conexao conexao = new Conexao();
    Consulta consulta = new Consulta();
    ResultSet rs;
    Statement stm;
    Cirurgia cirurgia = new Cirurgia();
    
    
    
public boolean verificaEscalaDentista(Cirurgia cirurgia){
        
        JOptionPane.showMessageDialog(null, "consulta.getDentista().getId()");
        boolean resultado = true;
        
        JOptionPane.showMessageDialog(null, "consulta.getDentista().getId()");
        conexao.conecta();
        conexao.executaSql("SELECT COUNT(*) AS NUMERO_CIRURGIA FROM CIRURGIA WHERE DENTISTA = "+cirurgia.getDentista().getId()+""
                + " AND DATA_CIRURGIA = '"+cirurgia.getData()+"'");
        try {
            while(conexao.rs.next()){
            JOptionPane.showMessageDialog(null, conexao.rs.getInt("NUMERO_CIRURGIA"));
            if(conexao.rs.getInt("NUMERO_CIRURGIA") > 3){
               resultado = false;
               
           
        }
            JOptionPane.showMessageDialog(null, "Validação escala dentista ok");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo(escala dentista): "+ ex);
            
        }
        
        conexao.desconecta();
        return resultado;
    }
    
    public boolean verificaChoqueConsultaCirurgia(Cirurgia cirurgia){
        boolean resultado = true;
        conexao.conecta();
        conexao.executaSegundoSql("SELECT DENTISTA AS ID FROM CONSULTAS WHERE DENTISTA = "+cirurgia.getDentista().getId()+""
                + " AND DATA_CONSULTA = '"+cirurgia.getData()+"' AND HORA_INICIO = "+"'"+cirurgia.getHoraInicio()+"'"+
                " UNION "
                + "SELECT DENTISTA AS ID FROM CONSULTAS WHERE DENTISTA = "+cirurgia.getDentista().getId()+""
                + " AND DATA_CONSULTA = '"+cirurgia.getData()+"' AND HORA_INICIO = "+"'"+cirurgia.getHoraInicio()+"'");
        try {
            if(conexao.rs2.next()){
               resultado = false;
               
              /* if(conexao.rs2.getInt("ID") == consulta.getDentista().getId()){
                   return true;
               }*/
           
        }
            JOptionPane.showMessageDialog(null, "Validação choque consulta ok");
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deu certo(choque consulta): "+ ex);
            
        }
        
        conexao.desconecta();
        return resultado;
    }
    
    public void requererCirurgia(Cirurgia cirurgia){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "CIRURGIA(PACIENTE, DENTISTA, CONSULTA, PREVISAO_TEMPO) "
                    + "VALUES(?, ?, ?, ?)");
            
            pst.setLong(1, cirurgia.getPaciente().getId());
            pst.setLong(2, cirurgia.getDentista().getId());
            pst.setInt(3, cirurgia.getId());
            pst.setString(4, cirurgia.getPrevisaoTempo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos na tabela consulta");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados na tabela consulta ex: "+ ex);
        }
        conexao.desconecta();
    }
    
    public void inserirDataHoraCirurgia(Cirurgia cirurgia){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("UPDATE "
                    + "CIRURGIA SET DATA_CONSULTA = ?, HORA_INICIO = ?, HORA_FIM = ?" + 
                    " WHERE id = ?");
            
            pst.setString(3, cirurgia.getData());
            pst.setString(4, cirurgia.getHoraInicio());
            pst.setString(5, cirurgia.getHoraFim());
            pst.setInt(6, cirurgia.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados editados na tabela cirurgia");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados na tabela consulta ex: "+ ex);
        }
        conexao.desconecta();
    }

}
