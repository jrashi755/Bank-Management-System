
package Bank.Management.System;

import java.awt.*;//Font,Color
import java.awt.event.*;//ActionListener
import javax.swing.*;//JFrame
import java.sql.*;//this SQL package allows us to select, insert, update, and delete data in SQL tables.

public class Login extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;//text
    JTextField tf1;//filling
    JPasswordField pf2;//password filling
    JButton b1,b2,b3,b4,b5;//buttons
    
    Login(){
        
       
        setTitle("AUOTOMATED TELLER MACHINE");
        
        
        
        l1=new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward",Font.BOLD,38));
        
        l2=new JLabel("Card No:");
        l2.setFont(new Font("Raleway",Font.BOLD,28));
        
        l3=new JLabel("PIN:");
        l3.setFont(new Font("Raleway",Font.BOLD,28));
        
        tf1=new JTextField(15);
        pf2=new JPasswordField(15);
        
        b1=new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3=new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4=new JButton("Forget Pin or card_No.");
        b4.setBackground(Color.CYAN);
        b4.setForeground(Color.BLACK);
        
        b5=new JButton("EXIT");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(80, 50, 450, 200);//method of java.awt.setBounds(int x,int y,int width,int height)
        add(l1);
        
        l2.setBounds(75, 150, 450, 200);
        add(l2);
        
        l3.setBounds(75, 225, 450, 200);
        add(l3);
        
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        tf1.setBounds(200,235,230,30);
        add(tf1);
        
        pf2.setFont(new Font("Arial",Font.BOLD,14));
        pf2.setBounds(200,310,230,30);
        add(pf2);
        
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(140,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(270,400,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(140,450,230,30);
        add(b3);
        
        b4.setFont(new Font("Arial",Font.BOLD,14));
        b4.setBounds(200,340,230,30);
        b4.setBorder(null);
        add(b4);
        
        b5.setFont(new Font("Arial",Font.BOLD,14));
        b5.setBounds(140,500,230,30);
        add(b5);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        //appearance of frame
        getContentPane().setBackground(Color.CYAN);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\login.jpg");
        Image i2= i1.getImage().getScaledInstance(500,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(500,0,500,700);
        add(background);
        
        setSize(1000,700);
        setLocation(200,10);
        
        
        
        
    }

    
    public void actionPerformed(ActionEvent ae) {
        
        try{
            if(ae.getSource()==b1){
            Conn c1=new Conn();
            String a=tf1.getText();
            String b=pf2.getPassword().toString();
            String q="select * from login where cardno = '"+a+"' and pin = '"+b+"'";//to call database
            ResultSet rs=c1.s.executeQuery(q);//to take data
            
            
                if(rs.next()){//to jump on database colomn wise
                    JOptionPane.showMessageDialog(null,"Login successfull");
                    new Transaction().setVisible(true);//to open the transaction class
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Password");
               }
            }
            
            else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }
            
            else if(ae.getSource()==b3){
                new Signup1().setVisible(true);
                this.setVisible(false);
            }
            
            else if(ae.getSource()==b4){
                new ForgetPin().setVisible(true);
                
            }
            else if(ae.getSource()==b5){
                new Rate().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    }

    
    public static void main(String[] args) {
        
        new Login().setVisible(true);
        
    }
    
}
