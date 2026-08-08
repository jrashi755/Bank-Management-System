
package Bank.Management.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class UpdatePersonalDetails extends JFrame implements ActionListener {
    
    JLabel l1,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9;//mcq option
    JButton b1,b2;
    JComboBox c1,c2,c3,c4,c5,c6,c7,c8;//selection from list
    String pin;
    
    UpdatePersonalDetails(){
        
        
        l1=new JLabel("VEIW OR UPDATE PERSONAL DETAILS");
        l1.setFont(new Font("Relway",Font.BOLD,38));
        
        l3=new JLabel("Name:");
        l3.setFont(new Font("Relway",Font.BOLD,20));
        
        l4=new JLabel("Father's Name:");
        l4.setFont(new Font("Relway",Font.BOLD,20));
        
        l5=new JLabel("Date of Birth:");
        l5.setFont(new Font("Relway",Font.BOLD,20));
        
        l6=new JLabel("Gender:");
        l6.setFont(new Font("Relway",Font.BOLD,20));
        
        l7=new JLabel("Email Address:");
        l7.setFont(new Font("Relway",Font.BOLD,20));
        
        l8=new JLabel("Marital Status:");
        l8.setFont(new Font("Relway",Font.BOLD,20));
        
        l9=new JLabel("Address:");
        l9.setFont(new Font("Relway",Font.BOLD,20));
        
        l10=new JLabel("City:");
        l10.setFont(new Font("Relway",Font.BOLD,20));
        
        l11=new JLabel("PinCode:");
        l11.setFont(new Font("Relway",Font.BOLD,20));
        
        l12=new JLabel("State:");
        l12.setFont(new Font("Relway",Font.BOLD,20));
        
        l13=new JLabel("Date");
        l13.setFont(new Font("Relway",Font.BOLD,14));
        
        l14=new JLabel("Month");
        l14.setFont(new Font("Relway",Font.BOLD,14));
        
        l15=new JLabel("Year");
        l15.setFont(new Font("Relway",Font.BOLD,14));
        
        
        t1=new JTextField();
        t1.setFont(new Font("Relway",Font.BOLD,14));
        
        t2=new JTextField();
        t2.setFont(new Font("Relway",Font.BOLD,14));
        
        t3=new JTextField();
        t3.setFont(new Font("Relway",Font.BOLD,14));
        
        t4=new JTextField();
        t4.setFont(new Font("Relway",Font.BOLD,14));
        
        t5=new JTextField();
        t5.setFont(new Font("Relway",Font.BOLD,14));
        
        t6=new JTextField();
        t6.setFont(new Font("Relway",Font.BOLD,14));
        
        t7=new JTextField();
        t7.setFont(new Font("Relway",Font.BOLD,14));
        
        
        
        b1=new JButton("UPDATE");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2=new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(Color.CYAN);
        
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(Color.CYAN);
        
        r3=new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(Color.CYAN);
        
        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(Color.CYAN);
        
        r5=new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(Color.CYAN);
        
       
        
        l16=new JLabel("Qualification:");
        l16.setFont(new Font("Raleway",Font.BOLD,18));
        
        l17=new JLabel("Religion:");
        l17.setFont(new Font("Raleway",Font.BOLD,18));
        
        l18=new JLabel("Catagory:");
        l18.setFont(new Font("Raleway",Font.BOLD,18));
        
        l19=new JLabel("Salary:");
        l19.setFont(new Font("Raleway",Font.BOLD,18));
        
        l20=new JLabel("Educational");
        l20.setFont(new Font("Raleway",Font.BOLD,18));
        
        l21=new JLabel("Occupation:");
        l21.setFont(new Font("Raleway",Font.BOLD,18));
        
        l22=new JLabel("Aadhar number:");
        l22.setFont(new Font("Raleway",Font.BOLD,18));
        
        l23=new JLabel("Senior Citizen:");
        l23.setFont(new Font("Raleway",Font.BOLD,18));
        
        l24=new JLabel("Existing Account:");
        l24.setFont(new Font("Raleway",Font.BOLD,18));
        
        l25=new JLabel("Pan Number:");
        l25.setFont(new Font("Raleway",Font.BOLD,18));
      
        t8=new JTextField();
        t8.setFont(new Font("Raleway",Font.BOLD,14));
        
        t9=new JTextField();
        t9.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        r6=new JRadioButton("yes");
        r6.setFont(new Font("raleway",Font.BOLD,14));
        r6.setBackground(Color.CYAN);
        
        r7=new JRadioButton("No");
        r7.setFont(new Font("raleway",Font.BOLD,14));
        r7.setBackground(Color.CYAN);
        
        r8=new JRadioButton("yes");
        r8.setFont(new Font("raleway",Font.BOLD,14));
        r8.setBackground(Color.CYAN);
        
        r9=new JRadioButton("No");
        r9.setFont(new Font("raleway",Font.BOLD,14));
        r9.setBackground(Color.CYAN);
        
        String religion[]={"Hindu","Muslim","Sikh","Christian","Jain","Other"};
        c4=new JComboBox(religion);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        
        String category[]={"General","OBC","SC","ST","Other"};
        c5=new JComboBox(category);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        
        String income[]={"Null","<50,000","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c6=new JComboBox(income);
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        
        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        c7=new JComboBox(education);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        
        String occupation[]={"Saleried","Self-Employed","Business","Student","Retired","Other"};
        c8=new JComboBox(occupation);
        c8.setBackground(Color.WHITE);
        c8.setFont(new Font("Raleway",Font.BOLD,14));
        
        
        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1=new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        c2=new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        c3=new JComboBox(year);
        c3.setBackground(Color.WHITE);
        
        
        
        setLayout(null);
        
        l1.setBounds(140,20,800,40);
        add(l1);
        
        l3.setBounds(50,140,200,30);
        add(l3);
        
        t1.setBounds(200,140,300,30);
        add(t1);
        
        l4.setBounds(50,190,200,30);
        add(l4);
        
        t2.setBounds(200,190,300,30);
        add(t2);
        
        l5.setBounds(50,240,200,30);
        add(l5);
        
        l13.setBounds(200,240,40,30);
        add(l13);
        
        c1.setBounds(235,240,50,30);
        add(c1);
        
        l14.setBounds(290,240,50,30);
        add(l14);
        
        c2.setBounds(340,240,50,30);
        add(c2);
        
        l17.setBounds(280,140,200,30);
        add(l17);
        
        l15.setBounds(390,240,40,30);
        add(l15);
        
        c3.setBounds(430,240,60,30);
        add(c3);
        
        l6.setBounds(50,290,200,30);
        add(l6);
        
        r1.setBounds(200,290,60,30);
        add(r1);
        
        r2.setBounds(350,290,90,30);
        add(r2);
        
        l7.setBounds(50,340,200,30);
        add(l7);
        
        t3.setBounds(200,340,300,30);
        add(t3);
        
        l8.setBounds(50,390,200,30);
        add(l8);
        
        r3.setBounds(200,390,100,30);
        add(r3);
        
        r4.setBounds(300,390,100,30);
        add(r4);
        
        r5.setBounds(410,390,100,30);
        add(r5);
        
        l9.setBounds(50,440,200,30);
        add(l9);
        
        t4.setBounds(200,440,300,30);
        add(t4);
        
        l10.setBounds(50,490,200,30);
        add(l10);
        
        t5.setBounds(200,490,300,30);
        add(t5);
        
        l11.setBounds(50,540,200,30);
        add(l11);
        
        t6.setBounds(200,540,300,30);
        add(t6);
        
        l12.setBounds(50,590,200,30);
        add(l12);
        
        t7.setBounds(200,590,300,30);
        add(t7);
        
        b1.setBounds(300,650,150,30);
        add(b1);
        
        b2.setBounds(600,650,150,30);
        add(b2);
        
        l17.setBounds(550,140,200,30);
        add(l17);
        
        l18.setBounds(550,190,200,30);
        add(l18);
        
        l19.setBounds(550,240,200,30);
        add(l19);
        
        l20.setBounds(550,280,200,30);
        add(l20);
        
        l16.setBounds(550,300,200,30);
        add(l16);
        
        l21.setBounds(550,340,200,30);
        add(l21);
        
        l22.setBounds(550,390,200,30);
        add(l22);
        
        l25.setBounds(550,440,200,30);
        add(l25);
        
        l23.setBounds(550,490,200,30);
        add(l23);
        
        l24.setBounds(550,540,200,30);
        add(l24);
        
        c4.setBounds(700,140,300,30);
        add(c4);
        
        c5.setBounds(700,190,300,30);
        add(c5);
        
        c6.setBounds(700,240,300,30);
        add(c6);
        
        c7.setBounds(700,290,300,30);
        add(c7);
        
        c8.setBounds(700,340,300,30);
        add(c8);
        
        t8.setBounds(700,390,300,30);
        add(t8);
        
        t9.setBounds(700,440,300,30);
        add(t9);
        
        r6.setBounds(720,490,100,30);
        add(r6);
        
        r7.setBounds(920,490,100,30);
        add(r7);

        r8.setBounds(720,540,100,30);
        add(r8);
        
        r9.setBounds(920,540,100,30);
        add(r9);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.CYAN);
        
        setSize(1050,850);
        setLocation(200,10);
        setVisible(true);
        
        
        String pinn = JOptionPane.showInputDialog("enter pin");
        pin=pinn;
        
         try{
                Conn c=new Conn();
                ResultSet rs1=c.s.executeQuery("select * from signup where pin='"+pinn+"'");
                
                while(rs1.next()){
                    t1.setText(rs1.getString("name"));
                    t2.setText(rs1.getString("fname"));
                    t3.setText(rs1.getString("email"));
                    t4.setText(rs1.getString("address"));
                    t5.setText(rs1.getString("city"));
                    t6.setText(rs1.getString("pincode"));
                    t7.setText(rs1.getString("state"));
                    c1.setSelectedItem(rs1.getString("date"));
                    c2.setSelectedItem(rs1.getString("month"));  
                    c3.setSelectedItem(rs1.getString("year"));
                    
                }
                ResultSet rs2=c.s.executeQuery("select * from signup2 where pin='"+pinn+"'");
                while(rs2.next()){
                    c4.setSelectedItem(rs2.getString("religion"));
                    c5.setSelectedItem(rs2.getString("catagory"));
                    c6.setSelectedItem(rs2.getString("income"));
                    c7.setSelectedItem(rs2.getString("education"));
                    c8.setSelectedItem(rs2.getString("occupation"));
                    t8.setText(rs2.getString("aadhar"));
                    t9.setText(rs2.getString("pan"));
                }
            }catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);
    }
   
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
           try{
            Conn c=new Conn();
                    String q1="update signup set name = '"+t1.getText()+"' where pin = '"+pin+"' ";
                    String q2="update signup set fname = '"+t2.getText()+"' where pin = '"+pin+"' ";
                    String q3="update signup set email = '"+t3.getText()+"' where pin = '"+pin+"' ";
                    String q4="update signup set address = '"+t4.getText()+"' where pin = '"+pin+"' ";
                    String q5="update signup set city = '"+t5.getText()+"' where pin = '"+pin+"' ";
                    String q6="update signup set pincode = '"+t6.getText()+"' where pin = '"+pin+"' ";
                    String q7="update signup set state = '"+t7.getText()+"' where pin = '"+pin+"' ";
                    String q8="update signup set date = '"+c1.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q9="update signup set month = '"+c2.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q10="update signup set year = '"+c3.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q11="update signup2 set aadhar = '"+t8.getText()+"' where pin = '"+pin+"' ";
                    String q12="update signup2 set pan = '"+t9.getText()+"' where pin = '"+pin+"' ";
                    String q13="update signup2 set religion = '"+c4.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q14="update signup2 set catagory = '"+c5.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q15="update signup2 set income = '"+c6.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q16="update signup2 set education = '"+c7.getSelectedItem()+"' where pin = '"+pin+"' ";
                    String q17="update signup2 set occupation = '"+c8.getSelectedItem()+"' where pin = '"+pin+"' ";
                    c.s.executeUpdate(q1);
                    c.s.executeUpdate(q2);
                    c.s.executeUpdate(q3);
                    c.s.executeUpdate(q4);
                    c.s.executeUpdate(q5);
                    c.s.executeUpdate(q6);
                    c.s.executeUpdate(q7);
                    c.s.executeUpdate(q8);
                    c.s.executeUpdate(q9);
                    c.s.executeUpdate(q10);
                    c.s.executeUpdate(q11);
                    c.s.executeUpdate(q12);
                    c.s.executeUpdate(q13);
                    c.s.executeUpdate(q14);
                    c.s.executeUpdate(q15);
                    c.s.executeUpdate(q16);
                    c.s.executeUpdate(q17);
           }  catch(Exception e){
            e.printStackTrace();
            System.out.println("error: "+e);}
        
                    JOptionPane.showMessageDialog(null,"updated successfully");
                    
                    new Transaction().setVisible(true);
                    setVisible(false);
           

        }else if(ae.getSource()==b2){
            new Transaction().setVisible(true);
            setVisible(false);
        }
    
}
     
    public static void main(String[] args) {
       
        new UpdatePersonalDetails().setVisible(true);
    }
    
}
