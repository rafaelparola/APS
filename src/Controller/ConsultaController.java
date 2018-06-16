package Controller;

import Bd.ConsultaBd;
import Model.Consulta;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class ConsultaController {
    private Consulta consulta = new Consulta();
    private ConsultaBd consultaBd = new ConsultaBd();
    
    public void insereConsulta(Consulta consulta){
        if(consulta.verificaCamposObrigatorios(consulta)){
            JOptionPane.showMessageDialog(null, "campos preenchidos."+ consulta.getDentista().getId()+consulta.getData());
            if(consultaBd.verificaEscalaDentista(consulta)){
                if(consulta.verificaHorarioConsulta(consulta)){
                    if(consultaBd.verificaChoqueConsulta(consulta)){
                        consultaBd.persisteConsulta(consulta);
                    }else{JOptionPane.showMessageDialog(null, "Dentista já possui consulta marcada para essa data e hora.");}   
                }else{JOptionPane.showMessageDialog(null, "Fora do horário de funcionamento da clínica");}   
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Dentista com limite máximo de consulta para esta data");}   
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
           
    }
    
}
