package Bd;

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
public class ConsultaBd {
    Conexao conexao = new Conexao();
    Consulta consulta = new Consulta();
    ResultSet rs;
    Statement stm;
    
    public boolean verificaEscalaDentista(Consulta consulta){
        
        JOptionPane.showMessageDialog(null, "consulta.getDentista().getId()");
        boolean resultado = true;
        
        JOptionPane.showMessageDialog(null, "consulta.getDentista().getId()");
        conexao.conecta();
        conexao.executaSql("SELECT COUNT(*) AS NUMERO_CONSULTA FROM CONSULTAS WHERE DENTISTA = "+consulta.getDentista().getId()+""
                + " AND DATA_CONSULTA = '"+consulta.getData()+"'");
        try {
            while(conexao.rs.next()){
            JOptionPane.showMessageDialog(null, conexao.rs.getInt("NUMERO_CONSULTA"));
            if(conexao.rs.getInt("NUMERO_CONSULTA") > 9){
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
    
    

    public boolean verificaChoqueConsulta(Consulta consulta){
        boolean resultado = true;
        conexao.conecta();
        conexao.executaSegundoSql("SELECT DENTISTA AS ID FROM CONSULTAS WHERE DENTISTA = "+consulta.getDentista().getId()+""
                + " AND DATA_CONSULTA = '"+consulta.getData()+"' AND HORA_INICIO = "+"'"+consulta.getHoraInicio()+"'");
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
    
    public void persisteConsulta(Consulta consulta){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "CONSULTAS(ID, PACIENTE, DENTISTA, DATA_CONSULTA, HORA_INICIO, HORA_FIM) "
                    + "VALUES(?, ?, ?, ?, ?, ?)");
            pst.setInt(1, consulta.getId());
            pst.setLong(2, consulta.getPaciente().getId());
            pst.setLong(3, consulta.getDentista().getId());
            pst.setString(4, consulta.getData());
            pst.setString(5, consulta.getHoraInicio());
            pst.setString(6, consulta.getHoraFim());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos na tabela consulta");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados na tabela consulta ex: "+ ex);
        }
        conexao.desconecta();
    }
    
}
