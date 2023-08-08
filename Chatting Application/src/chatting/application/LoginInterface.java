package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoginInterface extends JFrame implements ActionListener{
    private JLabel usernameLabel, passwordLabel, errorLabel,vast;
    private JTextField usernameTextField, passwordTextField;
    private JButton loginButton;
    private JButton cancelButton;

    public LoginInterface() {
        // Set up the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 700);
        getContentPane().setBackground(Color.GRAY);
        setTitle("Login Interface");

        // Add a JPanel to the JFrame
        JPanel panel = new JPanel();
        panel.setBackground( Color.red);
        panel.setLayout(null);
        add(panel);
        
        vast=new JLabel("<html><h1 align=center><b>WELCOME TO VATS<b></h1></html>");
        vast.setBounds(70,100,300,150);
        vast.setBackground(new Color(186,189,191));
        panel.add(vast);

        // Add JLabels and JTextFields for username and password input
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 230, 80, 25);
        usernameLabel.setBackground(new Color(186,189,191));
        panel.add(usernameLabel);

        usernameTextField = new JTextField(20);
        usernameTextField.setBounds(140, 230, 165, 25);
        panel.add(usernameTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 280, 80, 25);
        panel.add(passwordLabel);

        passwordTextField = new JPasswordField(20);
        passwordTextField.setBounds(140, 280, 165, 25);
        panel.add(passwordTextField);

        // Add a JButton for the login action
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 330, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // Add an error label for showing login failures
        errorLabel = new JLabel("");
        errorLabel.setForeground(new Color(191,4,54));
        errorLabel.setBounds(50, 540, 330, 25);
        panel.add(errorLabel);
        
        cancelButton = new JButton("Login");
        cancelButton.setBounds(150, 330, 80, 25);
        cancelButton.addActionListener(this);
        panel.add(cancelButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve input values
        
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        // Query the MySQL database
        if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both username and password.");
            }
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Aakash@1");
            System.out.println("connected");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM logpage WHERE username = ? AND password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                
                resultSet.close();
                        preparedStatement.close();
                        connection.close();
                        dispose();
                
                new Server();
            } else {
                resultSet.close();
                        preparedStatement.close();
                        connection.close();
                        JOptionPane.showMessageDialog(this, "Invalid username or password.");
                //errorLabel.setText("Invalid username or password.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public static void main(String[] args) {
        new LoginInterface();
    }
}