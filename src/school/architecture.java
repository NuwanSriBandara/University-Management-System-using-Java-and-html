/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author HP
 */
public class architecture extends javax.swing.JFrame {

    /**
     * Creates new form architecture
     */
    public architecture() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UID = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        username2 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Faculty of Architecture");
        setMaximumSize(new java.awt.Dimension(825, 580));
        setMinimumSize(new java.awt.Dimension(825, 580));
        setPreferredSize(new java.awt.Dimension(825, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University of Moratuwa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, 390, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faculty of Architecture");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 65, 200, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(" All Rights Reserved by UoM");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 513, 170, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Student Capacity (Undergraduates & Postgraduates)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 280, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Academic Capacity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 20));

        UID.setEditable(false);
        UID.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        UID.setText("2000");
        UID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDActionPerformed(evt);
            }
        });
        UID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UIDKeyPressed(evt);
            }
        });
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 360, -1));

        username.setEditable(false);
        username.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        username.setText("dean-archi@uom.lk");
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 360, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Email Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 120, 20));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Department of Architecture\nDepartment of Building Economics\nDepartment of Town & Country\nDepartment of Planning\nDepartment of Integrated Design");
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 360, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Hons. Degree of Bachelor of Architecture\nHons. Degree of Bachelor of Design\nHons. Degree of Bachelor of Science in Quantity Surveying\nHons. Degree of Bachelor of Science in Facilities Management\nHons. Degree of Bachelor of Science in Town & Country Planning");
        jTextArea2.setBorder(null);
        jTextArea2.setSelectionEnd(143);
        jTextArea2.setSelectionStart(143);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 360, -1));

        username2.setEditable(false);
        username2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        username2.setText("+94 11 264 0200");
        username2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username2KeyPressed(evt);
            }
        });
        getContentPane().add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 360, -1));

        username1.setEditable(false);
        username1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        username1.setText("80");
        username1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username1KeyPressed(evt);
            }
        });
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 360, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University_of_Moratuwa_logo.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Departments");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Degrees");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 275, 120, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Contact Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Faculty-of-Archetecture-University-Moratuwa -600,450  Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 126, 330, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    private void UIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UIDKeyPressed
        //
    }//GEN-LAST:event_UIDKeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameKeyPressed

    private void username1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1KeyPressed

    private void username2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_username2KeyPressed

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
            java.util.logging.Logger.getLogger(architecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(architecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(architecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(architecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new architecture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username1;
    private javax.swing.JTextField username2;
    // End of variables declaration//GEN-END:variables
}
