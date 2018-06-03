package Model;

/**
 *
 * @author rafael
 */
public class Secretario extends Usuario {

   public boolean verificaCamposObrigatorios(Secretario secretario){
        if(secretario.getCpf()== 0L){ //verifica se o valor do cpf é igual a null ou 0 (0L é o valor default do tipo long).
            return false;
        }
        if("".equals(secretario.getNome())){ //verifica se o nome está preenchido.
            return false;
        }
        if("".equals(secretario.getTelefoneFixo())){ //verifica se o telefone está preenchido.
            return false;
        }
        else {return true;}

   }
}
