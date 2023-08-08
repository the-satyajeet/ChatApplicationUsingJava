//package chatting.application;
//
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.border.*;
//import java.awt.event.*;
//import java.util.*;
//import java.text.*;
//import java.net.*;
//import java.io.*;
//
//public class UserChose
//{
//    JTextField text;
//    JPanel a1;
//    public String ip;
//    static Box vertical = Box.createVerticalBox();
//    static JFrame f = new JFrame();
//    static DataOutputStream dout;
//    //JFrame f = new JFrame();
//    //JPanel jp =  new JPanel();
//    
//    
//    UserChose()
//    {
//        f.setLayout(null);
//        
//        /*JScrollPane jsp = new JScrollPane();
//        jsp.setBackground(Color.LIGHT_GRAY);
//        jsp.setBounds(0,0,450,900);
//        jsp.setLayout(null);
//        f.add(jsp);*/
//        
//        // Profile Details
//       JPanel p1 = new JPanel();
//       p1.setBackground(new Color(191, 4, 54));
//       p1.setBounds(0,0,450,70);
//       p1.setLayout(null);
//       f.add(p1);
//        
//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bck.png"));
//        Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel back = new JLabel(i6);
//        back.setBounds(15, 20, 25, 25);
//        p1.add(back);
//        
//        back.addMouseListener(new MouseAdapter()
//       {
//           public void mouseClicked(MouseEvent ae)
//           {
//               System.exit(0);
//           }
//       });
//        
////       ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/icn.png"));
////       Image i8 = i7.getImage().getScaledInstance(350, 60, Image.SCALE_DEFAULT);
////       ImageIcon i9 = new ImageIcon(i8);
////       JLabel icon = new JLabel(i9);
////       icon.setBounds(50, 200, 350, 70);
////       p1.add(icon);
////       
////       JLabel name = new JLabel("USER 1");
////       name.setBounds(205, 140, 100, 20);
////       name.setForeground(Color.BLACK);
////       name.setFont(new Font("SANS SERIF", Font.BOLD, 20));
////       p1.add(name);
////       
////       JLabel phn = new JLabel("+91 12345 67890");
////       phn.setBounds(175, 165, 200, 15);
////       phn.setForeground(Color.BLACK);
////       phn.setFont(new Font("SANS SERIF", Font.BOLD, 15));
////       p1.add(phn);
//        
//       // About
//        JPanel p2 = new JPanel();
//        p2.setBounds(0,70,450,105);
//        p2.setBackground(Color.WHITE);
//        p2.setLayout(null);
//        f.add(p2);
//        //jsp.add(p2);
//        
//        JLabel usr1 = new JLabel("#client 1");
//        usr1.setBounds(20, 20, 200, 40);
//        usr1.setForeground(Color.BLACK);
//        usr1.setFont(new Font("SANS SERIF", Font.BOLD, 30));
//        p2.add(usr1);    
//                
//        
//         p2.addMouseListener(new MouseAdapter() 
//       {
//            @Override
//            public void mouseClicked(MouseEvent ae) 
//            {
//                Client0 obj = new Client0(" #client 1");
//                
//                try
//        {
//            Socket s = new Socket ("127.0.0.1",6001);
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//            dos = new DataOutputStream(s.getOutputStream());
//            
//            
//            while(true)
//                {
//                    a1.setLayout(new BorderLayout());
//                    String msg = dis.readUTF();
//                    JPanel panel = formatLabel(msg);
//                    
//                    JPanel left = new JPanel(new BorderLayout());
//                    left.add(panel, BorderLayout.LINE_START);
//                    vertical.add(left);
//                    
//                    vertical.add(Box.createVerticalStrut(15));
//                    a1.add(vertical,BorderLayout.PAGE_START);
//                    f.validate();
//                    
//                }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//                                
//      
//            }
//        });
//        
//        
//        
////        JLabel dt = new JLabel("23 October 2022");
////        dt.setBounds(20, 55, 200, 25);
////        dt.setForeground(Color.BLACK);
////        dt.setFont(new Font("SANS SERIF", Font.PLAIN, 25));
////        p2.add(dt);
//       
//        JPanel p3 = new JPanel();
//        p3.setBounds(0,180,450,105);
//        p3.setBackground(Color.WHITE);
//        p3.setLayout(null);
//        f.add(p3);
//        //jsp.add(p2);
//        
//        JLabel usr2 = new JLabel("#client 2");
//        usr2.setBounds(20, 20, 200, 40);
//        usr2.setForeground(Color.BLACK);
//        usr2.setFont(new Font("SANS SERIF", Font.BOLD, 30));
//        p3.add(usr2);    
//                
//        
//         p3.addMouseListener(new MouseAdapter() 
//       {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {
//                 new Client0(" #client 1");
//                 
//      
//            }
//        });
//        
//        JPanel p4 = new JPanel();
//        p4.setBounds(0,180,450,105);
//        p4.setBackground(Color.WHITE);
//        p4.setLayout(null);
//        f.add(p4);
//        //jsp.add(p2);
//        
//        JLabel usr3 = new JLabel("SUPER 3");
//        usr3.setBounds(20, 20, 200, 40);
//        usr3.setForeground(Color.BLACK);
//        usr3.setFont(new Font("SANS SERIF", Font.BOLD, 30));
//        p4.add(usr3);    
//                
//        
//         p4.addMouseListener(new MouseAdapter() 
//       {
//            @Override
//            public void mouseClicked(MouseEvent e) 
//            {
//                ip="127.0.0.1";
//      
//            }
//        });
//        
//        
//        /*JScrollBar sb = new JScrollBar();
//        sb.setBounds(0,0,10,700);
//        jsp.add(sb);*/
//        f.setSize(450, 700);
//        f.setLocation(1000,50);
//        f.setUndecorated(true);
//        f.getContentPane().setBackground(Color.LIGHT_GRAY);
//       
//        //f.getRootPane().setDefaultButton(send); //enter for sending message
//       
//        f.setVisible(true);
//        
//    }
//    
//    public static void main(String args[])
//    {
//        new UserChose();
//    }
//}