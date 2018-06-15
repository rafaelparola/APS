/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Paciente;
import Bd.Conexao;
import Controller.PacienteController;
import Model.Tabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
/**
 *
 * @author rafael
 */
public class cadastrarPaciente extends javax.swing.JFrame {

        Paciente paciente = new Paciente();
        PacienteController pacienteController = new PacienteController();
        Conexao conexao = new Conexao();
        
    /**
     * Creates new form cadastrarPaciente
     */
    public cadastrarPaciente() {
        
        initComponents();
        preencherTabela("SELECT NOME, CPF, TELEFONE, EMAIL FROM PACIENTES");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCpf = new javax.swing.JTextField();
        jNome = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jCelular = new javax.swing.JTextField();
        jTelefone = new javax.swing.JTextField();
        bCadastrar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Celular");

        jLabel5.setText("Telefone");

        jCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpfActionPerformed(evt);
            }
        });

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        jEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailActionPerformed(evt);
            }
        });

        jCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCelularActionPerformed(evt);
            }
        });

        jTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefoneActionPerformed(evt);
            }
        });

        bCadastrar.setText("Cadastrar");
        bCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCadastrarMouseClicked(evt);
            }
        });
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        bSalvar.setText("Salvar");
        bSalvar.setEnabled(false);
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

        bEditar.setText("Editar");
        bEditar.setEnabled(false);
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

        bExcluir.setText("Excluir");
        bExcluir.setEnabled(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePacientes);

        jLabel6.setText("Pacientes");

        jLabel7.setText("Cadastrar Paciente");

        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(bBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(bEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel6)
                        .addGap(334, 334, 334))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCadastrar)
                            .addComponent(bExcluir)
                            .addComponent(bEditar)
                            .addComponent(bSalvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpfActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed

    private void jEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailActionPerformed

    private void jCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCelularActionPerformed

    private void jTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefoneActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarMouseClicked
        bSalvar.setEnabled(true);
        bEditar.setEnabled(true);
        bExcluir.setEnabled(true);
        bCadastrar.setEnabled(false);
        bBuscar.setEnabled(false);
    }//GEN-LAST:event_bCadastrarMouseClicked

    private void bSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseClicked
             
        
            try {
               if("".equals(jCpf.getText())){
            paciente.setCpf(0L);
        }else{paciente.setCpf(Long.parseLong(jCpf.getText()));}
        } catch (java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "CPF invalido.");
                return;
            }
        
        paciente.setId(0L);
        paciente.setNome(jNome.getText());
        paciente.setTelefoneFixo(jTelefone.getText());
        pacienteController.inserePaciente(paciente);
        this.limpaCampos();
        bSalvar.setEnabled(false);
        jNome.setEnabled(false);
        jTelefone.setEnabled(false);
        bCadastrar.setEnabled(true);
        //preencherTabela("SELECT NOME, CPF, CRO, TELEFONE_FIXO, HORA_INICIO, HORA_FIM FROM DENTISTAS ORDER BY NOME");
        
        
        
        
    }//GEN-LAST:event_bSalvarMouseClicked

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdActionPerformed

    private void bEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarMouseClicked
        
            try {
               if("".equals(jCpf.getText())){
            paciente.setCpf(0L);
        }else{paciente.setCpf(Long.parseLong(jCpf.getText()));}
        } catch (java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "CPF invalido.");
                return;
            }
        
        
        paciente.setId(Long.parseLong(jId.getText()));
        paciente.setNome(jNome.getText());
        paciente.setTelefoneFixo(jTelefone.getText());
        paciente.setEmail(jEmail.getText());
        
        pacienteController.editaPaciente(paciente);
        this.limpaCampos();
        
        preencherTabela("SELECT NOME, CPF, CRO, TELEFONE_FIXO, HORA_INICIO, HORA_FIM FROM DENTISTAS ORDER BY NOME");
        
    }//GEN-LAST:event_bEditarMouseClicked

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
            java.util.logging.Logger.getLogger(cadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarPaciente().setVisible(true);
            }
        });
    }

    
    public void limpaCampos(){
        jId.setText("");
        jCpf.setText("");
        jNome.setText("");
        jTelefone.setText("");
    }
    
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "CPF", "Telefone", "Email"};
        conexao.conecta();
        conexao.executaSql(sql);
        try{
            conexao.rs.first();
            do{
                dados.add(new Object[]{conexao.rs.getString("nome"), conexao.rs.getLong("cpf"),
                                       conexao.rs.getString("telefone"),
                                       conexao.rs.getString("email")});
            }while(conexao.rs.next());
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(rootPane,"erro ao preencher arraLyst: "+ ex);
        }
        Tabela modelo = new Tabela(dados, colunas);
        jTablePacientes.setModel(modelo);
        jTablePacientes.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTablePacientes.getColumnModel().getColumn(0).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTablePacientes.getColumnModel().getColumn(1).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePacientes.getColumnModel().getColumn(2).setResizable(false);
        jTablePacientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTablePacientes.getColumnModel().getColumn(3).setResizable(false);
        jTablePacientes.getTableHeader().setReorderingAllowed(false);
        jTablePacientes.setAutoResizeMode(jTablePacientes.AUTO_RESIZE_OFF);
        jTablePacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.desconecta();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JTextField jCelular;
    private javax.swing.JTextField jCpf;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTelefone;
    // End of variables declaration//GEN-END:variables
}
