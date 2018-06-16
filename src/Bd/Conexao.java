package Bd;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class Conexao {
        public Connection con;
        public Statement stm;
        public ResultSet rs;
        public Statement stm2;
        public ResultSet rs2;
        private String driver = "org.mysql.Driver";
        private String caminho = "jdbc:mysql://localhost:3306/DATA_MANAGER";
        private String usuario = "root";
        private String senha = "Parola923";
        
        public void conecta(){
            
            try {
                System.setProperty("jdbc.Drivers", driver);
                con = DriverManager.getConnection(caminho, usuario, senha);
                //JOptionPane.showMessageDialog(null, "sucesso");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "erro ao conectar ao banco :"+ex);
            }
        }
        
        public void desconecta(){
            try {
                con.close();
                //JOptionPane.showMessageDialog(null, "desconectado");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Erro ao desconectar de banco :"+ex);
            }
        }
        public void executaSql(String sql){
            try {
                stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "query executada com erro : "+ ex);
            }
        }
        public void executaSegundoSql(String sql){
            try {
                stm2 = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
                rs2 = stm2.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "query executada com erro : "+ ex);
            }
        }
}
