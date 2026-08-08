package Bank.Management.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
//import java.util.Date;//date nd time


public class Deposit extends JFrame implements ActionListener{
    
        JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    //Date date=new Date();
    Deposit(){
        
        
        setTitle("DEPOSIT");
        
        l1=new JLabel("ENTER AMOUNT YOU WANT");
        l1.setFont(new Font("System",Font.BOLD,35));
        
        l2=new JLabel("TO DEPOSIT");
        l2.setFont(new Font("System",Font.BOLD,35));
        
        l3=new JLabel("Enter Pin");
        l3.setFont(new Font("System",Font.BOLD,14));
        
        
        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
                
        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
                
        b3=new JButton("EXIT");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        
        setLayout(null);
        
        l3.setBounds(820,10,80,30);
        add(l3);
        
        t2.setBounds(900,15,60,20);
        add(t2);
        
        l1.setBounds(250,150,800,60);
        add(l1);
        
        l2.setBounds(390,210,800,60);
        add(l2);
        
        t1.setBounds(340,300,320,50);
        add(t1);
        
        b1.setBounds(360,380,125,40);
        add(b1);
        
        b2.setBounds(515,380,125,40);
        add(b2);
        
        b3.setBounds(420,460,125,40);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        //getContentPane().setBackground(Color.CYAN);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\deposit.jpg");
        Image i2= i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(0,0,1000,700);
        add(background);
        
        setSize(1000,700);
        setLocation(200,10);
        setVisible(true);
        
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        try{
            
            String a=t1.getText();
            String b=t2.getText();
            
            
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null,"Please enter the Amount what you want to Deposit");
                }
                if(t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter pin");

                }
                else{
                    
                    Conn c1=new Conn();
                    ResultSet rs=c1.s.executeQuery(" SELECT balance FROM login WHERE pin = '"+b+"'");
                              
                    double balance = 0;
                    if(rs.next()){
                        // String pin=rs.getString("pin");
                         
                         balance = rs.getDouble("balance");
                         
                         double d=Double.parseDouble(a);
                         balance = balance + d;
                        // String date = this.d.toString();
                         java.sql.Date date=new java.sql.Date(System.currentTimeMillis());
                         String q1="insert into bank values('"+b+"','"+d+"',null,'"+balance+"','"+date+"')";
                         String q2="update login set balance = '"+balance+"' where pin = '"+b+"'";
                        // String q1="update bank set deposit = '"+d+"' where pin = '"+pin+"' ";
                         //String q2="update bank set balance = '"+balance+"' where pin = '"+pin+"' ";
                         c1.s.executeUpdate(q1);
                         c1.s.executeUpdate(q2);
                         //c1.s.executeUpdate(q2);
                    
                        JOptionPane.showMessageDialog(null, "Rs. "+a+" Deposited successfully");
                    
                        new Transaction().setVisible(true);
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong PIN");
                    }
                }
            } else if(ae.getSource()==b2){
                
                new Transaction().setVisible(true);
                setVisible(false);
            } else if(ae.getSource()==b3){
                
                new Rate().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }

   
    public static void main(String[] args) {
        
       new Deposit().setVisible(true);
    }

    
    
}
