/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FluxoTelasController;
import View.FavoritosView;

/**
 *
 * @author Leonardo
 */
public class NotaView extends javax.swing.JFrame {

    /**
     * Creates new form ControleDisciplinaView
     */
    public NotaView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DisciplinaLb = new javax.swing.JLabel();
        VoltarBt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        NotasTb = new javax.swing.JTable();
        SalvarNotaBt = new javax.swing.JButton();
        ExcluirNotaBt = new javax.swing.JButton();
        EditarNotaBt = new javax.swing.JButton();
        NovaNotaBt = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto Certo");

        DisciplinaLb.setText("\" X\"");
        DisciplinaLb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        VoltarBt.setText("Voltar");
        VoltarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtActionPerformed(evt);
            }
        });

        NotasTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nota", "Peso", "Nota Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(NotasTb);

        SalvarNotaBt.setText("Salvar");
        SalvarNotaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalvarNotaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarNotaBtActionPerformed(evt);
            }
        });

        ExcluirNotaBt.setText("Excluir");
        ExcluirNotaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        EditarNotaBt.setText("Editar");
        EditarNotaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NovaNotaBt.setText("Nova");
        NovaNotaBt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NovaNotaBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaNotaBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DisciplinaLb)
                            .addComponent(VoltarBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SalvarNotaBt)
                        .addGap(18, 18, 18)
                        .addComponent(ExcluirNotaBt)
                        .addGap(18, 18, 18)
                        .addComponent(EditarNotaBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NovaNotaBt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisciplinaLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarNotaBt)
                    .addComponent(ExcluirNotaBt)
                    .addComponent(EditarNotaBt)
                    .addComponent(NovaNotaBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(VoltarBt)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtActionPerformed
        //new FavoritosView().show();
        FluxoTelasController.cfv.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarBtActionPerformed

    private void NovaNotaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaNotaBtActionPerformed
       
    }//GEN-LAST:event_NovaNotaBtActionPerformed

    private void SalvarNotaBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarNotaBtActionPerformed
        NotasTb.selectAll();   
        int line = NotasTb.getSelectedRow();     
        
                
        
        
        
        //double media = (double) NotasTb.getModel().getValueAt(line, 1) * (double) (NotasTb.getModel().getValueAt(line, 2))/10;
        //NotasTb.setValueAt(media, line, 3);
        
        
        
        
    }//GEN-LAST:event_SalvarNotaBtActionPerformed

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
            java.util.logging.Logger.getLogger(NotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaView().setVisible(true);
            }
        });
    }
    
    public void setNomeDisciplina(String nome)
    {
        DisciplinaLb.setText(nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisciplinaLb;
    private javax.swing.JButton EditarNotaBt;
    private javax.swing.JButton ExcluirNotaBt;
    private javax.swing.JTable NotasTb;
    private javax.swing.JButton NovaNotaBt;
    private javax.swing.JButton SalvarNotaBt;
    private javax.swing.JButton VoltarBt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}