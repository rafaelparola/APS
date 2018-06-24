package Controller;

import Bd.TratamentoBd;
import Model.Tratamento;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class TratamentoController {
    Tratamento tratamento = new Tratamento();
    TratamentoBd tratamentoBd = new TratamentoBd();
 
    public void insereTratamento(Tratamento tratamento){
        JOptionPane.showMessageDialog(null, tratamento.getConsulta().getId());
        tratamentoBd.persisteTratamento(tratamento);
    }
    
}
