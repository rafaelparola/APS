package Model;

/**
 *
 * @author rafael
 */
public class Consulta {
    
    private int id;
    private String data;
    private Dentista dentista;
    private Paciente paciente;
    private String horaInicio;
    private String horaFim;
    private String tipoConsulta;

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the dentista
     */
    public Dentista getDentista() {
        return dentista;
    }

    /**
     * @param dentista the dentista to set
     */
    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

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

    /**
     * @return the tipoConsulta
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * @param tipoConsulta the tipoConsulta to set
     */
    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    public boolean verificaCamposObrigatorios(Consulta consulta){
        boolean resultado = true;
        if(consulta.dentista.getId()== 0L){ //verifica se o valor do cpf é igual a null ou 0 (0L é o valor default do tipo long).
            resultado = false;
        }
        if("".equals(consulta.paciente.getId()== 0L)){ //verifica se o nome está preenchido.
            resultado = false;
        }
        if("".equals(consulta.getData())){ //verifica se o telefone está preenchido.
            resultado = false;
        }
        if("".equals(consulta.getHoraInicio())){
            resultado = false;
        }
        if("".equals(consulta.getHoraFim())){
            resultado = false;
        }
        return resultado;
    }
 
    public boolean verificaHorarioConsulta(Consulta consulta){
        boolean resultado = true;
        int horaInicio = Integer.parseInt(consulta.getHoraInicio().substring(0, 2));
        int horaFim = Integer.parseInt(consulta.getHoraFim().substring(0, 2));
        if(horaInicio < 8){
            resultado = false;
        }
        else if (horaFim > 18){
            resultado = false;
        }
        return resultado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
