/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Util.MySQL_POST;

/**
 *
 * @author Leonardo
 */
public class HomeView extends javax.swing.JFrame {
    

    /**
     * Creates new form homeView
     */
    public HomeView() {
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

        LogoLb = new javax.swing.JLabel();
        DisciplinasBt = new javax.swing.JButton();
        EnviarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo");
        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        LogoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        LogoLb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DisciplinasBt.setBackground(new java.awt.Color(255, 255, 255));
        DisciplinasBt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        DisciplinasBt.setText("DISCIPLINAS");
        DisciplinasBt.setActionCommand("Disciplinas");
        DisciplinasBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DisciplinasBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinasBtActionPerformed(evt);
            }
        });

        EnviarBt.setBackground(new java.awt.Color(255, 255, 255));
        EnviarBt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        EnviarBt.setText("ENVIAR MATERIAL");
        EnviarBt.setActionCommand("Enviar");
        EnviarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EnviarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DisciplinasBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoLb)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLb)
                .addGap(18, 18, 18)
                .addComponent(DisciplinasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(EnviarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DisciplinasBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinasBtActionPerformed
        // TODO add your handling code here:
//        FavoritosView controlDiscView = new FavoritosView();
//        controlDiscView.setVisible(true);
        //this.setVisible(false); 
        //MySQL_POST.main("select nome from disciplinas");
        //MySQL_POST.carregaListaDisc("select nome from disciplina");
        FluxoTelasController.getCfv().setVisible(true);
        this.setVisible(false);
        
        //DisciplinasController dc = new DisciplinasController();
        //dc.saveListNomeFavoritos();
        
    }//GEN-LAST:event_DisciplinasBtActionPerformed

    private void EnviarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBtActionPerformed
        FluxoTelasController.getEmv().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_EnviarBtActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisciplinasBt;
    private javax.swing.JButton EnviarBt;
    private javax.swing.JLabel LogoLb;
    // End of variables declaration//GEN-END:variables
}
