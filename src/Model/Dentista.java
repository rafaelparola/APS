package Model;

import Bd.Conexao;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Dentista extends Usuario {
    Conexao con = new Conexao();
            
    private long cro;
    private String horaInicio;
    private String horaFim;

    
    
    /**
     * @return the cro
     */
    public long getCro() {
        return cro;
    }

    /**
     * @param cro the cro to set
     */
    public void setCro(int cro) {
        this.cro = cro;
    }
    
    public boolean verificaCamposObrigatorios(Dentista dentista){
        boolean resultado = true;
        if(dentista.getCpf()== 0L){ //verifica se o valor do cpf é igual a null ou 0 (0L é o valor default do tipo long).
            resultado = false;
        }
        if("".equals(dentista.getNome())){ //verifica se o nome está preenchido.
            resultado = false;
        }
        if("".equals(dentista.getTelefoneFixo())){ //verifica se o telefone está preenchido.
            resultado = false;
        }
        if(dentista.getCro() == 0L){ //verifica se o CRO está preenchido.
            resultado = false;
        }
        if("".equals(dentista.getHoraInicio())){
            resultado = false;
        }
        if("".equals(dentista.getHoraFim())){
            resultado = false;
        }
        return resultado;
    }

    /**
     * @return the turno
     */

    /**
     * @param turno the turno to set
     */

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
    
    
    
    
        
}


