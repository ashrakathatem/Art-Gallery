/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import static art.gallery.form0.s;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class form8 extends javax.swing.JFrame {
ArtGallery  artgallery;
    /**
     * Creates new form form8
     */
    public form8() {
        
        initComponents();
          this.setLocationRelativeTo(null);
         load table_Load = new load();
        try {
            table_Load.load_customer();
        } catch (IOException ex) {
            Logger.getLogger(form7.class.getName()).log(Level.SEVERE, null, ex);
        }
        Customer C;
        DefaultTableModel model1 = (DefaultTableModel)jTable2.getModel();
    for (String key : table_Load.custmer.keySet()) {
   Customer c = table_Load.custmer.get(key);
   model1.addRow(new Object[]{c.Name,c.getAddress(),c.getTotal_price()});
        
        
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel9.setBackground(new java.awt.Color(247, 247, 199));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(123, 80, 38));
        jLabel9.setText("Customer Information");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 20, 420, 46);

        jTable2.setBackground(new java.awt.Color(247, 247, 199));
        jTable2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jTable2.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(123, 80, 38));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Balance"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(247, 247, 199));
        jTable2.setSelectionBackground(new java.awt.Color(247, 247, 199));
        jTable2.setSelectionForeground(new java.awt.Color(123, 80, 38));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 80, 550, 330);

        jButton4.setBackground(new java.awt.Color(123, 80, 38));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButton4.setForeground(new java.awt.Color(247, 247, 199));
        jButton4.setText("Return Back");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(247, 247, 199), new java.awt.Color(247, 247, 199)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(630, 430, 180, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/left-arrow.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(590, 430, 40, 50);

        jButton6.setBackground(new java.awt.Color(123, 80, 38));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/volume-off-indicator 32.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 10, 40, 40);

        jButton7.setBackground(new java.awt.Color(123, 80, 38));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/audio-speaker-on.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(60, 10, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/038_003_Nacionalna_hudojestvena_galeria.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        form5 f5=new form5();
        f5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          s.Pflag=false;
        s.pause();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           s.Cflag=false;
        s.play();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         try {
        artgallery.loading.add_Artwork(artgallery.loading);
        artgallery.loading.write_Customer(artgallery.loading);
    } catch (IOException ex) {
        Logger.getLogger(form10.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
