package Model;

/**
 *
 * @author rafael
 */
public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private String tipoUsuario;
    private long cpfUsuario;

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the idUsuario
     */
    public long getCpfUsuario() {
        return cpfUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setCpfUsuario(long cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }
    
    
    
}
