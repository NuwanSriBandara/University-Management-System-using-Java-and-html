/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package school;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static school.School.M;
import static school.School.Y;
import static school.School.d;
import static school.School.h;
import static school.School.m;
import static school.School.s;

/**
 *
 * @author STUDENT10
 */

public class Welcome extends javax.swing.JFrame {
   interface Settingzerosh{
       StringBuilder ifelse(int h);
       Settingzerosh doifelseh=(int h) -> {
           StringBuilder HS=new StringBuilder(String.valueOf(h));
           if(HS.length()==1){
               HS.insert(0, "0");
               return HS;
           }else{
              return HS; 
           }
       };
}
 interface Settingzerosm{
       StringBuilder ifelse(int m);
       Settingzerosm doifelsem=(int m) -> {
           StringBuilder MS=new StringBuilder(String.valueOf(m));
           if(MS.length()==1){
               MS.insert(0, "0");
               return MS;
           }else{
              return MS; 
           }
       };
} 
 interface Settingzeross{
       StringBuilder ifelse(int s);
       Settingzeross doifelses=(int s) -> {
           StringBuilder SS=new StringBuilder(String.valueOf(s));
           if(SS.length()==1){
               SS.insert(0, "0");
               return SS;
           }else{
              return SS; 
           }
       };
}
    javax.swing.Timer t=new javax.swing.Timer(1000, new ClockListener());
    class ClockListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                Calendar now= Calendar.getInstance();
                d=now.get(Calendar.DAY_OF_MONTH);
                M=now.get(Calendar.MONTH);++M;
                Y=now.get(Calendar.YEAR);
                h=now.get(Calendar.HOUR_OF_DAY);
                m=now.get(Calendar.MINUTE);
                s=now.get(Calendar.SECOND);
                StringBuilder HS=Settingzerosh.doifelseh.ifelse(h);
                StringBuilder MS=Settingzerosm.doifelsem.ifelse(m);
                StringBuilder SS=Settingzeross.doifelses.ifelse(s);
                clock.setText(""+HS+":"+MS+":"+SS);
                date.setText(""+d+"/"+M+"/"+Y);
               
    }
    }


    /** Creates new form Welcome */
    public Welcome() {
        initComponents();
        Search.requestFocus();
        t.start();
        userphoto.setIcon(School.image1);
       USERNAME.setText(School.USERNAME);
       hrprocess();
    }
    public void hrprocess(){
        try{
            Conn.Database.getDatabaseConnection();
            PreparedStatement ps=Conn.Database.con.prepareStatement("Select * from user where uid like '%A%' and username=?" );
            ps.setString(1,USERNAME.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Salary.setEnabled(true);
            }else{
                Salary.setEnabled(false); 
            } 
            Conn.Database.disconnectDatabase();
        }catch(HeadlessException x){
               JOptionPane.showMessageDialog(this, "Error: \n"+x);
        }catch(SQLException ex){
               JOptionPane.showMessageDialog(this, "Error In SQL: \n"+ex);
        }
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        Logout11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Salary = new javax.swing.JButton();
        changeprofile1 = new javax.swing.JButton();
        changeprofile2 = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        USERNAME = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        userphoto = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Logout8 = new javax.swing.JButton();
        Logout9 = new javax.swing.JButton();
        Logout10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University-of-Moratuwa-Sumanadasa-Building.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to UoM");
        setMaximumSize(new java.awt.Dimension(1800, 1000));
        setMinimumSize(new java.awt.Dimension(1800, 1000));
        setPreferredSize(new java.awt.Dimension(1800, 1000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME TO UNIVERSITY OF MORATUWA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 95, 440, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funds - Copy.png"))); // NOI18N
        jButton2.setText("  Payments and Funds");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 320, 110));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user - Copy.png"))); // NOI18N
        jButton3.setText("  Basic Details");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 340, 260, 110));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a-test-paper - Copy.jpg"))); // NOI18N
        jButton4.setText("  Exams/CAT/Projects");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, 110));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/an-exam-paper-showing- - Copy.jpg"))); // NOI18N
        jButton5.setText("  On-going Marks");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, -1, 110));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/extra curricular - Copy.png"))); // NOI18N
        jButton6.setText("  Extra-Curricular Activities");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 360, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("The Leading Technological University in Sri Lanka");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 135, 390, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/code of conduct - Copy.png"))); // NOI18N
        jButton7.setText("  Code of Conduct");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 290, 110));

        Logout1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Logout1.setForeground(new java.awt.Color(51, 51, 255));
        Logout1.setText("Logout");
        Logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 800, 120, 40));

        Logout11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Logout11.setForeground(new java.awt.Color(51, 51, 255));
        Logout11.setText("Search");
        Logout11.setBorder(null);
        Logout11.setBorderPainted(false);
        Logout11.setContentAreaFilled(false);
        Logout11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout11ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 147, 70, 25));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maps new - Copy.png"))); // NOI18N
        jButton1.setText("  Find your way at UoM");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, 280, 55));

        Salary.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payments - Copy.png"))); // NOI18N
        Salary.setText("Salary Details");
        Salary.setBorderPainted(false);
        Salary.setContentAreaFilled(false);
        Salary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });
        getContentPane().add(Salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 280, 55));

        changeprofile1.setBorderPainted(false);
        changeprofile1.setContentAreaFilled(false);
        changeprofile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeprofile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeprofile1ActionPerformed(evt);
            }
        });
        getContentPane().add(changeprofile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 190, 150));

        changeprofile2.setBorderPainted(false);
        changeprofile2.setContentAreaFilled(false);
        changeprofile2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeprofile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeprofile2ActionPerformed(evt);
            }
        });
        getContentPane().add(changeprofile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 120, 30));

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 147, 250, 25));

        USERNAME.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        USERNAME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USERNAME.setText("Username");
        getContentPane().add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 120, 30));

        clock.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        clock.setText("00:00:00");
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 900, 60, -1));

        date.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        date.setText("Date");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 920, 80, -1));

        userphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-Male-Light-icon.png"))); // NOI18N
        getContentPane().add(userphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 190, 150));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/moratuwa.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 560, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University_of_Moratuwa.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 5, -1, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/University-of-Moratuwa-Sumanadasa-Building.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText(" All Rights Reserved by UoM");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Department-of-Civil-Engineering-University-Moratuwa.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 760, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Faculty-of-Archetecture-University-Moratuwa.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slide.jpg"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Faculty-of-Information-Technology-Moratuwa.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main-qimg-dd602caa9144af945bffd527b79f63dd.gif"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, -40, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, -50, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, -40, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Blue Pastels.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, -40, -1, -1));

        Logout8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Logout8.setForeground(new java.awt.Color(51, 51, 51));
        Logout8.setText("Add");
        Logout8.setBorder(null);
        Logout8.setBorderPainted(false);
        Logout8.setContentAreaFilled(false);
        Logout8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout8.setEnabled(false);
        Logout8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout8ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2320, 580, 120, 30));

        Logout9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Logout9.setForeground(new java.awt.Color(51, 51, 51));
        Logout9.setText("Update");
        Logout9.setBorder(null);
        Logout9.setBorderPainted(false);
        Logout9.setContentAreaFilled(false);
        Logout9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout9.setEnabled(false);
        Logout9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout9ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2320, 620, 120, 30));

        Logout10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        Logout10.setForeground(new java.awt.Color(51, 51, 51));
        Logout10.setText("Delete");
        Logout10.setBorder(null);
        Logout10.setBorderPainted(false);
        Logout10.setContentAreaFilled(false);
        Logout10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout10.setEnabled(false);
        Logout10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout10ActionPerformed(evt);
            }
        });
        getContentPane().add(Logout10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2320, 660, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sumanadasa-bridge1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 540, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/elg0p.jpg"))); // NOI18N
        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        Basics b=new Basics();
       b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Exams e=new Exams();
        e.setVisible(true);
        e.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
        Marks m=new Marks();
        
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Extra et=new Extra();
        et.setVisible(true);
        et.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Rules r=new Rules();

        r.setVisible(true);
        r.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Funds d=new Funds();

       d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        int option=JOptionPane.showConfirmDialog(this, "Are you sure to log out? ","Confirm your Decision ",JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==JOptionPane.YES_OPTION){
        Login log=new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Logout1ActionPerformed
    }
    private void Logout11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout11ActionPerformed
        try{
            Conn.Database.getDatabaseConnection();
            PreparedStatement ps=Conn.Database.con.prepareStatement("Select * from user where username like '%"+Search.getText()+"%' or fullname like '%"+Search.getText()+"%' or uid like '%"+Search.getText()+"%' " );
            ResultSet rs=ps.executeQuery();
            
            Conn.Database.disconnectDatabase();
        }catch(HeadlessException x){
               JOptionPane.showMessageDialog(this, "Error: \n"+x);
        }catch(SQLException ex){
               JOptionPane.showMessageDialog(this, "Error In SQL: \n"+ex);
        }
    }//GEN-LAST:event_Logout11ActionPerformed

    private void Logout8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Logout8ActionPerformed

    private void Logout9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Logout9ActionPerformed

    private void Logout10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Logout10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       Map m=new Map();

       m.setVisible(true);
       m.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
      Salary s=new Salary();
      s.setVisible(true);
      s.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_SalaryActionPerformed

    private void changeprofile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeprofile1ActionPerformed
       Changeprofileframe c=new Changeprofileframe();
       c.setVisible(true);
       c.setLocationRelativeTo(null);
    }//GEN-LAST:event_changeprofile1ActionPerformed

    private void changeprofile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeprofile2ActionPerformed
       Changeprofileframe c=new Changeprofileframe();
       c.setVisible(true);
       c.setLocationRelativeTo(null);
    }//GEN-LAST:event_changeprofile2ActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           try{
            Conn.Database.getDatabaseConnection();
            PreparedStatement ps=Conn.Database.con.prepareStatement("Select * from user where username like '%"+Search.getText()+"%' or fullname like '%"+Search.getText()+"%' or uid like '%"+Search.getText()+"%' " );
            ResultSet rs=ps.executeQuery();
            
            Conn.Database.disconnectDatabase();
        }catch(HeadlessException x){
               JOptionPane.showMessageDialog(this, "Error: \n"+x);
        }catch(SQLException ex){
               JOptionPane.showMessageDialog(this, "Error In SQL: \n"+ex);
        }
       }
    }//GEN-LAST:event_SearchKeyPressed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout1;
    private javax.swing.JButton Logout10;
    private javax.swing.JButton Logout11;
    private javax.swing.JButton Logout8;
    private javax.swing.JButton Logout9;
    private javax.swing.JButton Salary;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JButton changeprofile1;
    private javax.swing.JButton changeprofile2;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel userphoto;
    // End of variables declaration//GEN-END:variables

}
