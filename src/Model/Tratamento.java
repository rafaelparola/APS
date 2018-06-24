package Model;

/**
 *
 * @author rafael
 */
public class Tratamento {
    private String dente;
    private String diagnostico;
    private String procedimento;
    private String prognostico;
    private Consulta consulta;

    /**
     * @return the dente
     */
    public String getDente() {
        return dente;
    }

    /**
     * @param dente the dente to set
     */
    public void setDente(String dente) {
        this.dente = dente;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the procedimento
     */
    public String getProcedimento() {
        return procedimento;
    }

    /**
     * @param procedimento the procedimento to set
     */
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    /**
     * @return the prognostico
     */
    public String getPrognostico() {
        return prognostico;
    }

    /**
     * @param prognostico the prognostico to set
     */
    public void setPrognostico(String prognostico) {
        this.prognostico = prognostico;
    }

    /**
     * @return the consulta
     */
    public Consulta getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
