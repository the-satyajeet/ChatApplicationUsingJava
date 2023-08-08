
package chatting.application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;
public class Information {
    JFrame f = new JFrame();
    JPanel a1;
    
    Information(){
     f.setLayout(null);
     
     JPanel p1 = new JPanel();
        p1.setBackground(new Color(191,4,54));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        f.add(p1);
        
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel back = new JLabel(i6);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);
        
         back.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent ae)
           {
               
                
               f.setVisible(false);
           }
       });
         
         
         
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/icons8-multiply-48.png"));
        Image i14 = i13.getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(390, 20, 40, 30);
        p1.add(morevert);
        
        morevert.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent ae)
           {
   
               System.exit(0);
           }
       });
              
        
        f.setSize(450, 700);
        f.setLocation(500, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(new Color(186,189,191));
       
        //f.getRootPane().setDefaultButton(send); //enter for sending message
        
//        a1 = new JPanel();
//        a1.setBounds(5, 75, 440, 570);
//        a1.setBackground(new Color(186,189,191));
//        f.add(a1);
        
        JLabel name = new JLabel("VATS APP");
        name.setBounds(150, 29, 140, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(186,189,191));
        p2.setBounds(30,70,450, 600);
        p2.setLayout(null);
        f.add(p2);
        
        JLabel det = new JLabel("<html><p>The Java Chat Application is a desktop based application that has been developed using Java Swing and AWT packages. The program allows users to connect with each other and chat in real-time through a \n" +
"graphical user interface (GUI).</p><br></html>");
        det.setBounds(5, 5, 410, 200);
       det.setHorizontalAlignment(SwingConstants.CENTER);
        det.setForeground(new Color(191,4,54));
        f.getContentPane().add(det);
        det.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        
        p2.add(det);
        
         JLabel TAG = new JLabel("<html><u><font color=red>@TEAM-WORK</font><html></u>");
        TAG.setBounds(130, 70, 425, 250);
        TAG.setForeground(Color.WHITE);
        TAG.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(TAG);
        
        JLabel vaishali = new JLabel("<html><p><font color=red>V</font><font color=black>aishali : <font color=black>(i) Login Interface</p><br></html>");           //vaishali
        vaishali.setBounds(5, 70, 425, 350);
        vaishali.setForeground(Color.WHITE);
        vaishali.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(vaishali);
        
        JLabel vaishali2 = new JLabel("<html><p><font color=black>(ii) Connection with MySql </p><br></html>");
        vaishali2.setBounds(130, 70, 425, 400);
        vaishali2.setForeground(Color.WHITE);
        vaishali2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(vaishali2);
        
        JLabel akash1 = new JLabel("<html><p><font color=red>A</font><font color=black>akash : <font color=black>(i) Network connection</p><br></html>");           //aakash
        akash1.setBounds(5, 70, 425, 480);
        akash1.setForeground(Color.WHITE);
akash1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(akash1);
        
        JLabel akash2 = new JLabel("<html><p><font color=black>(ii) 'About' section </p><br></html>");
        akash2.setBounds(130, 70, 425, 530);
        akash2.setForeground(Color.WHITE);
        akash2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(akash2);
        
        JLabel twasif1 = new JLabel("<html><p><font color=red>T</font><font color=black>wasif : <font color=black>(i) Registration(CRUD) module</p><br></html>");           //Twasif
        twasif1.setBounds(5, 70, 425, 610);
        twasif1.setForeground(Color.WHITE);
        twasif1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(twasif1);
        
        JLabel twasif2 = new JLabel("<html><p><font color=black>(ii) MySql JDBC connection </p><br></html>");
        twasif2.setBounds(130, 70, 425, 660);
        twasif2.setForeground(Color.WHITE);
        twasif2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(twasif2);
        
        JLabel satya1 = new JLabel("<html><p><font color=red>S</font><font color=black>atyajeet : <font color=black>(i) Multiple user connection</p><br></html>");           //satya
        satya1.setBounds(5, 70, 425, 720);
        satya1.setForeground(Color.WHITE);
        satya1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(satya1);
        
        JLabel satya2 = new JLabel("<html><p><font color=black>(ii) User Interface </p><br></html>");
        satya2.setBounds(130, 70, 425, 770);
        satya2.setForeground(Color.WHITE);
        satya2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p2.add(satya2);

        
        
        f.setVisible(true);
    }
    
    
    public static void main(String args[])
    {
        new Information();
    }
}