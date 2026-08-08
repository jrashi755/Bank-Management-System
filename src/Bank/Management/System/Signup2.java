
package Bank.Management.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;//this SQL package allows us to select, insert, update, and delete data in SQL tables.


public class Signup2 extends JFrame implements ActionListener {
    
    static String q1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2;
    JComboBox<String> c1,c2,c3,c4,c5;
    
    
    Signup2(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM page-2");
        
        
        
        l1=new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        
        l2=new JLabel("Religion:");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        
        l3=new JLabel("Category:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        
        l4=new JLabel("Income:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        
        l5=new JLabel("Educational");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        
        l11=new JLabel("Qualification:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        
        l6=new JLabel("Occupation:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        
        l7=new JLabel("PAN Number(optional):");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        
        l8=new JLabel("Aadhar number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        
        l9=new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        
        l10=new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        
        //l12=new JLabel("Form No.:");
        //l12.setFont(new Font("Raleway",Font.BOLD,13));
        
        
        b1=new JButton("NEXT");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
                
        
        
        
        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        t2=new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        
        //t3=new JTextField();
        //t3.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        r1=new JRadioButton("yes");
        r1.setFont(new Font("raleway",Font.BOLD,14));
        r1.setBackground(Color.CYAN);
        
        r2=new JRadioButton("No");
        r2.setFont(new Font("raleway",Font.BOLD,14));
        r2.setBackground(Color.CYAN);
        
        r3=new JRadioButton("yes");
        r3.setFont(new Font("raleway",Font.BOLD,14));
        r3.setBackground(Color.CYAN);
        
        r4=new JRadioButton("No");
        r4.setFont(new Font("raleway",Font.BOLD,14));
        r4.setBackground(Color.CYAN);
        
        String religion[]={"Hindu","Muslim","Sikh","Christian","Jain","Other"};
        c1=new JComboBox<>(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        
        String category[]={"General","OBC","SC","ST","Other"};
        c2=new JComboBox<>(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        
        String income[]={"Null","<50,000","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3=new JComboBox<>(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        
        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        c4=new JComboBox<>(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        
        String occupation[]={"Saleried","Self-Employed","Business","Student","Retired","Other"};
        c5=new JComboBox<>(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        
        setLayout(null);
        
        //l12.setBounds(700,10,80,30);
        //add(l12);
        
        //t3.setBounds(760,10,60,30);
        //add(t3);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        l3.setBounds(100,170,100,30);
        add(l3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        l5.setBounds(100,270,150,30);
        add(l5);
        
        c4.setBounds(350,270,320,30);
        add(c4);
        
        l11.setBounds(100,290,150,30);
        add(l11);
        
        l6.setBounds(100,340,150,30);
        add(l6);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        l7.setBounds(100,390,250,30);
        add(l7);
        
        t1.setBounds(350,390,320,30);
        add(t1);
        
        l8.setBounds(100,440,180,30);
        add(l8);
        
        t2.setBounds(350,440,320,30);
        add(t2);
        
        l9.setBounds(100,490,150,30);
        add(l9);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b1.setBounds(350,600,100,30);
        add(b1);
        
       
      
        
        b1.addActionListener(this);
       
        
        getContentPane().setBackground(Color.CYAN);
        
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        
        
        
        String a=(String)c1.getSelectedItem();//typecast - an object is converted into String
        String b=(String)c2.getSelectedItem();
        String c=(String)c3.getSelectedItem();
        String d=(String)c4.getSelectedItem();
        String e=(String)c5.getSelectedItem();
        
        String f=t1.getText();
        String g=t2.getText();
        
        String h="";
        if(r1.isSelected()){
            h="Yes";
        }else if(r2.isSelected()){
            h="No";
        }
        
        String i="";
        if(r3.isSelected()){
            i="Yes";
        }else if(r4.isSelected()){
            i="No";
        }
        
        //String j=t3.getText();
        
        
        try{
            if((!r1.isSelected()&&!r2.isSelected())||(!r3.isSelected()&&!r4.isSelected())){
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
            //}
           // else if((t2.getText().equals(""))||(t3.getText().equals(""))){
                //JOptionPane.showMessageDialog(null,"Fill all the required fields");
            }else{
                //Conn c1=new Conn();
                q1="insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','";
                //c1.s.executeUpdate(q1);
                
                new Signup3().setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
    public static void main(String[] args) {
        
        new Signup2().setVisible(true);
        
    }
    
}
