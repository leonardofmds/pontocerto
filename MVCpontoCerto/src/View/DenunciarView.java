/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FluxoTelasController;
import Controller.MateriaisController;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author labccet
 */
public class DenunciarView extends javax.swing.JFrame {

    /**
     * Creates new form DenunciarView
     */
    MateriaisController material = new MateriaisController();
    
    public DenunciarView() {
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

        DenunciarBt = new javax.swing.JButton();
        CancelarDenunciaBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DenunciaTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo - Denunciar");

        DenunciarBt.setBackground(new java.awt.Color(255, 255, 255));
        DenunciarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Enviar.png"))); // NOI18N
        DenunciarBt.setToolTipText("Enviar");
        DenunciarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DenunciarBt.setMaximumSize(new java.awt.Dimension(60, 60));
        DenunciarBt.setMinimumSize(new java.awt.Dimension(60, 60));
        DenunciarBt.setPreferredSize(new java.awt.Dimension(60, 60));
        DenunciarBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Enviar2.png"))); // NOI18N
        DenunciarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenunciarBtActionPerformed(evt);
            }
        });

        CancelarDenunciaBt.setBackground(new java.awt.Color(255, 255, 255));
        CancelarDenunciaBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        CancelarDenunciaBt.setToolTipText("Cancelar");
        CancelarDenunciaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelarDenunciaBt.setMaximumSize(new java.awt.Dimension(60, 60));
        CancelarDenunciaBt.setMinimumSize(new java.awt.Dimension(60, 60));
        CancelarDenunciaBt.setPreferredSize(new java.awt.Dimension(60, 60));
        CancelarDenunciaBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar2.png"))); // NOI18N
        CancelarDenunciaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarDenunciaBtActionPerformed(evt);
            }
        });

        DenunciaTA.setColumns(20);
        DenunciaTA.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        DenunciaTA.setLineWrap(true);
        DenunciaTA.setRows(5);
        jScrollPane1.setViewportView(DenunciaTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DenunciarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelarDenunciaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenunciarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelarDenunciaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarDenunciaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarDenunciaBtActionPerformed
        Reseta();        
        FluxoTelasController.getCdv().setEnabled(true);
        FluxoTelasController.getCdv().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarDenunciaBtActionPerformed

    private void DenunciarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenunciarBtActionPerformed
       String disciplina, semestre, tipo;
       
       disciplina = FluxoTelasController.getCdv().getDisciplina();
       semestre = FluxoTelasController.getCdv().getSemestre();
       tipo = FluxoTelasController.getCdv().getTipo();
        
        if ( DenunciaTA.getText().trim().equals("") )
           JOptionPane.showMessageDialog(null, "Por favor insira o motivo da denúncia.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
       else{
           material.DenunciaMaterial(DenunciaTA.getText(), disciplina, tipo, semestre);
           
           Reseta();           
           
           FluxoTelasController.getCdv().setVisible(true);
           FluxoTelasController.getCdv().setEnabled(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_DenunciarBtActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Reseta(){
        DenunciaTA.setText("");
    }
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
            java.util.logging.Logger.getLogger(DenunciarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DenunciarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DenunciarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DenunciarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DenunciarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarDenunciaBt;
    private javax.swing.JTextArea DenunciaTA;
    private javax.swing.JButton DenunciarBt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
