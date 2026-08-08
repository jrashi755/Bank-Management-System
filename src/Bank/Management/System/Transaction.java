
package Bank.Management.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;


public class Transaction extends JFrame implements ActionListener {
    
    //JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    
    
    Transaction(){
        
        
        setTitle("TRANSACTION");
        
        //l1=new JLabel("Please select your transaction");
        //l1.setFont(new Font("System",Font.BOLD,34));
     
        
        
        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("CASH WITHDRAWL");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3=new JButton("FAST CASH");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4=new JButton("DELETE ACCOUNT");
        b4.setFont(new Font("System",Font.BOLD,18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5=new JButton("PIN CHANGE");
        b5.setFont(new Font("System",Font.BOLD,18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6=new JButton("BALANCE ENQUERY");
        b6.setFont(new Font("System",Font.BOLD,18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7=new JButton("EXIT");
        b7.setFont(new Font("System",Font.BOLD,18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        b8=new JButton("PERSONAL DETAILS");
        b8.setFont(new Font("System",Font.BOLD,18));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        
        b9=new JButton("VIEW STATEMENT");
        b9.setFont(new Font("System",Font.BOLD,18));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        
        setLayout(null);
        
        //l1.setBounds(20,20,250,80);
        //add(l1);
        
        b8.setBounds(20,80,250,40);
        add(b8);
        
        b9.setBounds(20,140,250,40);
        add(b9);
        
        b1.setBounds(20,200,250,40);
        add(b1);
        
        b2.setBounds(20,260,250,40);
        add(b2);
        
        b3.setBounds(20,320,250,40);
        add(b3);
        
        b4.setBounds(20,380,250,40);
        add(b4);
        
        b5.setBounds(20,440,250,40);
        add(b5);
        
        b6.setBounds(20,500,250,40);
        add(b6);
        
        b7.setBounds(20,560,250,40);
        add(b7);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        getContentPane().setBackground(Color.CYAN);
        
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\transaction.jpg");
        Image i2= i1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(300,0,700,700);
        add(background);
        
        setSize(1000,700);
        setLocation(200,10);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1)
        {
            
            new Deposit().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b2)
        {
            
            new Withdrawl().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource() == b3)
        {
            
            new FastCash().setVisible(true);
            setVisible(false);
        }else if(ae.getSource() == b4)
        {   
        
            String pin=JOptionPane.showInputDialog("Enter Pin");
            Conn c1=new Conn();
             

            try{
                
                ResultSet rs=c1.s.executeQuery("SELECT name FROM signup WHERE pin = '"+pin+"'");
                
                if(rs.next()){
                    
                    String name=rs.getString("name");
                    String q1="delete from signup where pin = '"+pin+"'";
                    String q2="delete from signup2 where pin = '"+pin+"'";
                    String q3="delete from signup3 where pin = '"+pin+"'";
                    String q4="delete from login where pin = '"+pin+"'";
                    String q5="delete from bank where pin = '"+pin+"'";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    c1.s.executeUpdate(q3);
                    c1.s.executeUpdate(q4);
                    c1.s.executeUpdate(q5);
                
                    String message="hey! "+name+" Your Account is deleted successfully";
                    JOptionPane.showMessageDialog(null,message);
                    new Login().setVisible(true);
                    setVisible(false);
                }else
                {   JOptionPane.showMessageDialog(null,"Wrong pin");}
            }catch(Exception e){
                e.printStackTrace();}
            
        }else if(ae.getSource() == b5)
        {
            
            new Pin().setVisible(true);
            setVisible(false);
        }else if(ae.getSource() == b6)
        {
            
            String pinn=JOptionPane.showInputDialog("Enter Pin");
            Conn c1=new Conn();
            
            try {
                
                ResultSet rs=c1.s.executeQuery("SELECT balance FROM login WHERE pin = '"+pinn+"'");
                /*The ORDER BY keyword is used to sort the result-set in ascending or descending order.*/
                /*to show last bal enquery*/
                
                if(rs.next()){
                    String balance =rs.getString("balance");
                    JOptionPane.showMessageDialog(null,"Your Account Balance is"+balance);
                }else{
                        JOptionPane.showMessageDialog(null, "Wrong PIN");
                    }

                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==b7){
            new Rate().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b8){
            new UpdatePersonalDetails().setVisible(true);
            setVisible(false);
        }
         else if(ae.getSource()==b9){
            String pin;
            pin=JOptionPane.showInputDialog("Enter Pin");
            try{
                Conn con=new Conn();
                String str="select * from bank where pin = '"+pin+"'";
                ResultSet rs=con.s.executeQuery(str);
                ResultSetMetaData rsmt = rs.getMetaData();
                int c = rsmt.getColumnCount();
                Vector column = new Vector(c);
                for(int i=1;i<=c;i++){
                    column.add(rsmt.getColumnName(i));
                }
                Vector data=new Vector();
                Vector row=new Vector();
                while(rs.next()){
                    row=new Vector(c);
                    for(int i=1;i<=c;i++){
                        row.add(rs.getString(i));
                    }
                    data.add(row);
                }
                JFrame frame=new JFrame();
                frame.setSize(500,200);
                frame.setLocationRelativeTo(null);
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //JPanel panel =new JPanel();
                JTable table=new JTable(data,column);
                JScrollPane jsp=new JScrollPane(table);
                frame.setLayout(new BorderLayout());
                frame.add(jsp,BorderLayout.CENTER);
                //frame.getContentPane().setBackground(Color.CYAN);
                frame.setTitle("VIEW STATEMENT");
                //frame.setBackground(Color.WHITE);
                jsp.setBackground(Color.BLACK);
                //frame.setContentPane(panel);
                frame.setVisible(true);
            }catch(Exception e){}
        }
    }

   
    public static void main(String[] args) {
       
        new Transaction().setVisible(true);
    }
    
}
