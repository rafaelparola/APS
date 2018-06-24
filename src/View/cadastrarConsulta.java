/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Bd.Conexao;
import Model.Consulta;
import Model.Paciente;
import Model.Dentista;
import Controller.ConsultaController;
import Model.Tabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author rafael
 */
public class cadastrarConsulta extends javax.swing.JFrame {
     Consulta consulta = new Consulta();
     ConsultaController consultaController = new ConsultaController();
     Dentista dentista = new Dentista();
     Paciente paciente = new Paciente();
     Conexao conexao = new Conexao();
     
    /** Creates new form cadastrarConsulta */
    public cadastrarConsulta() {
        initComponents();
        
        preencherTabela("SELECT ID, DENTISTA, PACIENTE, DATA_CONSULTA, HORA_INICIO, HORA_FIM FROM CONSULTAS ORDER BY DENTISTA");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCpf = new javax.swing.JTextField();
        jPaciente = new javax.swing.JTextField();
        jDentista = new javax.swing.JTextField();
        jData = new javax.swing.JTextField();
        jHoraFim = new javax.swing.JTextField();
        jHoraInicio = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        bBuscar4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultas = new javax.swing.JTable();
        jIdConsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paciente");

        jLabel2.setText("Dentista");

        jLabel3.setText("Hora Início");

        jLabel4.setText("Cadastrar Consulta");

        jLabel5.setText("Hora Fim");

        jLabel6.setText("Data");

        jLabel7.setText("CPF");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExcluirMouseClicked(evt);
            }
        });
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bEditar.setText("Editar");
        bEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEditarMouseClicked(evt);
            }
        });
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bSalvar.setText("Salvar");
        bSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalvarMouseClicked(evt);
            }
        });
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bBuscar4.setText("Cadastrar");
        bBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscar4ActionPerformed(evt);
            }
        });

        jTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBuscar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(40, 40, 40)
                                                .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bBuscar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDentista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jDentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBuscar4)
                    .addComponent(bSalvar)
                    .addComponent(bEditar)
                    .addComponent(bExcluir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBuscar4ActionPerformed

    private void bSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseClicked
        paciente.setId(Long.parseLong(jPaciente.getText()));
        dentista.setId(Long.parseLong(jDentista.getText()));
        consulta.setPaciente(paciente);
        consulta.setDentista(dentista);
        consulta.setData(jData.getText());
        consulta.setHoraInicio(jHoraInicio.getText());
        consulta.setHoraFim(jHoraFim.getText());
        consultaController.insereConsulta(consulta);
        //this.limpaCampos();
        //bSalvar.setEnabled(false);
        //jNome.setEnabled(false);
        //jTelefone.setEnabled(false);
        //bCadastrar.setEnabled(true);
        //preencherTabela("SELECT NOME, CPF, TELEFONE_FIXO, EMAIL FROM PACIENTES ORDER BY NOME");
        preencherTabela("SELECT ID, DENTISTA, PACIENTE, DATA_CONSULTA, HORA_INICIO, HORA_FIM FROM CONSULTAS ORDER BY DENTISTA");
        
    }//GEN-LAST:event_bSalvarMouseClicked

    private void bEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseClicked
        paciente.setId(Long.parseLong(jPaciente.getText()));
        dentista.setId(Long.parseLong(jDentista.getText()));
        consulta.setId(Integer.parseInt(jIdConsulta.getText()));
        consulta.setPaciente(paciente);
        consulta.setDentista(dentista);
        consulta.setData(jData.getText());
        consulta.setHoraInicio(jHoraInicio.getText());
        consulta.setHoraFim(jHoraFim.getText());
        consultaController.editarConsulta(consulta);
        preencherTabela("SELECT ID, DENTISTA, PACIENTE, DATA_CONSULTA, HORA_INICIO, HORA_FIM FROM CONSULTAS ORDER BY DENTISTA");
    }//GEN-LAST:event_bEditarMouseClicked

    private void jTableConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultasMouseClicked
        String id = "" + jTableConsultas.getValueAt(jTableConsultas.getSelectedRow(), 0);
        conexao.conecta();
        conexao.executaSql("SELECT ID, DENTISTA, PACIENTE, DATA_CONSULTA, HORA_INICIO, HORA_FIM FROM CONSULTAS WHERE ID = "+id+"");
        try {
            conexao.rs.first();
            jIdConsulta.setText(""+conexao.rs.getInt("id"));
            jDentista.setText(conexao.rs.getString("dentista"));
            jPaciente.setText(String.valueOf(conexao.rs.getLong("paciente")));
            jData.setText(conexao.rs.getString("data_consulta"));
            jHoraInicio.setText(conexao.rs.getString("hora_inicio"));
            jHoraFim.setText(conexao.rs.getString("hora_fim"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Errocriado no mouse clicked: "+ex);
        }
        conexao.desconecta();
        /*bEditar.setEnabled(true);
        bSalvar.setEnabled(false);
        bExcluir.setEnabled(true);
        bEditar.setEnabled(true);
        bCadastrar.setEnabled(false);
        jNome.setEnabled(true);
        jTelefone.setEnabled(true);*/
    }//GEN-LAST:event_jTableConsultasMouseClicked

    private void bExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseClicked
        consulta.setId(Integer.parseInt(jIdConsulta.getText()));
        consultaController.excluiConsulta(consulta);
        preencherTabela("SELECT ID, DENTISTA, PACIENTE, DATA_CONSULTA, HORA_INICIO, HORA_FIM FROM CONSULTAS ORDER BY DENTISTA");
    }//GEN-LAST:event_bExcluirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarConsulta().setVisible(true);
            }
        });
    }
    
    /*public void limpaCampos(){
        jId.setText("");
        jCpf.setText("");
        jNome.setText("");
        jTelefone.setText("");
    }*/
    
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Dentista", "Paciente", "Data da Consulta", "Hora inicial", "Hora final"};
        conexao.conecta();
        conexao.executaSql(sql);
        
        try{
            conexao.rs.first();
        do{
            dados.add(new Object[]{conexao.rs.getInt("id") ,conexao.rs.getInt("dentista"), conexao.rs.getInt("paciente"),
                conexao.rs.getString("data_consulta"),
                conexao.rs.getString("hora_inicio"),
                conexao.rs.getString("hora_fim")});
        }while(conexao.rs.next());
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(rootPane,"erro ao preencher arraLyst: "+ ex);
        }
        Tabela modelo = new Tabela(dados, colunas);
        jTableConsultas.setModel(modelo);
        jTableConsultas.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableConsultas.getColumnModel().getColumn(0).setResizable(false);
        jTableConsultas.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableConsultas.getColumnModel().getColumn(1).setResizable(false);
        jTableConsultas.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableConsultas.getColumnModel().getColumn(2).setResizable(false);
        jTableConsultas.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableConsultas.getColumnModel().getColumn(3).setResizable(false);
        jTableConsultas.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableConsultas.getColumnModel().getColumn(4).setResizable(false);
        jTableConsultas.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTableConsultas.getColumnModel().getColumn(5).setResizable(false);
        jTableConsultas.getTableHeader().setReorderingAllowed(false);
        jTableConsultas.setAutoResizeMode(jTableConsultas.AUTO_RESIZE_OFF);
        jTableConsultas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.desconecta();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscar4;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JTextField jCpf;
    private javax.swing.JTextField jData;
    private javax.swing.JTextField jDentista;
    private javax.swing.JTextField jHoraFim;
    private javax.swing.JTextField jHoraInicio;
    private javax.swing.JTextField jIdConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultas;
    // End of variables declaration//GEN-END:variables

}
