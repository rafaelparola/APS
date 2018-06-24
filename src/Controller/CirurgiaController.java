package Controller;

import Bd.CirurgiaBd;
import Model.Cirurgia;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class CirurgiaController {
private Cirurgia cirurgia = new Cirurgia();
    private CirurgiaBd cirurgiaBd = new CirurgiaBd();
    
    public void insereCirurgia(Cirurgia cirurgia){
        if(cirurgia.verificaCamposObrigatorios(cirurgia)){
            JOptionPane.showMessageDialog(null, "campos preenchidos."+ cirurgia.getDentista().getId()+cirurgia.getData());
            if(cirurgiaBd.verificaEscalaDentista(cirurgia)){
                if(cirurgia.verificaHorarioConsulta(cirurgia)){
                    if(cirurgiaBd.verificaChoqueCirurgiaConsulta(cirurgia)){
                        cirurgiaBd.persisteCirurgia(cirurgia);
                    }else{JOptionPane.showMessageDialog(null, "Dentista já possui consulta marcada para essa data e hora.");}   
                }else{JOptionPane.showMessageDialog(null, "Fora do horário de funcionamento da clínica");}   
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        }else{JOptionPane.showMessageDialog(null, "Dentista com limite máximo de consulta para esta data");}   
        }else{JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos.");}
        
    }
}
