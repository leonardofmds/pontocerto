/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


/**
 *
 * @author labccet
 */
import Controller.*;
import Util.doSomethingOnClose;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    
    AdmController adm = FluxoTelasController.getAdm();
    public LoginView() {
        initComponents();
        doSomethingOnClose.newWindowEvent(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarBt = new javax.swing.JButton();
        UserLb = new javax.swing.JLabel();
        UserTf = new javax.swing.JTextField();
        SenhaLb = new javax.swing.JLabel();
        SenhaPf = new javax.swing.JPasswordField();
        LoginBt = new javax.swing.JButton();
        CancelaLoginBt = new javax.swing.JButton();

        VoltarBt.setBackground(new java.awt.Color(255, 255, 255));
        VoltarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        VoltarBt.setToolTipText("Voltar");
        VoltarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBt.setMaximumSize(new java.awt.Dimension(36, 36));
        VoltarBt.setMinimumSize(new java.awt.Dimension(36, 36));
        VoltarBt.setPreferredSize(new java.awt.Dimension(36, 36));
        VoltarBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar2.png"))); // NOI18N
        VoltarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo - Administrador");
        setResizable(false);

        UserLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        UserLb.setText("Administrador:");

        UserTf.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        UserTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserTfKeyPressed(evt);
            }
        });

        SenhaLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        SenhaLb.setText("Senha:");

        SenhaPf.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        SenhaPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaPfActionPerformed(evt);
            }
        });
        SenhaPf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SenhaPfKeyPressed(evt);
            }
        });

        LoginBt.setBackground(new java.awt.Color(255, 255, 255));
        LoginBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Entrar.png"))); // NOI18N
        LoginBt.setToolTipText("Login");
        LoginBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBt.setMaximumSize(new java.awt.Dimension(60, 60));
        LoginBt.setMinimumSize(new java.awt.Dimension(60, 60));
        LoginBt.setName(""); // NOI18N
        LoginBt.setPreferredSize(new java.awt.Dimension(60, 60));
        LoginBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Entrar2.png"))); // NOI18N
        LoginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtActionPerformed(evt);
            }
        });

        CancelaLoginBt.setBackground(new java.awt.Color(255, 255, 255));
        CancelaLoginBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        CancelaLoginBt.setToolTipText("Cancelar");
        CancelaLoginBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelaLoginBt.setMaximumSize(new java.awt.Dimension(60, 60));
        CancelaLoginBt.setMinimumSize(new java.awt.Dimension(60, 60));
        CancelaLoginBt.setName(""); // NOI18N
        CancelaLoginBt.setPreferredSize(new java.awt.Dimension(60, 60));
        CancelaLoginBt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar2.png"))); // NOI18N
        CancelaLoginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaLoginBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserTf)
                            .addComponent(SenhaPf, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CancelaLoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(SenhaLb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(UserLb)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(SenhaLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaLoginBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtActionPerformed
        
    }//GEN-LAST:event_VoltarBtActionPerformed
//Botão que efetua o login
    private void LoginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtActionPerformed
        //FluxoTelasController.getHv().setEnabled(true);
        FluxoTelasController.getHv().setVisible(true);       
        //chama o método login para verificação
        Login();
        
    }//GEN-LAST:event_LoginBtActionPerformed
//Botão para cancelar o login
    private void CancelaLoginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaLoginBtActionPerformed
        //FluxoTelasController.getHv().setEnabled(true);
        FluxoTelasController.getHv().setVisible(true);
        //chama o metodo para limpar todos os campos
        Reseta();
        //finaliza a tela LoginView
        this.setVisible(false);
    }//GEN-LAST:event_CancelaLoginBtActionPerformed

    //Evento ao pressionar a tecla enter no campo senha
    private void SenhaPfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SenhaPfKeyPressed
        //se a tecla enter for precionada
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
            //efetua a verificação de login
            //FluxoTelasController.getHv().setEnabled(true);
            FluxoTelasController.getHv().setVisible(true); 
            Login();
        }
    }//GEN-LAST:event_SenhaPfKeyPressed

    private void SenhaPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaPfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaPfActionPerformed
    //Evento ao pressionar a tecla enter no campo usuário
    private void UserTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserTfKeyPressed
        //se a tecla enter for precisonada
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){  
            //efetua a verificação de login
            //FluxoTelasController.getHv().setEnabled(true);
            FluxoTelasController.getHv().setVisible(true); 
            Login();
        }
    }//GEN-LAST:event_UserTfKeyPressed
    
    //Método para limpar os campos
    public void Reseta(){
        UserTf.setText("");
        SenhaPf.setText("");
    }
    
    //Metodo da verificação do login
    private void Login(){
        String user;
        String senha;
        
        if(UserTf.getText().trim().equals("")||SenhaPf.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor preencha a autenticação.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
            Reseta();
        }
        else{
            user = UserTf.getText();            
            senha = SenhaPf.getText();
            
            //Chama a autenticação de AdmController, passando usuário e senha como parâmetro
            adm.Logado(user,senha);
            
            
            //Verifica se está logado com sucesso
            if(adm.getLog()){   
                adm.ativaComponentsADM();
                this.setVisible(false);
                Reseta();
            }
            //Caso não esteja logado retorna aviso
            else{
                JOptionPane.showMessageDialog(null, "Login inválido.", "Erro", JOptionPane.ERROR_MESSAGE, new ImageIcon ("src/Imagens/Aviso.png"));
                Reseta();
            }            
        }
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaLoginBt;
    private javax.swing.JButton LoginBt;
    private javax.swing.JLabel SenhaLb;
    private javax.swing.JPasswordField SenhaPf;
    private javax.swing.JLabel UserLb;
    private javax.swing.JTextField UserTf;
    private javax.swing.JButton VoltarBt;
    // End of variables declaration//GEN-END:variables
}
