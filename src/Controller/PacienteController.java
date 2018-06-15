package Controller;

import Bd.PacienteBd;
import Model.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class PacienteController {

    Paciente paciente = new Paciente();
    PacienteBd pacienteBd = new PacienteBd();
    
    public void inserePaciente(Paciente paciente){
        if(paciente.verificaCamposObrigatorios(paciente)){
            JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(pacienteBd.verificaCpfExistente(paciente)){
            pacienteBd.persistePaciente(paciente);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");}   
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
           
    }
    
    public void editaPaciente(Paciente paciente){
        if(paciente.verificaCamposObrigatorios(paciente)){
            //JOptionPane.showMessageDialog(null, "campos preenchidos.");
            if(pacienteBd.verificaCpfExistente(paciente)){
            pacienteBd.editaPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Usuário já cadastrado com este CPF.");} 
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
    }
    
}
