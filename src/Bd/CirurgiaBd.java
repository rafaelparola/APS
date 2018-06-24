package Bd;

import Model.Cirurgia;
import Model.Consulta;
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
}
