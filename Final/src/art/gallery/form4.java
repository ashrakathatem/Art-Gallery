/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import static art.gallery.form0.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class form4 extends javax.swing.JFrame {
ArtGallery artgallery;
static int count =1;
    /**
     * Creates new form form4
     */
    public form4() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 110, 340, 32);

        jLabel9.setBackground(new java.awt.Color(247, 247, 199));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(123, 80, 38));
        jLabel9.setText("Art Work Details");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 10, 320, 46);

        jLabel10.setBackground(new java.awt.Color(247, 247, 199));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(123, 80, 38));
        jLabel10.setText("Title Of Art");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 70, 140, 30);

        jLabel11.setBackground(new java.awt.Color(247, 247, 199));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(123, 80, 38));
        jLabel11.setText("Price");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 110, 70, 30);

        jLabel12.setBackground(new java.awt.Color(247, 247, 199));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(123, 80, 38));
        jLabel12.setText("Year");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 150, 70, 33);

        jLabel13.setBackground(new java.awt.Color(247, 247, 199));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(123, 80, 38));
        jLabel13.setText("Artist Name");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 200, 150, 30);

        jLabel14.setBackground(new java.awt.Color(247, 247, 199));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(123, 80, 38));
        jLabel14.setText("Birth Place");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 250, 130, 30);

        jLabel6.setBackground(new java.awt.Color(247, 247, 199));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 80, 38));
        jLabel6.setText("Age");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 300, 60, 30);

        jLabel7.setBackground(new java.awt.Color(247, 247, 199));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 80, 38));
        jLabel7.setText("Description ");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 450, 140, 30);

        jButton2.setBackground(new java.awt.Color(123, 80, 38));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButton2.setForeground(new java.awt.Color(247, 247, 199));
        jButton2.setText("Add Art Work");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(247, 247, 199), new java.awt.Color(247, 247, 199)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 340, 200, 50);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 150, 340, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/check-mark.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 340, 40, 50);

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
        jButton4.setBounds(620, 410, 200, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/left-arrow.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 410, 40, 50);

        jLabel16.setBackground(new java.awt.Color(247, 247, 199));
        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(123, 80, 38));
        jLabel16.setText("Categorey");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 350, 130, 30);

        jLabel17.setBackground(new java.awt.Color(247, 247, 199));
        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 3, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(123, 80, 38));
        jLabel17.setText("Art Work Path");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(123, 80, 38), new java.awt.Color(123, 80, 38)));
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 400, 170, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 200, 340, 32);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 250, 340, 32);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 300, 340, 32);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(190, 70, 340, 32);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(190, 400, 340, 32);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(190, 450, 340, 32);

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

        jComboBox1.setBackground(new java.awt.Color(247, 247, 199));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(123, 80, 38));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "19thcentury", "American_Realism", "pantings", "Statues" }));
        jComboBox1.setAlignmentX(1.0F);
        jComboBox1.setAlignmentY(1.0F);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 350, 340, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/038_003_Nacionalna_hudojestvena_galeria.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(4000, 6000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 2000));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        form4 f =new form4();
       try{
        if (jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("")  ||jTextField3.getText().equals("") || jTextField10.getText().equals("") || jTextField2.getText().equals("")  || jTextField9.getText().equals("") ||jTextField8.getText().equals("") ){
          JOptionPane.showMessageDialog(f, "Please complete the Artwork info. ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if(Integer.valueOf(jTextField2.getText())<0){
            JOptionPane.showMessageDialog(null, "You Can't Add A Negitive Value ", "ERROR", JOptionPane.ERROR_MESSAGE);
            jTextField2.setText("");
        }
        else if(count!=0){
             Artist artist =new Artist(jTextField4.getText(), jTextField5.getText(), Integer.valueOf(jTextField6.getText()), jComboBox1.getSelectedItem().toString());
            Artwork art =new Artwork(artist, Integer.valueOf(jTextField3.getText()), jTextField10.getText(), Double.valueOf(jTextField2.getText()), jTextField9.getText(),0,0,1);
       
        boolean exist=false;
              owner Owner = new owner ();
            try {
                exist=Owner.Adding_Artwork(artgallery.loading, art);
            } catch (IOException ex) {
                Logger.getLogger(form4.class.getName()).log(Level.SEVERE, null, ex);
            }
              if (exist==true)
              JOptionPane.showMessageDialog(f, "Sorry you can't add this Artwork the title already exists ", "ERROR", JOptionPane.ERROR_MESSAGE);
              else {
              JOptionPane.showMessageDialog(f, "The Artwork has been added  ", "Succeeded", JOptionPane.INFORMATION_MESSAGE);
                artgallery.loading.ArtWork.put(art.getTitle(), art);
                if (jComboBox1.getSelectedItem().toString().equals("19thcentury"))
                        {     form16 f1 =new form16(jTextField8.getText(),jTextField10.getText());}
                   
                else if ((jComboBox1.getSelectedItem().toString().equals("American_Realism")))
                { form18  American_Realism =new form18(jTextField8.getText(),jTextField10.getText());}
                    else if ((jComboBox1.getSelectedItem().toString().equals("pantings")))
                    {   form17  pantings=new form17(jTextField8.getText(),jTextField10.getText());}
                    else   
                    {   form19  status =new form19(jTextField8.getText(),jTextField10.getText());}
                    form13 all =new form13(jTextField8.getText(),jTextField10.getText());
                   
                count-=1;
                jTextField4.setText(null);
               jTextField5.setText(null);
               jTextField6.setText(null);
               jTextField3.setText(null);
               jTextField10.setText(null);
               jTextField2.setText(null);
               jTextField9.setText(null);
               jTextField8.setText(null);
        
              }}
              else {   
                                  JOptionPane.showMessageDialog(null,"you can't add more artwork no space in the application ","ERROR",JOptionPane.ERROR_MESSAGE);

                      }
       }  
         catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"You must enter numbers in Price ,Age ,Year ","ERROR",JOptionPane.ERROR_MESSAGE);
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField6.setText("");
        }
       
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        form5 f5 = new form5();
        f5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6MouseClicked

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
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}