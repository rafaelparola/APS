package Model;

/**
 *
 * @author rafael
 */
public class Paciente extends Pessoa {
    public boolean verificaCamposObrigatorios(Paciente paciente){
        boolean resultado = true;
        if(paciente.getCpf()== 0L){ //verifica se o valor do cpf é igual a null ou 0 (0L é o valor default do tipo long).
            resultado = false;
        }
        if("".equals(paciente.getNome())){ //verifica se o nome está preenchido.
            resultado = false;
        }
        if("".equals(paciente.getTelefoneFixo())){ //verifica se o telefone está preenchido.
            resultado = false;
        }
        return resultado;
    }
}
