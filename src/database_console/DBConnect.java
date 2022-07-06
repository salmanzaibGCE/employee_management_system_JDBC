/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class DBConnect extends JFrame{
    JButton button;
    JTextField id,fName,lName,jobTitle;
    JPanel panel;
    
    String host;
    String uName;
    String uPass;
    ResultSet rs;
    
    void DoConnect(){
    try {
         host ="jdbc:derby://localhost:1527/imsciencespeshawar";
         uName = "ashiyan";
         uPass= "ashiyan123";
         Connection con =DriverManager.getConnection(host ,uName,uPass);
         
         Statement stmnt=con.createStatement();
         
         String sql= "Select * from WORKER";
         
         rs=stmnt.executeQuery(sql);
    }
    catch( SQLException err) {
        System.out.print (err.getMessage ());
     }
    }
    
    DBConnect(){
        setTitle("data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel();
        DoConnect();
        add(panel);
        pack();
        setVisible(true);
    }
    void panel(){
        button=new JButton("next");
        button.addActionListener(new Fire());
        id=new JTextField(19);
        fName=new JTextField(10);
        lName=new JTextField(10);
        jobTitle=new JTextField(10);
        
        panel=new JPanel();
        panel.add(id);
        panel.add(fName);
        panel.add(lName);
        panel.add(jobTitle);
        panel.add(button);
    }
    
    private class Fire implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
            if(rs.next()){
             
                 int id_col = rs.getInt("ID");
                 String first_name = rs.getString("First_NAME");
                 String last_name = rs.getString("Last_NAME");
                 String job = rs.getString("Job_TITLE");
                 id.setText(""+id_col);
                 fName.setText(first_name);
                 lName.setText(last_name);
                 jobTitle.setText(job);
                 
                 //System.out.println( id_col + "" + first_name + " " + last_name + " " + job );
                 }
        }
        catch( SQLException err) {
        System.out.print (err.getMessage ());
        }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DBConnect();
     try {
         String host ="jdbc:derby://localhost:1527/imsciencespeshawar";
         String uName = "ashiyan";
         String uPass= "ashiyan123";
         Connection con =DriverManager.getConnection(host ,uName,uPass);
         Statement stmnt=con.createStatement();
         String sql= "Select * from WORKER";
         ResultSet rs=stmnt.executeQuery(sql);
         
         while(rs.next()){
             
         int id_col = rs.getInt("ID");
         String first_name = rs.getString("First_NAME");
         String last_name = rs.getString("Last_NAME");
         String job = rs.getString("Job_TITLE");
         System.out.println( id_col + "" + first_name + " " + last_name + " " + job );
         }
     }
     catch( SQLException err) {
        System.out.print (err.getMessage ());
     }   
    }
    
}