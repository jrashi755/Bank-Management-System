
package Bank.Management.System;

import javax.swing.*;
import java.awt.*;

public class Bank{ 
    
    public static void main(String args []){
        
        BankFrame frame=new BankFrame();
        frame.setVisible(true);
        
        //int x=1;
        for(int i=1;i<=1100;i+=5){
        
        
            frame.setLocation(700-i/2,30);
            frame.setSize(i,700);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
     
        }
        //frame.setVisible(true);
    }

}

class BankFrame extends JFrame implements Runnable{
    
    Thread t1;
    
    BankFrame(){
        
        setLayout(null);
        //setBounds(100,50,1100,700);
        ImageIcon i1 = new ImageIcon("C:\\Users\\user\\Pictures\\bank.jpg");
        Image i2= i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel background=new JLabel();
        background.setIcon(i3); 
        background.setBounds(0,0,1100,700);
        add(background);
        
        t1=new Thread(this);
        t1.start();
        
    }
    
    public void run(){
        
        try{
           Thread.sleep(7000);
           setVisible(false);
           new Login().setVisible(true);
        }catch(Exception e){}
        
    
    }
    
    
}