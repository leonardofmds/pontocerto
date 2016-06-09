/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import java.io.File;
import javax.activation.FileDataSource;
import javax.swing.JButton;
import javax.swing.JFileChooser;

/**
 *
 * @author labccet
 */
public class EnviarMaterialView extends javax.swing.JFrame {

    /**
     * Creates new form EnviarMaterialView
     */
    
    MateriaisController material = new MateriaisController();    
    File arquivo;
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TipoMaterialCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prova", "Trabalho", "Projeto" }));
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

        TipoEnviarLb.setText("Tipo:");

        AnoMaterialLb.setText("Ano:");

        SemestreLb.setText("Semestre:");

        CancelaMaterialBt.setText("Cancelar");
        CancelaMaterialBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelaMaterialBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaMaterialBtActionPerformed(evt);
            }
        });

        EnviarMaterialBt.setText("Enviar");
        EnviarMaterialBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarMaterialBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarMaterialBtActionPerformed(evt);
            }
        });

        SubLb.setText("Sub-Tipo:");

        SubTipoCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "Reposição" }));
        SubTipoCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTipoCbActionPerformed(evt);
            }
        });

        DisciplinaLb.setText("Disciplina:");

        ArquivoTf.setEditable(false);

        AbrirBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Abrir.png"))); // NOI18N
        AbrirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DisciplinaTf)
                    .addComponent(TipoMaterialCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipoEnviarLb)
                            .addComponent(SubLb)
                            .addComponent(SubTipoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisciplinaLb)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AnoMaterialLb, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EnviarMaterialBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(AnoTf, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SemestreLb)
                                    .addComponent(SemestreCb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CancelaMaterialBt))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ArquivoTf)
                        .addGap(18, 18, 18)
                        .addComponent(AbrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(DisciplinaLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisciplinaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoEnviarLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoMaterialCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubTipoCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoMaterialLb)
                    .addComponent(SemestreLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemestreCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AbrirBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArquivoTf))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarMaterialBt)
                    .addComponent(CancelaMaterialBt))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TipoMaterialCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMaterialCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoMaterialCbActionPerformed

    private void CancelaMaterialBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaMaterialBtActionPerformed
        //new HomeView().show();
        FluxoTelasController.getHv().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelaMaterialBtActionPerformed

    private void EnviarMaterialBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarMaterialBtActionPerformed
        // TODO add your handling code here:
        String disciplina,tipo,subtipo, ano, semestre;
                
        disciplina = DisciplinaTf.getText();
        tipo = (String) TipoMaterialCb.getSelectedItem();
        subtipo = (String) SubTipoCb.getSelectedItem();
        ano = AnoTf.getText();
        semestre = (String) SemestreCb.getSelectedItem();
        
        
        
        material.EnviaMaterial(disciplina, tipo, subtipo, ano, semestre);
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
          int i= file.showSaveDialog(null);
        if (i==1){
            ArquivoTf.setText("");
        } else {
           File arquivo = file.getSelectedFile();
           ArquivoTf.setText(arquivo.getAbsolutePath());
           FileDataSource fds = new FileDataSource(arquivo.getAbsolutePath());
        }
    }//GEN-LAST:event_AbrirBtActionPerformed

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
