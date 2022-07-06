/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
public class Workers extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow=0;

    public Workers() {
        initComponents();
        DoConnect();
        setTitle("Employee Management System");
        
    }
    public void DoConnect( ) {
         try {
             ImageIcon nx = new ImageIcon("k.png");
             ImageIcon pr= new ImageIcon("B.png");
             ImageIcon f= new ImageIcon("f.png");
           ImageIcon l= new ImageIcon("ee.png");
          ImageIcon up= new ImageIcon("u.png");
             ImageIcon ne= new ImageIcon("new.png");
            ImageIcon del= new ImageIcon("d.png");
          // ImageIcon sav= new ImageIcon("sav.png");
          //ImageIcon can= new ImageIcon("can.png");
            
             
             btnNext.setIcon(nx);
             btnPrevious.setIcon(pr);
             btnFirst.setIcon(f);
             btnLast.setIcon(l);
             
             btnUpdateRecord.setIcon(up);
             btnNewRecord.setIcon(ne);
             btnDeleteRecord.setIcon(del);
           // btnSaveRecord.setIcon(sav);
           // btnCancelNewRecord.setIcon(can);
             
        String host ="jdbc:derby://localhost:1527/Employees";
        String  uName = "admi";
         String uPass= "admi";
         con =DriverManager.getConnection(host ,uName,uPass);
         stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String sql= "Select * from WORKERS";
         rs=stmt.executeQuery(sql);
         
          rs.next();
         int id_col = rs.getInt("ID");
         String id =Integer.toString(id_col);
                 String first = rs.getString("First_Name");
                 String last = rs.getString("Last_Name");
                 String job = rs.getString("Job_Title");
                 textID.setText(id);
                 textFirstName.setText(first);
                textLastName.setText(last);
                 textJobTitle.setText(job);
    }
    catch( SQLException err) {
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
    

        
        
        
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        textID = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textJobTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnUpdateRecord = new javax.swing.JButton();
        btnNewRecord = new javax.swing.JButton();
        btnDeleteRecord = new javax.swing.JButton();
        btnSaveRecord = new javax.swing.JButton();
        btnCancelNewRecord = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        textLastName = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setName("Employee Mnagement System"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });
        jPanel1.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 30));

        textFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(textFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, 30));
        jPanel1.add(textJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 102, 30));

        jLabel1.setText("Job Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 58, -1));

        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 70, -1));

        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 20));

        jLabel4.setText("   ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 25, 58, 25));

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        btnUpdateRecord.setBackground(new java.awt.Color(0, 204, 255));
        btnUpdateRecord.setText("Update Record");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btnNewRecord.setBackground(new java.awt.Color(204, 255, 255));
        btnNewRecord.setText("New Record");
        btnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        btnDeleteRecord.setBackground(new java.awt.Color(153, 153, 255));
        btnDeleteRecord.setText("Delete Record");
        btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        btnSaveRecord.setText("Save New Record");
        btnSaveRecord.setEnabled(false);
        btnSaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        btnCancelNewRecord.setText("Cancel New Record");
        btnCancelNewRecord.setEnabled(false);
        btnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelNewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel1.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        textLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 102, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Employee management system");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFirstNameActionPerformed

    private void textLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLastNameActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      try{
        if (rs.next()){
            int id_col=rs.getInt("ID");
            String id =Integer.toString(id_col);
            String first=rs.getString("First_Name");
            String last=rs.getString("Last_Name");
            String job=rs.getString("Job_Title");
            
            textID.setText(id);
            textFirstName.setText(first);
            textLastName.setText(last);
            textJobTitle.setText(job);
        }
        else {
            rs.previous();
            JOptionPane.showMessageDialog(Workers.this, "End of File");
        }
    }   
    catch(SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
      // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
try{
        if (rs.previous()){
            int id_col=rs.getInt("ID");
            String id =Integer.toString(id_col);
            String first=rs.getString("First_Name");
            String last=rs.getString("Last_Name");
            String job=rs.getString("Job_Title");
            
            textID.setText(id);
            textFirstName.setText(first);
            textLastName.setText(last);
            textJobTitle.setText(job);
        }
        else {
            rs.next();
            JOptionPane.showMessageDialog(Workers.this, "Start of File");
        }
    }   
    catch(SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
try{
        rs.last();
            int id_col=rs.getInt("ID");
            String id =Integer.toString(id_col);
            String first=rs.getString("First_Name");
            String last=rs.getString("Last_Name");
            String job=rs.getString("Job_Title");
            
            textID.setText(id);
            textFirstName.setText(first);
            textLastName.setText(last);
            textJobTitle.setText(job);
        
    }   
    catch(SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
     try{
         rs.first();
            int id_col=rs.getInt("ID");
            String id =Integer.toString(id_col);
            String first=rs.getString("First_Name");
            String last=rs.getString("Last_Name");
            String job=rs.getString("Job_Title");
            
            textID.setText(id);
            textFirstName.setText(first);
            textLastName.setText(last);
            textJobTitle.setText(job);
        
        
    }   
    catch(SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
       // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
       
            String first=textFirstName.getText();
            String last=textLastName.getText();
            String job=textJobTitle.getText();
            String ID =textID.getText();
            
            int newID=Integer.parseInt(ID);
             // TODO add your handling code here:
            
            try{
                rs.updateInt("ID",newID);
                rs.updateString("First_Name",first);
                rs.updateString("Last_Name",last);
                rs.updateString("Job_Title",job);
                rs.updateRow();
                JOptionPane.showMessageDialog(Workers.this, "Updated Succesfully"); 
            }
            catch (SQLException err){
                System.out.println(err.getMessage());
            }
             
    }//GEN-LAST:event_btnUpdateRecordActionPerformed

    private void btnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecordActionPerformed
     try{
          curRow =rs.getRow();
          
          textFirstName.setText("");
          textLastName.setText("");
          textJobTitle.setText("");
          textID.setText("");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnUpdateRecord.setEnabled(false);
        btnDeleteRecord.setEnabled(false);
        btnNewRecord.setEnabled(false);
        btnSaveRecord.setEnabled(true);
        btnCancelNewRecord.setEnabled(true);
     }
     catch(SQLException err){
         System.out.println(err.getMessage());
      }
     
     
    }//GEN-LAST:event_btnNewRecordActionPerformed

    private void btnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewRecordActionPerformed
      try{
          rs.absolute(curRow);
          
          textFirstName.setText(rs.getString("First_Name"));
          textLastName.setText(rs.getString("Last_Name"));
          textJobTitle.setText(rs.getString("Job_Title"));
          textID.setText(Integer.toString(rs.getInt("ID")));
          
          
      
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
        btnUpdateRecord.setEnabled(true);
        btnDeleteRecord.setEnabled(true);
        btnNewRecord.setEnabled(true);
        btnSaveRecord.setEnabled(false);
        btnCancelNewRecord.setEnabled(false);  
      }
      catch(SQLException err){
         System.out.println(err.getMessage());
      }
      
    }//GEN-LAST:event_btnCancelNewRecordActionPerformed

    private void btnSaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRecordActionPerformed
            String first=textFirstName.getText();
            String last=textLastName.getText();
           String job=textJobTitle.getText();
            String ID =textID.getText();
            int newID=Integer.parseInt(ID);
             
             
        try{
            rs.moveToInsertRow();
                rs.updateInt("ID",newID);
                rs.updateString("First_Name",first);
                rs.updateString("Last_Name",last);
                rs.updateString("Job_Title",job);
               
                rs.insertRow();
                
                
                rs.close();
                stmt.close();
               stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String sql= "Select * from WORKERS";
         rs=stmt.executeQuery(sql);
         
          rs.next();
         int id_col = rs.getInt("ID");
         String id =Integer.toString(id_col);
                 String first2 = rs.getString("First_Name");
                 String last2 = rs.getString("Last_Name");
                 String job2 = rs.getString("Job_Title");
                 textID.setText(id);
                 textFirstName.setText(first2);
                textLastName.setText(last2);
                 textJobTitle.setText(job2);
                
        
        btnFirst.setEnabled(true);
        btnPrevious.setEnabled(true);
        btnNext.setEnabled(true);
        btnLast.setEnabled(true);
        btnUpdateRecord.setEnabled(true);
        btnDeleteRecord.setEnabled(true);
        btnNewRecord.setEnabled(true);
        btnSaveRecord.setEnabled(false);
        btnCancelNewRecord.setEnabled(false);  
        JOptionPane.showMessageDialog(null,"record Added Successfully");
      }
      catch(SQLException err){
         System.out.println(err.getMessage());
      }
    }//GEN-LAST:event_btnSaveRecordActionPerformed

    private void btnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecordActionPerformed
    try{
        rs.deleteRow();
        stmt.close();
        rs.close();
        
        
        Statement  stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String sql= "Select * from WORKERS";
         rs=stmt.executeQuery(sql);
         
          rs.next();
         int id_col = rs.getInt("ID");
         String id =Integer.toString(id_col);
                 String first = rs.getString("First_Name");
                 String last = rs.getString("Last_Name");
                 String job = rs.getString("Job_Title");
                 textID.setText(id);
                 textFirstName.setText(first);
                textLastName.setText(last);
                 textJobTitle.setText(job);
                 
                 JOptionPane.showMessageDialog(null,"record deleted");
    }
    catch(SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
    
    }//GEN-LAST:event_btnDeleteRecordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        JFrame logIn=new JFrame();
        logIn.setSize(400,400);
        JLabel pass,user;
        user = new JLabel("Username");
        pass = new JLabel("password");
        user.setBounds(100, 100, 70, 35);
        pass.setBounds(100,160,70,35);
       
        
        logIn.setTitle("login form");
        logIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField userName=new JTextField(20);
        JPasswordField password=new JPasswordField(20);
        userName.setBounds(180,100,110,30);
        password.setBounds(180,160,110,30);
    
        
        JButton enter=new JButton("log in");
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                if(userName.getText().equals("admi") && password.getText().equals("admi")){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new Workers().setVisible(true);
                        }
                        
            
            });
                    logIn.setVisible(false);
                }
                else
                    JOptionPane.showMessageDialog(null,"The username or password is incorrect");
                
            }
        });
        
        
        
//        JLabel uName=new JLabel("Enter user Name");
//        JLabel pass=new JLabel("Enter your password");
        
        JPanel panel=new JPanel();

        enter.setBounds(180,230,80,40);
        panel.add(userName);
        panel.add(password);
        panel.add(enter);
        panel.add(user);
        panel.add(pass);
        panel.setLayout(null);
        logIn.add(panel);
//        logIn.pack();
        logIn.setVisible(true);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNewRecord;
    private javax.swing.JButton btnDeleteRecord;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveRecord;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJobTitle;
    private javax.swing.JTextField textLastName;
    // End of variables declaration//GEN-END:variables
}
