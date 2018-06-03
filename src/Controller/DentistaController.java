package Controller;

import Model.Dentista;
import Bd.DentistaBd;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class DentistaController {
    
    Dentista denstista = new Dentista();
    DentistaBd dentistaBd = new DentistaBd();
    
    public void insereDentista(Dentista dentista){
        if(dentista.verificaCamposObrigatorios(dentista)){
            //JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(dentistaBd.verificaCpfExistente(dentista)){
            dentistaBd.persisteDentista(dentista);
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");}   
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
           
    }
    
    
    public void editaDentista(Dentista dentista){
        if(dentista.verificaCamposObrigatorios(dentista)){
            //JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(dentistaBd.verificaCpfExistente(dentista)){
            dentistaBd.editaDentista(dentista);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");} 
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
    }
    
    public void excluiDentista(Dentista dentista){
            dentistaBd.excluiDentista(dentista);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            
    }
    public Dentista buscaDentista(long cpf){
            
            return dentistaBd.buscaDentista(cpf);
            
    }
    
}

    

