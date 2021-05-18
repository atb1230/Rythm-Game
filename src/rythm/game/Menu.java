/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rythm.game;

import java.awt.Frame;

/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jPanel1 = new javax.swing.JPanel();
        START = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        HIGHSCORE = new javax.swing.JButton();
        Background = new javax.swing.JLabel();
        EXIT1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        START.setBackground(new java.awt.Color(102, 0, 102));
        START.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        START.setText("START");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        jPanel1.add(START);
        START.setBounds(330, 100, 290, 53);

        EXIT.setBackground(new java.awt.Color(102, 0, 102));
        EXIT.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        EXIT.setText("EXIT");
        jPanel1.add(EXIT);
        EXIT.setBounds(330, 170, 290, 50);

        HIGHSCORE.setBackground(new java.awt.Color(102, 0, 102));
        HIGHSCORE.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        HIGHSCORE.setText("HIGHSCORE");
        HIGHSCORE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HIGHSCOREActionPerformed(evt);
            }
        });
        jPanel1.add(HIGHSCORE);
        HIGHSCORE.setBounds(330, 240, 290, 50);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\HinhdunglamBackgroundMenuGame.jpg")); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-10, -20, 1000, 580);

        EXIT1.setBackground(new java.awt.Color(102, 0, 102));
        EXIT1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        EXIT1.setText("EXIT");
        jPanel1.add(EXIT1);
        EXIT1.setBounds(330, 170, 290, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new MenuChooseMode().setVisible(true);
    }//GEN-LAST:event_STARTActionPerformed

    private void HIGHSCOREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HIGHSCOREActionPerformed
        // TODO add your handling code here:
        new HIGHSCORE().setVisible(true);
    }//GEN-LAST:event_HIGHSCOREActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton EXIT1;
    private javax.swing.JButton HIGHSCORE;
    private javax.swing.JButton START;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}