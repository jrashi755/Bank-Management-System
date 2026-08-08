
package Bank.Management.System;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
//import java.util.Date;//date nd time

public class FastCash extends JFrame implements ActionListener{
    
        JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextField t1;
   // Date d=new Date();
    
    FastCash(){
        
        
        setTitle("FAST CASH");
        
        
        l1=new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System",Font.BOLD,38));
        
        l2=new JLabel("Enter PIN");
        l2.setFont(new Font("System",Font.BOLD,13));
        
        t1=new JTextField();
        t1.setFont(new Font("System",Font.BOLD,13));
        
        b1=new JButton("Rs.100");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("Rs.200");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3=new JButton("Rs.500");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4=new JButton("Rs.1000");
        b4.setFont(new Font("System",Font.BOLD,18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5=new JButton("Rs.2000");
        b5.setFont(new Font("System",Font.BOLD,18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b5=new JButton("Rs.5000");
        b5.setFont(new Font("System",Font.BOLD,18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6=new JButton("Rs.10,000");
        b6.setFont(new Font("System",Font.BOLD,18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7=new JButton("BACK");
        b7.setFont(new Font("System",Font.BOLD,18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l2.setBounds(840,10,60,40);
        add(l2);
        
        t1.setBounds(910,20,60,20);
        add(t1);
        
        l1.setBounds(200,150,700,40);
        add(l1);
        
        b1.setBounds(140,250,300,50);
        add(b1);
        
         b2.setBounds(540,250,300,50);
        add(b2);
        
         b3.setBounds(140,360,300,50);
        add(b3);
        
         b4.setBounds(540,360,300,50);
        add(b4);
        
         b5.setBounds(140,470,300,50);
        add(b5);
        
         b6.setBounds(540,470,300,50);
        add(b6);
        
         b7.setBounds(340,550,300,50);
        add(b7);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\fastcash.jpg");
        Image i2= i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(0,0,1000,700);
        add(background);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        getContentPane().setBackground(Color.CYAN);
        
        setSize(1000,700);
        setLocation(200,10);
        setVisible(true);
   
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(t1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"enter pin");
        }
        else{
        try{
            
            String a=t1.getText();
            double balance = 0;
            
            if(ae.getSource()==b1){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                    //String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    
                    balance = balance - 100;
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'100','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                    JOptionPane.showMessageDialog(null, "Rs. "+100+" Debited Successfully");
                
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b2){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                   // String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    if(balance>=200){
                    balance = balance - 200;
                    //String date = this.d.toString();
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'200','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                    JOptionPane.showMessageDialog(null, "Rs. "+200+" Debited Successfully");
                    }else {
                        JOptionPane.showMessageDialog(null, "you have not enough balance");
                    }
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b3){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                   // String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    if(balance>=500){
                    balance = balance - 500;
                  //  String date = this.d.toString();
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'500','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                
                    JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully");
                    }else {
                        JOptionPane.showMessageDialog(null, "you have not enough balance");
                    }
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b4){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                   // String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    if(balance>=1000){
                    balance = balance - 1000;
                   // String date = this.d.toString();
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'1000','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                
                    JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
                    }
                else {
                        JOptionPane.showMessageDialog(null, "you have not enough balance");
                    }
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b5){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                    //String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    if(balance<5000){
                    balance = balance - 5000;
                    //String date = this.d.toString();
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'5000','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                
                    JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "you have not enough balance");
                    }
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b6){
                
                Conn c1=new Conn();
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+a+"'");
                
                if(rs.next()){
                    //String pin = rs.getString("pin");
                    
                    balance = rs.getDouble("balance");
                    if(balance>=10000){
                    balance = balance - 10000;
                   // String date = this.d.toString();
                    java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
                    String q1="insert into bank values('"+a+"',null,'10000','"+balance+"','"+date+"')";
                    String q2="update login set balance = '"+balance+"' where pin = '"+a+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                
                
                    JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully");
                    }else {
                        JOptionPane.showMessageDialog(null, "you have not enough balance");
                    }
                    new Transaction().setVisible(true);
                    setVisible(false);
                }else{
                        JOptionPane.showMessageDialog(null,"Wrong PIN");
                    }
            }
            
            if(ae.getSource()==b7){
                
                new Rate().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
        }
    }
    

    
    public static void main(String[] args) {
        
        new FastCash().setVisible(true);
    }

    
}
