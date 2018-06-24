package Bd;

import Model.Tratamento;
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
public class TratamentoBd {
       Tratamento tratamento = new Tratamento();
       Conexao conexao = new Conexao();
       ResultSet rs;
       Statement stm;

       public void persisteTratamento(Tratamento tratamento){
        conexao.conecta();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("INSERT INTO "
                    + "TRATAMENTO(id_consulta, diagnostico, procedimento, prognostico, dente) "
                    + "VALUES(?, ?, ?, ?, ?)");
            pst.setInt(1, tratamento.getConsulta().getId());
            pst.setString(2, tratamento.getDiagnostico());
            pst.setString(3, tratamento.getProcedimento());
            pst.setString(4, tratamento.getPrognostico());
            pst.setString(5, tratamento.getDente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.desconecta();
    }
       
}
