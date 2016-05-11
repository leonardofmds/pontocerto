/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpontocerto;
import javax.swing.*;
//import javax.swing.ListModel;

/**
 *
 * @author Leonardo
 */
public class ControleFavoritosView extends javax.swing.JFrame {

    /**
     * Creates new form controleDisciplinasView
     */
    public ControleFavoritosView() {
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

        DisciplinasSP = new javax.swing.JScrollPane();
        DisciplinasLt = new javax.swing.JList<>();
        DisciplinasLb = new javax.swing.JLabel();
        FavoritosLb = new javax.swing.JLabel();
        ImportarFavLb = new javax.swing.JLabel();
        ImportarFavBt = new javax.swing.JButton();
        FavoritosSP = new javax.swing.JScrollPane();
        FavoritosLt = new javax.swing.JList<>();
        EditarBt = new javax.swing.JButton();
        InstrucoesLb = new javax.swing.JLabel();
        RemoverBt = new javax.swing.JButton();
        VoltarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo");

        DisciplinasLt.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        DisciplinasLt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DisciplinasSP.setViewportView(DisciplinasLt);

        DisciplinasLb.setText("Disciplinas");
        DisciplinasLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        FavoritosLb.setText("Favoritos");
        FavoritosLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ImportarFavLb.setText("<html> Importar <br> Favoritos </html>");
        ImportarFavLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ImportarFavBt.setText(">>>>");
        ImportarFavBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImportarFavBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarFavBtActionPerformed(evt);
            }
        });

        FavoritosSP.setViewportView(FavoritosLt);

        EditarBt.setText("Editar");
        EditarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtActionPerformed(evt);
            }
        });

        InstrucoesLb.setText("<html>\nPara selecionar multiplas disciplinas <br>\npressione 'control' e clique.");
        InstrucoesLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        RemoverBt.setText("Remover");
        RemoverBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoverBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverBtActionPerformed(evt);
            }
        });

        VoltarBt.setText("Voltar");
        VoltarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtActionPerformed(evt);
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
                        .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImportarFavBt)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ImportarFavLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FavoritosSP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(RemoverBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(DisciplinasLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FavoritosLb)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VoltarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FavoritosLb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DisciplinasLb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(ImportarFavLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImportarFavBt))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FavoritosSP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RemoverBt)
                                    .addComponent(EditarBt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(VoltarBt)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImportarFavBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarFavBtActionPerformed
        // TODO add your handling code here:
    DefaultListModel<String> listModel = new DefaultListModel<>();
        
    for(int i = 0;i< DisciplinasLt.getSelectedIndices().length;i++)
    {
        listModel.addElement(DisciplinasLt.getSelectedValuesList().get(i));
    }
    
    FavoritosLt.setModel(listModel);
     
     
     
     
     
     
     
        
        
        
        
    }//GEN-LAST:event_ImportarFavBtActionPerformed

    private void EditarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtActionPerformed
        // TODO add your handling code here:
        ControleDisciplinaView DiscView = new ControleDisciplinaView();
        if(FavoritosLt.getSelectedIndices().length>1 || FavoritosLt.getSelectedIndices().length==0)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma disciplina nos favoritos.");
        }
        else
        {
            DiscView.setVisible(true);
            DiscView.setNomeDisciplina(FavoritosLt.getSelectedValue());
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_EditarBtActionPerformed

    private void RemoverBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverBtActionPerformed
        // TODO add your handling code here:
        if(FavoritosLt.getSelectedIndices().length>1 || FavoritosLt.getSelectedIndices().length==0)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma disciplina nos favoritos.");
        }
        else
        {
            DefaultListModel<String> listModel = new DefaultListModel<>();
            for(int i = 0;i< FavoritosLt.getModel().getSize();i++)
            {
                if(!FavoritosLt.getModel().getElementAt(i).equals(FavoritosLt.getSelectedValue()))
                listModel.addElement(FavoritosLt.getModel().getElementAt(i));
            }
    
            FavoritosLt.setModel(listModel);
            
        }
    }//GEN-LAST:event_RemoverBtActionPerformed

    private void VoltarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtActionPerformed
        new HomeView().show();
        dispose();
    }//GEN-LAST:event_VoltarBtActionPerformed

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
            java.util.logging.Logger.getLogger(ControleFavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleFavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleFavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleFavoritosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleFavoritosView().setVisible(true);
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
    private javax.swing.JLabel ImportarFavLb;
    private javax.swing.JLabel InstrucoesLb;
    private javax.swing.JButton RemoverBt;
    private javax.swing.JButton VoltarBt;
    // End of variables declaration//GEN-END:variables
}