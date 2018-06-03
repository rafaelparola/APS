package Controller;

import Bd.SecretarioBd;
import Model.Dentista;
import Model.Secretario;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class SecretarioController {
    
    Secretario secretario = new Secretario();
    SecretarioBd secretarioBd = new SecretarioBd();
    
    public void insereSecretario(Secretario secretario){
        if(secretario.verificaCamposObrigatorios(secretario)){
            //JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(secretarioBd.verificaCpfExistente(secretario)){
            secretarioBd.persisteSecretario(secretario);
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");}   
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
           
    }
    
    
    public void editaSecretario(Secretario secretario){
        if(secretario.verificaCamposObrigatorios(secretario)){
            //JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(secretarioBd.verificaCpfExistente(secretario)){
            secretarioBd.editaSecretario(secretario);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");} 
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
    }
    
    public void excluiSecretario(Secretario secretario){
        
            secretarioBd.excluiSecretario(secretario);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            
    }
    
    public Secretario buscaSecretario(long cpf){
            
            return secretarioBd.buscaSecretario(cpf);
            
    }
    
}
