/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import java.io.File;
import javax.activation.FileDataSource;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author labccet
 */
public class EnviarMaterialView extends javax.swing.JFrame {

    /**
     * Creates new form EnviarMaterialView
     */
    
    MateriaisController material = FluxoTelasController.getMc();     
    FileDataSource fds;
    
    public EnviarMaterialView() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoMaterialCb = new javax.swing.JComboBox<>();
        SemestreCb = new javax.swing.JComboBox<>();
        AnoTf = new javax.swing.JTextField();
        TipoEnviarLb = new javax.swing.JLabel();
        AnoMaterialLb = new javax.swing.JLabel();
        SemestreLb = new javax.swing.JLabel();
        CancelaMaterialBt = new javax.swing.JButton();
        EnviarMaterialBt = new javax.swing.JButton();
        SubLb = new javax.swing.JLabel();
        SubTipoCb = new javax.swing.JComboBox<>();
        DisciplinaLb = new javax.swing.JLabel();
        DisciplinaTf = new javax.swing.JTextField();
        ArquivoTf = new javax.swing.JTextField();
        AbrirBt = new javax.swing.JButton();
        AnoMaterialLb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo - Enviar Material");
        setBackground(new java.awt.Color(204, 204, 204));

        TipoMaterialCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prova", "Trabalho", "Projeto", "Lista" }));
        TipoMaterialCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMaterialCbActionPerformed(evt);
            }
        });

        SemestreCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        SemestreCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestreCbActionPerformed(evt);
            }
        });

        TipoEnviarLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        TipoEnviarLb.setText("Tipo:");

        AnoMaterialLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        AnoMaterialLb.setText("Ano:");

        SemestreLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        SemestreLb.setText("Semestre:");

        CancelaMaterialBt.setBackground(new java.awt.Color(255, 255, 255));
        CancelaMaterialBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        CancelaMaterialBt.setToolTipText("Cancelar");
        CancelaMaterialBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelaMaterialBt.setMaximumSize(new java.awt.Dimension(60, 60));
        CancelaMaterialBt.setMinimumSize(new java.awt.Dimension(60, 60));
        CancelaMaterialBt.setName(""); // NOI18N
        CancelaMaterialBt.setPreferredSize(new java.awt.Dimension(60, 60));
        CancelaMaterialBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar2.png"))); // NOI18N
        CancelaMaterialBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaMaterialBtActionPerformed(evt);
            }
        });

        EnviarMaterialBt.setBackground(new java.awt.Color(255, 255, 255));
        EnviarMaterialBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Enviar.png"))); // NOI18N
        EnviarMaterialBt.setToolTipText("Enviar");
        EnviarMaterialBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarMaterialBt.setMaximumSize(new java.awt.Dimension(60, 60));
        EnviarMaterialBt.setMinimumSize(new java.awt.Dimension(60, 60));
        EnviarMaterialBt.setPreferredSize(new java.awt.Dimension(60, 60));
        EnviarMaterialBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Enviar2.png"))); // NOI18N
        EnviarMaterialBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMaterialBtActionPerformed(evt);
            }
        });

        SubLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        SubLb.setText("Sub-Tipo:");

        SubTipoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "Reposição" }));
        SubTipoCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTipoCbActionPerformed(evt);
            }
        });

        DisciplinaLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        DisciplinaLb.setText("Disciplina:");

        ArquivoTf.setEditable(false);
        ArquivoTf.setOpaque(false);

        AbrirBt.setBackground(new java.awt.Color(255, 255, 255));
        AbrirBt.setForeground(new java.awt.Color(255, 255, 255));
        AbrirBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Abrir.png"))); // NOI18N
        AbrirBt.setToolTipText("Abrir Arquivo");
        AbrirBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbrirBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Abrir2.png"))); // NOI18N
        AbrirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirBtActionPerformed(evt);
            }
        });

        AnoMaterialLb1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        AnoMaterialLb1.setText("Arquivo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ArquivoTf)
                        .addGap(18, 18, 18)
                        .addComponent(AbrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DisciplinaLb)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TipoMaterialCb, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TipoEnviarLb)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AnoMaterialLb)
                                                .addComponent(AnoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(49, 49, 49)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SemestreCb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SemestreLb))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SubLb)
                                        .addComponent(SubTipoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(DisciplinaTf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EnviarMaterialBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CancelaMaterialBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AnoMaterialLb1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(DisciplinaLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisciplinaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoEnviarLb)
                    .addComponent(SubLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoMaterialCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubTipoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoMaterialLb)
                    .addComponent(SemestreLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SemestreCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AnoMaterialLb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArquivoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnviarMaterialBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaMaterialBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TipoMaterialCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMaterialCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoMaterialCbActionPerformed

    private void CancelaMaterialBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaMaterialBtActionPerformed
        Reseta();
        
        FluxoTelasController.getHv().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelaMaterialBtActionPerformed

    private void EnviarMaterialBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMaterialBtActionPerformed
        // TODO add your handling code here:
        String disciplina,tipo,subtipo, ano, semestre;
        
        if ( ArquivoTf.getText().trim().equals("") ) 
             JOptionPane.showMessageDialog(null, "Por favor selecione um arquivo.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
        else {
            disciplina = DisciplinaTf.getText();
            tipo = (String) TipoMaterialCb.getSelectedItem();
            subtipo = (String) SubTipoCb.getSelectedItem();
            ano = AnoTf.getText();
            semestre = (String) SemestreCb.getSelectedItem();       
        
        
        
            material.EnviaMaterial(disciplina, tipo, subtipo, ano, semestre, fds);
            
            JOptionPane.showMessageDialog(null, "Menssagem enviada com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon ("src/Imagens/Ok.png"));
        
            Reseta();
            
            FluxoTelasController.getHv().setVisible(true);
            this.setVisible(false);
        }        
        
    }//GEN-LAST:event_EnviarMaterialBtActionPerformed

    private void SubTipoCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTipoCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTipoCbActionPerformed

    private void SemestreCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestreCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemestreCbActionPerformed

    private void AbrirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirBtActionPerformed
         JFileChooser file = new JFileChooser(); 
          file.setFileSelectionMode(JFileChooser.FILES_ONLY);
          int i= file.showOpenDialog(null);
        if (i==1){
            ArquivoTf.setText("");
        } else {
           File arquivo = file.getSelectedFile();
           ArquivoTf.setText(arquivo.getAbsolutePath());
           fds = new FileDataSource(arquivo.getAbsolutePath());
        }
    }//GEN-LAST:event_AbrirBtActionPerformed
    private void Reseta(){
            DisciplinaTf.setText("");
            AnoTf.setText("");
            ArquivoTf.setText("");
            TipoMaterialCb.setSelectedIndex(0);
            SubTipoCb.setSelectedIndex(0);
            SemestreCb.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(EnviarMaterialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviarMaterialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviarMaterialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviarMaterialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviarMaterialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirBt;
    private javax.swing.JLabel AnoMaterialLb;
    private javax.swing.JLabel AnoMaterialLb1;
    private javax.swing.JTextField AnoTf;
    private javax.swing.JTextField ArquivoTf;
    private javax.swing.JButton CancelaMaterialBt;
    private javax.swing.JLabel DisciplinaLb;
    private javax.swing.JTextField DisciplinaTf;
    private javax.swing.JButton EnviarMaterialBt;
    private javax.swing.JComboBox<String> SemestreCb;
    private javax.swing.JLabel SemestreLb;
    private javax.swing.JLabel SubLb;
    private javax.swing.JComboBox<String> SubTipoCb;
    private javax.swing.JLabel TipoEnviarLb;
    private javax.swing.JComboBox<String> TipoMaterialCb;
    // End of variables declaration//GEN-END:variables
}
