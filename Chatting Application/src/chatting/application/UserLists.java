package chatting.application;

import static chatting.application.Client0.a1;
import static chatting.application.Client0.dos;
import static chatting.application.Client0.f;
import static chatting.application.Client0.formatLabel;
import static chatting.application.Client0.vertical;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.net.Socket;

public class UserLists implements ActionListener{

    JTextField text;
    JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout;

    UserLists() {

        f.setLayout(null);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setBackground(new Color(191, 4, 54));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        f.add(p1);
        p2.setBackground(new Color(186, 189, 191));
        p2.setBounds(0, 80, 450, 700);
        p2.setLayout(null);
        f.add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/logo3.png"));
        Image i5 = i4.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 5, 60, 60);
        p1.add(profile);

        profile.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });
        
        
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/info.png"));
        Image i14 = i13.getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(390, 20, 40, 30);
        p1.add(morevert);

        morevert.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                System.exit(0);

            }
        });

        JLabel name = new JLabel("VATS");
        name.setBounds(110, 15, 200, 30);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        p1.add(name);
        
        JLabel select = new JLabel("Select a user to chat with");
        select.setBounds(20, 10, 300, 30);
        select.setForeground(Color.BLACK);
        select.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        p2.add(select);
        
        // client 1
        JButton user0 = new JButton("Client 1");
        user0.setBounds(20, 50, 230, 30);
        user0.setBackground(new Color(191, 4, 54));
        user0.setForeground(Color.WHITE);
        user0.addActionListener(this);
        user0.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        p2.add(user0);
        
        user0.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent ae) 
            {
                Client0 obj = new Client0(" #client 1");

            //Client0.main(null);
            
            //new Client0(" #client 1");    
            try
            {
                Socket s = new Socket ("127.0.0.1",6001);
                DataInputStream dis = new DataInputStream(s.getInputStream());
                dos = new DataOutputStream(s.getOutputStream());
            
            
                while(true)
                {
                    a1.setLayout(new BorderLayout());
                    String msg = dis.readUTF();
                    JPanel panel = formatLabel(msg);
                    
                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel, BorderLayout.LINE_START);
                    vertical.add(left);
                    
                    vertical.add(Box.createVerticalStrut(15));
                    a1.add(vertical,BorderLayout.PAGE_START);
                    f.validate();
                    
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            }
        });
        
        // client 2
        JButton user1 = new JButton("Client 2");
        user1.setBounds(20, 100, 230, 30);
        user1.setBackground(new Color(191, 4, 54));
        user1.setForeground(Color.WHITE);
        user1.addActionListener(this);
        user1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        p2.add(user1);
        
        /*user1.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent ae) 
            {
                new Client0(" #client 1");
            }
        });*/
        
        // client 3
        JButton user2 = new JButton("Client 3");
        user2.setBounds(20, 150, 230, 30);
        user2.setBackground(new Color(191, 4, 54));
        user2.setForeground(Color.WHITE);
        user2.addActionListener(this);
        user2.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        p2.add(user2);
        
        /*user2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                new Client0();
            }
        });*/
        
        /*JButton send = new JButton("User 0");
        send.setBounds(20, 50, 230, 30);
        send.setBackground(new Color(191, 4, 54));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        p2.add(send);*/
        
        f.setSize(450, 700);
        f.setLocation(500, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(new Color(186, 189, 191));

        f.setVisible(true);
    }


    public static void main(String[] args) {
        UserLists one = new UserLists();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
