/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import Controle.ControleNotaView;
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
        ImportarFavBt = new javax.swing.JButton();
        FavoritosSP = new javax.swing.JScrollPane();
        FavoritosLt = new javax.swing.JList<>();
        EditarBt = new javax.swing.JButton();
        InstrucoesLb = new javax.swing.JLabel();
        RemoverBt = new javax.swing.JButton();
        VoltarBt = new javax.swing.JButton();
        VerMateriasBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo");

        DisciplinasLt.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas", "Administ. de Banco de Dados", "Algoritmos p/ Prob. Combinat.", "Ambiente Operacional Unix", "Compiladores", "Computação Gráfica", "Comunic. e Segurança de Dados", "Desenvolv. de Servidor Web", "Fluxos em Redes", "Fund. Repr. Conh. e Raciocínio", "Gerência de Dados em Amb. Distribuídos e Paralelos", "Gest. de Processos de Negócios", "Informática na Educação", "Inteligéncia Artificial", "Programação Linear", "Sistemas Colaborativos", "Sistemas Multimídia", "Tóp. Avançados em Algoritmos", "Tóp. Avançados em BD I", "Tóp. Avançados em BD II", "Tóp. Avançados em BD III", "Tóp. Avançados em Eng. Sw. I", "Tóp. Avançados em Eng. Sw. II", "Tóp. Avan. em Redes de Comp. I", "Tóp. Avan. em Redes de Comp. II", "Tóp. Avan. em Redes de Comp. III", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        DisciplinasLt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DisciplinasSP.setViewportView(DisciplinasLt);

        DisciplinasLb.setText("Disciplinas");
        DisciplinasLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        FavoritosLb.setText("Favoritos");
        FavoritosLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        InstrucoesLb.setText("<html> Para selecionar multiplas disciplinas <br> pressione 'ctrl' e clique.");
        InstrucoesLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        RemoverBt.setText("<<<<");
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

        VerMateriasBt.setText("VER MATERIAIS");
        VerMateriasBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerMateriasBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMateriasBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VoltarBt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DisciplinasLb)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ImportarFavBt)
                                    .addComponent(RemoverBt))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FavoritosLb)
                                .addGap(159, 193, Short.MAX_VALUE))
                            .addComponent(FavoritosSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VerMateriasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(VoltarBt)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DisciplinasLb)
                    .addComponent(FavoritosLb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ImportarFavBt)
                        .addGap(18, 18, 18)
                        .addComponent(RemoverBt))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FavoritosSP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisciplinasSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarBt)
                    .addComponent(InstrucoesLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(VerMateriasBt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ImportarFavBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarFavBtActionPerformed
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
    }//GEN-LAST:event_ImportarFavBtActionPerformed

    private void EditarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtActionPerformed
        // TODO add your handling code here:
        ControleNotaView DiscView = new ControleNotaView();
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

    }//GEN-LAST:event_RemoverBtActionPerformed

    private void VoltarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtActionPerformed
        new HomeView().show();
        dispose();
    }//GEN-LAST:event_VoltarBtActionPerformed

    private void VerMateriasBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMateriasBtActionPerformed
        ControleDisciplinaView DiscView = new ControleDisciplinaView();
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
    private javax.swing.JLabel InstrucoesLb;
    private javax.swing.JButton RemoverBt;
    private javax.swing.JButton VerMateriasBt;
    private javax.swing.JButton VoltarBt;
    // End of variables declaration//GEN-END:variables
}