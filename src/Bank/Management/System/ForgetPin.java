
package Bank.Management.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ForgetPin extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    
    ForgetPin(){
        setBounds(550,250,400,400);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        l1=new JLabel("Name:");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahomba",Font.BOLD,14));
        add(l1);
        
        l2=new JLabel("Adhar ID:");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahomba",Font.BOLD,14));
        add(l2);
        
        l3=new JLabel("Card No:");
        l3.setBounds(40,140,100,25);
        l3.setFont(new Font("Tahomba",Font.BOLD,14));
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(140,20,190,25);
        t1.setFont(new Font("Tahomba",Font.BOLD,14));
        add(t1);
        
        t2=new JTextField();
        t2.setBounds(140,60,190,25);
        t2.setFont(new Font("Tahomba",Font.BOLD,14));
        add(t2);
        
        t3=new JTextField();
        t3.setBounds(140,140,190,25);
        t3.setFont(new Font("Tahomba",Font.BOLD,14));
        add(t3);
        
        l4=new JLabel("PIN:");
        l4.setBounds(40,180,100,25);
        l4.setFont(new Font("Tahomba",Font.BOLD,14));
        add(l4);
        
        t4=new JTextField();
        t4.setBounds(140,180,190,25);
        t4.setFont(new Font("Tahomba",Font.BOLD,14));
        add(t4);
        
        b1=new JButton("sumbit");
        b1.setBounds(140,100,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(140,220,100,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
    }
        public void actionPerformed(ActionEvent ae){
            try{
               // String a= t1.getText();
                String b= t2.getText();
            
                if(ae.getSource()==b1){
                    Conn c1=new Conn();
                    ResultSet rs= c1.s.executeQuery("select cardno,pin from signup2 where aadhar = '"+b+"'" );
                    if(rs.next()){
                        
                        t3.setText(rs.getString("cardno"));
                        t4.setText(rs.getString("pin"));
                    }else{
                        JOptionPane.showMessageDialog(null,"Wrong Details");
                    }
                }
                else if(ae.getSource()==b2){
                
                    new Login().setVisible(true);
                    setVisible(false);
                }
            }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
        }
    
        
    public static void main(String[] args) {
        
        new ForgetPin().setVisible(true);
        
    }
    
}
