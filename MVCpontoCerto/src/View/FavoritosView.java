/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.*;
import Model.DisciplinaModel;
import Util.Order;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import Util.*;
import Util.MySQL_POST;
//import javax.swing.ListModel;

/**
 *
 * @author Leonardo
 */
public class FavoritosView extends javax.swing.JFrame implements Serializable {
    //DisciplinasController dc = FluxoTelasController.getDc();
    DisciplinasController2 dc = FluxoTelasController.getDc2();
    //DisciplinasController2 dc2 = FluxoTelasController.getDc2();
    /**
     * Creates new form controleDisciplinasView
     */
//    
//    public DisciplinasController2 getDisciplinaController2()
//    {
//        return dc2;       
//    }
//    
//            
            
    public FavoritosView() {
        //this.setLocationRelativeTo(null);
        initComponents();
        //this.setLocationRelativeTo(null);
        DisciplinasLt.setModel(Order.ordenaListModel(dc.listaDisciplinas()));
        FavoritosLt.setModel(Order.ordenaListModel(dc.listaFavoritos()));  
//        DisciplinasLt.setModel(Order.ordenaListModel((DefaultListModel)DisciplinasLt.getModel()));
//        FavoritosLt.setModel(Order.ordenaListModel((DefaultListModel)FavoritosLt.getModel()));
        //DisciplinasLt.setModel(MySQL_POST.carregaListaDisc("select nome from disciplina"));
        
//        fav = new FavoritosModel();
//        
//        if(fav.getNomeFavoritos().getSize()>0)
//        {
//            FavoritosLt.setModel(fav.getNomeFavoritos());
//            //System.out.println(FavoritosLt.getModel());
//        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisciplinasSP = new javax.swing.JScrollPane();
        DisciplinasLt = new javax.swing.JList<>();
        DisciplinasLb = new javax.swing.JLabel();
        FavoritosLb = new javax.swing.JLabel();
        ImportarFavBt = new javax.swing.JButton();
        FavoritosSP = new javax.swing.JScrollPane();
        FavoritosLt = new javax.swing.JList<>();
        EditarBt = new javax.swing.JButton();
        InstrucoesLb = new javax.swing.JLabel();
        RemoverBt = new javax.swing.JButton();
        VoltarBt = new javax.swing.JButton();
        VerMateriasBt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo - Disciplinas");

        DisciplinasLt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DisciplinasSP.setViewportView(DisciplinasLt);

        DisciplinasLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        DisciplinasLb.setText("Disciplinas");
        DisciplinasLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        FavoritosLb.setFont(new java.awt.Font("Tempus Sans ITC", 1, 13)); // NOI18N
        FavoritosLb.setText("Favoritos");
        FavoritosLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ImportarFavBt.setBackground(new java.awt.Color(255, 255, 255));
        ImportarFavBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Adicionar.png"))); // NOI18N
        ImportarFavBt.setToolTipText("Adicionar");
        ImportarFavBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImportarFavBt.setMaximumSize(new java.awt.Dimension(60, 60));
        ImportarFavBt.setMinimumSize(new java.awt.Dimension(60, 60));
        ImportarFavBt.setPreferredSize(new java.awt.Dimension(60, 60));
        ImportarFavBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarFavBtActionPerformed(evt);
            }
        });

        FavoritosSP.setViewportView(FavoritosLt);

        EditarBt.setBackground(new java.awt.Color(255, 255, 255));
        EditarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        EditarBt.setToolTipText("Editar");
        EditarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarBt.setMaximumSize(new java.awt.Dimension(60, 60));
        EditarBt.setMinimumSize(new java.awt.Dimension(60, 60));
        EditarBt.setPreferredSize(new java.awt.Dimension(60, 60));
        EditarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtActionPerformed(evt);
            }
        });

        InstrucoesLb.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        InstrucoesLb.setText("<html> Para selecionar multiplas disciplinas <br> pressione 'ctrl' e clique.");
        InstrucoesLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        RemoverBt.setBackground(new java.awt.Color(255, 255, 255));
        RemoverBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Remover.png"))); // NOI18N
        RemoverBt.setToolTipText("Remover");
        RemoverBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoverBt.setMaximumSize(new java.awt.Dimension(60, 60));
        RemoverBt.setMinimumSize(new java.awt.Dimension(60, 60));
        RemoverBt.setPreferredSize(new java.awt.Dimension(60, 60));
        RemoverBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverBtActionPerformed(evt);
            }
        });

        VoltarBt.setBackground(new java.awt.Color(255, 255, 255));
        VoltarBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        VoltarBt.setToolTipText("Voltar");
        VoltarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBt.setMaximumSize(new java.awt.Dimension(36, 36));
        VoltarBt.setMinimumSize(new java.awt.Dimension(36, 36));
        VoltarBt.setPreferredSize(new java.awt.Dimension(36, 36));
        VoltarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtActionPerformed(evt);
            }
        });

        VerMateriasBt.setBackground(new java.awt.Color(255, 255, 255));
        VerMateriasBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ver.png"))); // NOI18N
        VerMateriasBt.setToolTipText("Ver Materiais");
        VerMateriasBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerMateriasBt.setMaximumSize(new java.awt.Dimension(68, 68));
        VerMateriasBt.setMinimumSize(new java.awt.Dimension(68, 68));
        VerMateriasBt.setPreferredSize(new java.awt.Dimension(68, 68));
        VerMateriasBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMateriasBtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        jButton1.setToolTipText("Salvar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton1.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ImportarFavBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RemoverBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VerMateriasBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DisciplinasLb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FavoritosLb)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FavoritosSP, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VoltarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisciplinasLb)
                    .addComponent(FavoritosLb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ImportarFavBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoverBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FavoritosSP)
                            .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(VerMateriasBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImportarFavBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarFavBtActionPerformed
   
        //System.out.println(DisciplinasLt.getModel());
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
    for(int i = 0;i< DisciplinasLt.getSelectedIndices().length;i++)
    {
        listModel.addElement(DisciplinasLt.getSelectedValuesList().get(i));
    }    
    for(int i = 0;i< FavoritosLt.getModel().getSize();i++)
    {
        listModel.addElement(FavoritosLt.getModel().getElementAt(i));
    }
    
    FavoritosLt.setModel(listModel);
       
    DefaultListModel<String> listModel2 = new DefaultListModel<>();
    
    for(int i = 0; i< DisciplinasLt.getModel().getSize();i++)
    {
        if(!DisciplinasLt.isSelectedIndex(i))
        {
            listModel2.addElement(DisciplinasLt.getModel().getElementAt(i));
        }        
    }
    
    DisciplinasLt.setModel(listModel2);
    
    DisciplinasLt.setModel(Order.ordenaListModel((DefaultListModel)DisciplinasLt.getModel()));
    FavoritosLt.setModel(Order.ordenaListModel((DefaultListModel)FavoritosLt.getModel()));
    }//GEN-LAST:event_ImportarFavBtActionPerformed

    private void EditarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtActionPerformed
        // TODO add your handling code here:
        NotaView DiscView = FluxoTelasController.getCnv();
        //DiscView.setVisible(true);
        
        
        if(FavoritosLt.getSelectedIndices().length>1 || FavoritosLt.getSelectedIndices().length==0)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma disciplina nos favoritos.");
        }
        else
        {
            DiscView.setVisible(true);
            DiscView.setNomeDisciplina(FavoritosLt.getSelectedValue());
            this.setVisible(false);
            DiscView.carregaNotaDisc();
        }
                
        
    }//GEN-LAST:event_EditarBtActionPerformed

    private void RemoverBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverBtActionPerformed
    DefaultListModel<String> listModel = new DefaultListModel<>();
        
    for(int i = 0;i< FavoritosLt.getSelectedIndices().length;i++)
    {
        listModel.addElement(FavoritosLt.getSelectedValuesList().get(i));
    }    
    for(int i = 0;i< DisciplinasLt.getModel().getSize();i++)
    {
        listModel.addElement(DisciplinasLt.getModel().getElementAt(i));
    }
    
    DisciplinasLt.setModel(listModel);
       
    DefaultListModel<String> listModel2 = new DefaultListModel<>();
    
    for(int i = 0; i< FavoritosLt.getModel().getSize();i++)
    {
        if(!FavoritosLt.isSelectedIndex(i))
        {
            listModel2.addElement(FavoritosLt.getModel().getElementAt(i));
        }        
    }
    
    FavoritosLt.setModel(listModel2);
    
    DisciplinasLt.setModel(Order.ordenaListModel((DefaultListModel)DisciplinasLt.getModel()));
    FavoritosLt.setModel(Order.ordenaListModel((DefaultListModel)FavoritosLt.getModel()));
    }//GEN-LAST:event_RemoverBtActionPerformed

    private void VoltarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtActionPerformed
        //new HomeView().show();
        FluxoTelasController.getHv().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VoltarBtActionPerformed

    private void VerMateriasBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMateriasBtActionPerformed
        MateriaisView DiscView = FluxoTelasController.getCdv();
        //DiscView.setVisible(true);
        if((FavoritosLt.getSelectedIndices().length>1 || FavoritosLt.getSelectedIndices().length==0)&&(DisciplinasLt.getSelectedIndices().length>1 || DisciplinasLt.getSelectedIndices().length==0))
        {
            JOptionPane.showMessageDialog(null, "Selecione uma disciplina.");
        }
        else if(FavoritosLt.isSelectedIndex(FavoritosLt.getSelectedIndex()))
        {
            DiscView.setVisible(true);
            DiscView.setNomeDisciplina(FavoritosLt.getSelectedValue());
            this.setVisible(false);
        }
        else
        {
            DiscView.setVisible(true);
            DiscView.setNomeDisciplina(DisciplinasLt.getSelectedValue());
            this.setVisible(false);
        }
    }//GEN-LAST:event_VerMateriasBtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        fav.setNomeFavoritos((DefaultListModel<String>) FavoritosLt.getModel());
//        System.out.println(fav.getNomeFavoritos());
//        fav.saveListNomeFavoritos();
        dc.setFavoritos(FavoritosLt.getModel()); System.out.println(FavoritosLt.getModel());
        dc.serializaDisciplinas();
        //dc.escreveArquivos();       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FavoritosView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisciplinasLb;
    private javax.swing.JList<String> DisciplinasLt;
    private javax.swing.JScrollPane DisciplinasSP;
    private javax.swing.JButton EditarBt;
    private javax.swing.JLabel FavoritosLb;
    private javax.swing.JList<String> FavoritosLt;
    private javax.swing.JScrollPane FavoritosSP;
    private javax.swing.JButton ImportarFavBt;
    private javax.swing.JLabel InstrucoesLb;
    private javax.swing.JButton RemoverBt;
    private javax.swing.JButton VerMateriasBt;
    private javax.swing.JButton VoltarBt;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
