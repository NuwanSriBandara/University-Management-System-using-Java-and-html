/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    int Loginattempts=0;
    static int interval;
    static Timer timer;
    public Login() {
        initComponents();
        stopwatch();
        School.USERNAME=userName.getText();
    }   
     public void stopwatch(){   
        int delay =1000;
        int period =1000;
        timer=new Timer();
        interval= 300;
        timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            setInterval();
        }
    }, delay, period);
    }
public int setInterval() {
    if (interval == 1){
        timer.cancel();
        System.exit(0);
    }
    return --interval;
        
}

public static BufferedImage linearResizeBi(BufferedImage origin, int width, int height) {
       BufferedImage resizedImage = new BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        float xScale = (float)width / origin.getWidth();
        float yScale = (float)height / origin.getHeight();
        AffineTransform at = AffineTransform.getScaleInstance(xScale,yScale);
        g.drawRenderedImage(origin,at);
        g.dispose();
        return resizedImage;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        loginButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        loginButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        forgetpassword = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userphoto = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Login");
        setMaximumSize(new java.awt.Dimension(545, 475));
        setMinimumSize(new java.awt.Dimension(545, 475));
        setPreferredSize(new java.awt.Dimension(545, 475));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("   Username  ");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        title1.setBackground(new java.awt.Color(0, 255, 255));
        title1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 51, 51));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("     Password     ");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 30));

        userName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 30));

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        loginButton.setText("Exit");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 70, 30));

        loginButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        loginButton1.setText("Register Now");
        loginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, 30));

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 190, 30));

        loginButton2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        loginButton2.setText("Login");
        loginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University of Moratuwa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 250, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("If you are an affiliate to UoM and Don't have an account Yet?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 360, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));

        forgetpassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forgetpassword.setText("Forgot password ?");
        forgetpassword.setBorderPainted(false);
        forgetpassword.setContentAreaFilled(false);
        forgetpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetpassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgetpassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        forgetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 170, 140, 15));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University-of-Moratuwa-Sumanadasa-Building.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(655, 450));
        jLabel4.setMinimumSize(new java.awt.Dimension(655, 450));
        jLabel4.setPreferredSize(new java.awt.Dimension(655, 450));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, -1, 450));
        getContentPane().add(userphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 286, 120, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
    //JOptionPane.showMessageDialog(this, "Completion of all spaces with valid information is required in order for a successful Registration ! ");
    Registration r=new Registration();
    r.setVisible(true);
    r.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      int option=JOptionPane.showConfirmDialog(this, "Do you really want to exit and close the all tabs?     ","Confirm your Decision",JOptionPane.YES_NO_CANCEL_OPTION);
      if(option==JOptionPane.YES_OPTION){
          System.exit(0);
      }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
    if(userName.getText().isEmpty() || password.getText().isEmpty()){
    JOptionPane.showMessageDialog(this,"Entered UserName or Password is Empty, Check and Try again ! ");
    ++Loginattempts;
    if(Loginattempts>=5){
        System.exit(0);
    }
    }else{
       
           try{
           Conn.Database.getDatabaseConnection();
           PreparedStatement ps = Conn.Database.con.prepareStatement("Select UserID, FullName from user where UserName=? AND Password=binary ?");
           ps.setString(1,userName.getText());
           ps.setString(2,password.getText());
           
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
               //JOptionPane.showMessageDialog(this,"Login Success");
           timer.cancel();
           if("admin".equals(userName.getText())){
               adminLogin a=new adminLogin();
               a.setVisible(true);
               a.setLocationRelativeTo(null);
               this.dispose();
           }else{
           PreparedStatement ps1=Conn.Database.con.prepareStatement("Select photo from user where username=?");
           ps1.setString(1, userName.getText());
           ResultSet rs1=ps1.executeQuery(); 
           if(rs1.next()){
               try {
                   BufferedImage im = ImageIO.read(rs1.getBinaryStream(1));
                   im =linearResizeBi(im, 150, 150);
                   School.image1 = new ImageIcon(im);
                   userphoto.setIcon(School.image1);
         
                   Welcome w=new Welcome();
                   w.setVisible(true);
                   w.setLocationRelativeTo(null);
                   this.dispose();
               } catch (IOException fx) {
                   JOptionPane.showMessageDialog(this,"Error In IOException: \n"+fx);
               }
           }else{
               JOptionPane.showMessageDialog(this,"Please refresh the application or exit for a while !  ");
           }
           }
           }
           else{
               JOptionPane.showMessageDialog(this,"        Invalid Login  \n Check and Try Again ! ");
               ++Loginattempts;
               if(Loginattempts>=5){
                   System.exit(0);
               }
           }
           Conn.Database.disconnectDatabase();
           }catch(HeadlessException x){
           JOptionPane.showMessageDialog(this,"Error:\n"+x);
           }catch(SQLException ex){
           JOptionPane.showMessageDialog(this,"Error In SQL: \n"+ex);
           }
       
}
    }//GEN-LAST:event_loginButton2ActionPerformed

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER || evt.getKeyCode()==KeyEvent.VK_DOWN){
          if(userName.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Entered Username is Empty, Check and Try again ! ");}
          else{
              password.requestFocus();
          }
    }//GEN-LAST:event_userNameKeyPressed
    }
    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
            if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(userName.getText().isEmpty() || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Entered Username or Password is Empty, Check and Try again ! ");
            ++Loginattempts;
              if(Loginattempts>=5){
              System.exit(0);
              }
            }else{
                School.USERNAME=userName.getText();
                
           try{
           Conn.Database.getDatabaseConnection();
           PreparedStatement ps = Conn.Database.con.prepareStatement("Select UserID, FullName from user where UserName=? AND Password=binary ?");
           ps.setString(1,userName.getText());
           ps.setString(2,password.getText());
           
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
               //JOptionPane.showMessageDialog(this,"Login Success !    ");
           timer.cancel();
           if("admin".equals(userName.getText())){
               adminLogin a=new adminLogin();
               a.setVisible(true);
               a.setLocationRelativeTo(null);
               this.dispose();
           }else{
            PreparedStatement ps1=Conn.Database.con.prepareStatement("Select photo from user where username=?");
           ps1.setString(1, userName.getText());
           ResultSet rs1=ps1.executeQuery(); 
           if(rs1.next()){
               try {
                   BufferedImage im = ImageIO.read(rs1.getBinaryStream(1));
                   im =linearResizeBi(im, 150, 150);
                   School.image1 = new ImageIcon(im);
                   userphoto.setIcon(School.image1);
         
                   Welcome w=new Welcome();
                   w.setVisible(true);
                   w.setLocationRelativeTo(null);
                   this.dispose();
               } catch (IOException fx) {
                   JOptionPane.showMessageDialog(this,"Error In IOException: \n"+fx);
               }
           }else{
               JOptionPane.showMessageDialog(this,"Please refresh the application or exit for a while !  ");
           }
           }
           }
           else{
               JOptionPane.showMessageDialog(this,"        Invalid Login  \n Check and Try Again ! ");
               ++Loginattempts;
               if(Loginattempts>=5){
                   System.exit(0);
               }
           }
           Conn.Database.disconnectDatabase();
           }catch(HeadlessException x){
           JOptionPane.showMessageDialog(this,"Error:\n"+x);
           }catch(SQLException ex){
           JOptionPane.showMessageDialog(this,"Error In SQL: \n"+ex);
           }
       }
            }
        
    }//GEN-LAST:event_passwordKeyPressed

    private void forgetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetpasswordActionPerformed
       lastnophone l=new lastnophone();
       l.setVisible(true);
       l.setLocationRelativeTo(null);
    }//GEN-LAST:event_forgetpasswordActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgetpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JButton loginButton2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userphoto;
    // End of variables declaration//GEN-END:variables

   
}
