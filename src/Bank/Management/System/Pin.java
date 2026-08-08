/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank.Management.System;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;

public class Pin extends JFrame implements ActionListener{
    
         JLabel l1,l2,l3,l4;
     JTextField t1,t2,t3;
     JButton b1,b2;
        
    Pin()
    {
       
        setTitle("PIN CHANGE");
        
        
        l1=new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,35));
        
        l2=new JLabel("Current PIN:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        
        l3=new JLabel("New PIN:");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        
        l4=new JLabel("Re-Enter New PIN:");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,22));
        
        t3=new JTextField();
        t3.setFont(new Font("Raleway",Font.BOLD,22));
        
        b1=new JButton("SAVE");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l1.setBounds(220,30,800,60);
        add(l1);
        
        l2.setBounds(100,240,150,40);
        add(l2);
        
        l3.setBounds(100,300,150,40);
        add(l3);
        
        l4.setBounds(100,360,200,40);
        add(l4);
        
        t1.setBounds(310,240,360,40);
        add(t1);
        
        t2.setBounds(310,300,360,40);
        add(t2);
        
        t3.setBounds(310,360,360,40);
        add(t3);
        
        b1.setBounds(220,460,160,40);
        add(b1);
        
        b2.setBounds(400,460,160,40);
        add(b2);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.CYAN); 
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\pinn.jpg");
        Image i2= i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(0,0,1000,700);
        add(background);
        
        setSize(800,700);
        setLocation(300,10);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        try{
            
            String a=t1.getText();
            String b=t2.getText();
           // String c=t3.getText();
            
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null,"Please Enter Current PIN");
                    
                }
                if(t2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                }
                if(t3.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                }
                if(t2.getText().equals(t3.getText())){
                    
                    try{
                    Conn c1=new Conn();
                    String q1="update bank set pin = '"+b+"' where pin = '"+a+"' ";
                    String q2="update login set pin = '"+b+"' where pin = '"+a+"' ";
                    String q3="update signup3 set pin = '"+b+"' where pin = '"+a+"' ";
                    String q4="update signup set pin = '"+b+"' where pin = '"+a+"' ";
                    String q5="update signup2 set pin = '"+b+"' where pin = '"+a+"' ";
                    
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    c1.s.executeUpdate(q4);
                    c1.s.executeUpdate(q5);
                    
                    JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
                    
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"you should choose a unique pin");
                    }
                    
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
                }
        }
            
        if(ae.getSource()==b2){
            
            new Transaction().setVisible(true);
            setVisible(false);
        }    
        
       
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }
     


    
    public static void main(String[] args) {
        
        new Pin().setVisible(true);
    }

        
}
