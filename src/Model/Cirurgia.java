package Model;



public class Cirurgia extends Consulta{
    private Tratamento tratamento;
    private String previsaoTempo;

    /**
     * @return the tratamento
     */
    public Tratamento getTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
    
      public boolean verificaCamposObrigatorios(Consulta cirurgia){
        boolean resultado = true;
        if(cirurgia.getDentista().getId()== 0L){ //verifica se o valor do cpf é igual a null ou 0 (0L é o valor default do tipo long).
            resultado = false;
        }
        if("".equals(cirurgia.getPaciente().getId()== 0L)){ //verifica se o nome está preenchido.
            resultado = false;
        }
        if("".equals(cirurgia.getData())){ //verifica se o telefone está preenchido.
            resultado = false;
        }
        if("".equals(cirurgia.getHoraInicio())){
            resultado = false;
        }
        if("".equals(cirurgia.getHoraFim())){
            resultado = false;
        }
        return resultado;
      }

    /**
     * @return the previsaoTempo
     */
    public String getPrevisaoTempo() {
        return previsaoTempo;
    }

    /**
     * @param previsaoTempo the previsaoTempo to set
     */
    public void setPrevisaoTempo(String previsaoTempo) {
        this.previsaoTempo = previsaoTempo;
    }
        

    
    
  
    
}
