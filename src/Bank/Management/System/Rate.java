/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank.Management.System;


import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
//import java.util.*;//date

/**
 *
 * @author user
 */
public class Rate extends JFrame implements ActionListener{

    JRadioButton b1,b2,b3,b4,b5;
    JLabel l1,l2;
    JButton b;
    Conn c1;
    
    Rate(){
    
        l1=new JLabel("RATE US!");
        l1.setFont(new Font("Raleway",Font.BOLD,48));

        l2=new JLabel("Other's Rating:");
        l2.setFont(new Font("Raleway",Font.BOLD,24));
        
        b1=new JRadioButton();
        b1.setBackground(Color.yellow);
        
        b2=new JRadioButton();
        b2.setBackground(Color.yellow);
        
        b3=new JRadioButton();
        b3.setBackground(Color.yellow);
        
        b4=new JRadioButton();
        b4.setBackground(Color.yellow);
        
        b5=new JRadioButton();
        b5.setBackground(Color.yellow);
        
        b=new JButton("DONE!");
        b.setFont(new Font("Raleway",Font.BOLD,24));
        b.setForeground(Color.BLACK);
        b.setBackground(Color.yellow);
        
        setLayout(null);
        
        b.setBounds(260,230,200,30);
        add(b);
        
        l1.setBounds(250,10,500,50);
        add(l1);

        l2.setBounds(510,400,500,50);
        add(l2);
        
        b1.setBounds(130,160,20,20);
        add(b1);
        
        b2.setBounds(240,160,20,20);
        add(b2);
        
        b3.setBounds(345,160,20,20);
        add(b3);
        
        b4.setBounds(455,160,20,20);
        add(b4);
        
        b5.setBounds(560,160,20,20);
        add(b5);

         c1 = new Conn();
        try {
            ResultSet rs = c1.s.executeQuery("select * from rating");
            if (rs.next()) {
                int one = rs.getInt("1star");
                int two = rs.getInt("2star");
                int three = rs.getInt("3star");
                int four = rs.getInt("4star");
                int five = rs.getInt("5star");

                JLabel l3 = new JLabel("5 Star: " + five);
                l3.setFont(new Font("Raleway",Font.BOLD,18));
                l3.setBounds(530,430,500,50);
                add(l3);

                JLabel l4 = new JLabel("4 Star: " + four);
                l4.setFont(new Font("Raleway",Font.BOLD,18));
                l4.setBounds(530,450,500,50);
                add(l4);

                JLabel l5 = new JLabel("3 Star: " + three);
                l5.setFont(new Font("Raleway",Font.BOLD,18));
                l5.setBounds(530,470,500,50);
                add(l5);

                JLabel l6 = new JLabel("2 Star: " + two);
                l6.setFont(new Font("Raleway",Font.BOLD,18));
                l6.setBounds(530,490,500,50);
                add(l6);

                JLabel l7 = new JLabel("1 Star: " + one);
                l7.setFont(new Font("Raleway",Font.BOLD,18));
                l7.setBounds(530,510,500,50);
                add(l7);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        b.addActionListener(this);
        
        setBounds(400,50,700,600);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\rate.jpg");
        Image i2= i1.getImage().getScaledInstance(700,600,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(0,0,700,600);
        add(background);
        
       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b){
        	
        	
        	String one,two,three,four,five;
        	try {
        	if (b5.isSelected()) {

        		five="UPDATE rating SET 5star = 5star+1";
        		c1.s.executeUpdate(five);
				
        	}
        	else if(b4.isSelected()) {


        		four="UPDATE rating SET 4star = 4star+1";
        		c1.s.executeUpdate(four);
        	}
        	else if(b3.isSelected()) {

        		three="UPDATE rating SET 3star = 3star+1";
        		c1.s.executeUpdate(three);
        	}
        	else if(b2.isSelected()) {

        		two="UPDATE rating SET 2star = 2star+1";
        		c1.s.executeUpdate(two);
        	}
        	else if(b1.isSelected()) {
        		one="UPDATE rating SET 1star = 1star+1";
        		c1.s.executeUpdate(one);
        	}
        	}
        	 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        
        new Rate().setVisible(true);
    }
    
}
