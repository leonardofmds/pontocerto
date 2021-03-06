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
import Util.doSomethingOnClose;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Leonardo
 */
public class HomeView extends javax.swing.JFrame {
    

    /**
     * Creates new form homeView
     */
    
    AdmController adm = FluxoTelasController.getAdm();
    
    public HomeView() {        
        initComponents(); 
        
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
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
        AdmBt = new javax.swing.JButton();
        AdmoutBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LogoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        LogoLb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DisciplinasBt.setBackground(new java.awt.Color(255, 255, 255));
        DisciplinasBt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        DisciplinasBt.setForeground(new java.awt.Color(102, 102, 102));
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
        EnviarBt.setForeground(new java.awt.Color(102, 102, 102));
        EnviarBt.setText("ENVIAR MATERIAL");
        EnviarBt.setActionCommand("Enviar");
        EnviarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBtActionPerformed(evt);
            }
        });

        AdmBt.setBackground(new java.awt.Color(255, 255, 255));
        AdmBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login.png"))); // NOI18N
        AdmBt.setToolTipText("Administrador");
        AdmBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdmBt.setMaximumSize(new java.awt.Dimension(30, 30));
        AdmBt.setMinimumSize(new java.awt.Dimension(30, 30));
        AdmBt.setPreferredSize(new java.awt.Dimension(30, 30));
        AdmBt.setRequestFocusEnabled(false);
        AdmBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login2.png"))); // NOI18N
        AdmBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmBtActionPerformed(evt);
            }
        });

        AdmoutBt.setBackground(new java.awt.Color(255, 255, 255));
        AdmoutBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logout.png"))); // NOI18N
        AdmoutBt.setToolTipText("Logout");
        AdmoutBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdmoutBt.setMaximumSize(new java.awt.Dimension(30, 30));
        AdmoutBt.setMinimumSize(new java.awt.Dimension(30, 30));
        AdmoutBt.setPreferredSize(new java.awt.Dimension(30, 30));
        AdmoutBt.setRequestFocusEnabled(false);
        AdmoutBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logout2.png"))); // NOI18N
        AdmoutBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmoutBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnviarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(LogoLb))
                                .addComponent(DisciplinasBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdmoutBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdmBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdmBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdmoutBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LogoLb)
                .addGap(34, 34, 34)
                .addComponent(DisciplinasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnviarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void AdmBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmBtActionPerformed
        ArrayList<String> s;
        s = MySQL_POST.carregaListaDisc("SELECT COUNT(1) FROM USUARIO");
        if(s.size()==0)
        {
            JOptionPane.showMessageDialog(null, "Por favor verifique sua conexão e tente novamente", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
        }
        else
        {
            this.setVisible(false);
            FluxoTelasController.getLgv().setVisible(true);           
        }
              
    }//GEN-LAST:event_AdmBtActionPerformed

    private void AdmoutBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmoutBtActionPerformed
        int Desloga = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deslogar?", "Deslogar", JOptionPane.YES_NO_OPTION, 0, new ImageIcon ("src/Imagens/Pergunta.png"));
        
        if(Desloga != 1)
            adm.Desloga();        
    }//GEN-LAST:event_AdmoutBtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        adm.ativaComponentsADM();
    }//GEN-LAST:event_formWindowOpened

    public JButton getAdmBt(){
        return AdmBt;
    }
    public JButton getAdmoutBt(){
        return AdmoutBt;
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
    private javax.swing.JButton AdmBt;
    private javax.swing.JButton AdmoutBt;
    private javax.swing.JButton DisciplinasBt;
    private javax.swing.JButton EnviarBt;
    private javax.swing.JLabel LogoLb;
    // End of variables declaration//GEN-END:variables
}
