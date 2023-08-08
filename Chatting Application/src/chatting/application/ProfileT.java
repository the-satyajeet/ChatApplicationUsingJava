
package chatting.application;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;

public class ProfileT
{
    JFrame f = new JFrame();
    //JPanel jp =  new JPanel();
    
    
    ProfileT()
    {
        f.setLayout(null);
        
        
        
        // Profile Details
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0,0,450,295);
        p1.setLayout(null);
        f.add(p1);
        //jsp.add(p1);
        
        
        
//        JLabel i111 = new JLabel("<html><img src=\"icons/3.png\"></html>");
//        i111.setBounds(200,50,80,80);
//        i111.setBounds(200, 50, 80, 80);
//        p1.add(i111);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/iron-man.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel dp = new JLabel(i3);
        dp.setBounds(200, 50, 80, 80);
        p1.add(dp);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bck.png"));
        Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel back = new JLabel(i6);
        back.setBounds(15, 20, 25, 25);
        p1.add(back);
        
        back.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent ae)
           {
            f.setVisible(false);   
            //System.exit(0);
           }
       });
        
       ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/icn.png"));
       Image i8 = i7.getImage().getScaledInstance(350, 60, Image.SCALE_DEFAULT);
       ImageIcon i9 = new ImageIcon(i8);
       JLabel icon = new JLabel(i9);
       icon.setBounds(50, 200, 350, 100);
       p1.add(icon);
       
       JLabel name = new JLabel("Tony Stark");
       name.setBounds(185, 140, 200, 20);
       name.setForeground(Color.BLACK);
       name.setFont(new Font("SANS SERIF", Font.BOLD, 20));
       p1.add(name);
       
       JLabel phn = new JLabel("+91 98776 46853");
       phn.setBounds(175, 165, 200, 15);
       phn.setForeground(Color.BLACK);
       phn.setFont(new Font("SANS SERIF", Font.BOLD, 15));
       p1.add(phn);
        
       // About
       JPanel p2 = new JPanel();
        p2.setBounds(0,300,450,105);
        p2.setBackground(Color.WHITE);
        p2.setLayout(null);
        f.add(p2);
        //jsp.add(p2);
        
        JLabel abt = new JLabel("About");
        abt.setBounds(20, 25, 200, 18);
        abt.setForeground(Color.BLACK);
        abt.setFont(new Font("SANS SERIF", Font.PLAIN, 18));
        p2.add(abt);
        
        JLabel dt = new JLabel("22 October 2022");
        dt.setBounds(20, 55, 200, 25);
        dt.setForeground(Color.BLACK);
        dt.setFont(new Font("SANS SERIF", Font.PLAIN, 25));
        p2.add(dt);
       
        JPanel p3 = new JPanel();
        p3.setBounds(0,410,450,145);
        p3.setBackground(Color.WHITE);
        p3.setLayout(null);
        f.add(p3);
        
        ImageIcon i15 = new ImageIcon(ClassLoader.getSystemResource("icons/mute.png"));
        Image i16 = i15.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i17 = new ImageIcon(i16);
        JLabel mute = new JLabel(i17);
        mute.setBounds(20, 30, 30, 30);
        p3.add(mute);
        
        JLabel mt = new JLabel("Mute Notifications");
        mt.setBounds(70, 30, 200, 25);
        mt.setForeground(Color.BLACK);
        mt.setFont(new Font("SANS SERIF", Font.PLAIN, 22));
        p3.add(mt);
        
        //JCheckBox chk = new JCheckBox();
        JLabel ck = new JLabel("<html><input type = \"checkbox\"> </html>");
        //chk.setBounds(400,30,30,30);
ck.setBounds(400,30,30,30);
        p3.add(ck);
        
        
        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("icons/lock.png"));
        Image i32 = i31.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel enc = new JLabel(i33);
        enc.setBounds(20, 80, 30, 30);
        p3.add(enc);
        
        JLabel en = new JLabel("Encryption");
        en.setBounds(70, 85, 200, 25);
        en.setForeground(Color.BLACK);
        en.setFont(new Font("SANS SERIF", Font.PLAIN, 22));
        p3.add(en);
        
        JLabel enm = new JLabel("Messages are end to end encrypted");
        enm.setBounds(70, 115, 200, 15);
        enm.setForeground(Color.BLACK);
        enm.setFont(new Font("SANS SERIF", Font.PLAIN, 12));
        p3.add(enm);
        
        //jsp.add(p3);
        
        /*JLabel dt = new JLabel("23 October 2022");
        dt.setBounds(10, 45, 200, 14);
        dt.setForeground(Color.BLACK);
        dt.setFont(new Font("SANS SERIF", Font.PLAIN, 14));
        p2.add(dt);*/
        
        
        JPanel p4 = new JPanel();
        p4.setBounds(0,560,450,135);
        p4.setBackground(Color.WHITE);
        p4.setLayout(null);
        f.add(p4);
        
        ImageIcon i20 = new ImageIcon(ClassLoader.getSystemResource("icons/blk.png"));
        Image i21 = i20.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(i21);
        JLabel blk = new JLabel(i22);
        blk.setBounds(20, 30, 30, 30);
        p4.add(blk);
        
        JLabel bk = new JLabel("Block");
        bk.setBounds(70, 30, 200, 25);
        bk.setForeground(Color.RED);
        bk.setFont(new Font("SANS SERIF", Font.PLAIN, 22));
        p4.add(bk);
        
        ImageIcon i23 = new ImageIcon(ClassLoader.getSystemResource("icons/rpt.png"));
        Image i24 = i23.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i25 = new ImageIcon(i24);
        JLabel rpt = new JLabel(i25);
        rpt.setBounds(20, 80, 30, 30);
        p4.add(rpt);
        
        JLabel rp = new JLabel("Report");
        rp.setBounds(70, 80, 200, 25);
        rp.setForeground(Color.RED);
        rp.setFont(new Font("SANS SERIF", Font.PLAIN, 22));
        p4.add(rp);
        //jsp.add(p4);
        
        
        /*JScrollBar sb = new JScrollBar();
        sb.setBounds(0,0,10,700);
        jsp.add(sb);*/
        f.setSize(450, 700);
        f.setLocation(500, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
       
        //f.getRootPane().setDefaultButton(send); //enter for sending message
       
        f.setVisible(true);
        
    }
    
    public static void main(String args[])
    {
        new ProfileT();
    }
}

