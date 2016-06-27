/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FluxoTelasController;
import Util.MySQL_POST;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CPD RJ
 */
public class AddDisciplinaView extends javax.swing.JFrame {

    /**
     * Creates new form AddDisciplinaView
     */
    public AddDisciplinaView() {
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

        NomeLb = new javax.swing.JLabel();
        NomeTf = new javax.swing.JTextField();
        SalvarBt = new javax.swing.JButton();
        CancelarAddBt = new javax.swing.JButton();

        setTitle("Ponto Certo - Adicionar Disciplina");
        setResizable(false);

        NomeLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        NomeLb.setText("Nome:");

        NomeTf.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        SalvarBt.setBackground(new java.awt.Color(255, 255, 255));
        SalvarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        SalvarBt.setToolTipText("Salvar");
        SalvarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalvarBt.setMaximumSize(new java.awt.Dimension(60, 60));
        SalvarBt.setMinimumSize(new java.awt.Dimension(60, 60));
        SalvarBt.setPreferredSize(new java.awt.Dimension(60, 60));
        SalvarBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar2.png"))); // NOI18N
        SalvarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarBtActionPerformed(evt);
            }
        });

        CancelarAddBt.setBackground(new java.awt.Color(255, 255, 255));
        CancelarAddBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        CancelarAddBt.setToolTipText("Cancelar");
        CancelarAddBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelarAddBt.setMaximumSize(new java.awt.Dimension(60, 60));
        CancelarAddBt.setMinimumSize(new java.awt.Dimension(60, 60));
        CancelarAddBt.setPreferredSize(new java.awt.Dimension(60, 60));
        CancelarAddBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar2.png"))); // NOI18N
        CancelarAddBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarAddBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeLb)
                    .addComponent(NomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelarAddBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CancelarAddBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SalvarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBtActionPerformed
        if ( NomeTf.getText().trim().equals("") )
           JOptionPane.showMessageDialog(null, "Por favor insira o nome da disciplina.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
       else{        
           
            MySQL_POST.main("INSERT INTO DISCIPLINA (NOME) VALUES("+"'"+NomeTf.getText()+"');");
            Reseta();
           JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon ("src/Imagens/Ok.png"));
           
           FluxoTelasController.getCfv().setVisible(true);
           FluxoTelasController.getCfv().setEnabled(true);
           this.setVisible(false);
       }
    }//GEN-LAST:event_SalvarBtActionPerformed

    private void CancelarAddBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAddBtActionPerformed
        Reseta();
        FluxoTelasController.getCfv().setVisible(true);
        FluxoTelasController.getCfv().setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarAddBtActionPerformed

    /**
     * @param args the command line arguments
     */
    private void Reseta(){
        NomeTf.setText("");
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
            java.util.logging.Logger.getLogger(AddDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDisciplinaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarAddBt;
    private javax.swing.JLabel NomeLb;
    private javax.swing.JTextField NomeTf;
    private javax.swing.JButton SalvarBt;
    // End of variables declaration//GEN-END:variables
}
