package Bd;

import Model.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author rafael
 */
public class UsuarioBd {
       Usuario usuario = new Usuario();
       Conexao conexao = new Conexao();
       ResultSet rs;
       Statement stm;
}
