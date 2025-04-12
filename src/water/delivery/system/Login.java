
package water.delivery.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JLabel head ,middle ,Email ,Pass;
    JTextField Emailtext;
    JButton Submit,Signup;
    JPasswordField Passwordtext;
    Login(){
        setTitle("WATER DELIVERY SYSTEM");
        
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(50, 10, 200, 100);
        add(l11);
        
        head = new JLabel("WELCOME TO WATER APP LOGIN");
        head.setFont(new Font("Osward", Font.BOLD, 38));
        head.setBounds(320,40,800,40);
        add(head);
        
        middle = new JLabel("Please provide email/phone and password to login");
        middle.setFont(new Font("Osward", Font.BOLD, 38));
        middle.setBounds(120,200,1000,40);
        add(middle);
        
        Email = new JLabel("Email/Phone :");
        Email.setFont(new Font("Osward", Font.BOLD, 38));
        Email.setBounds(180,300,800,40);
        add(Email);
        
        Emailtext = new JTextField();
        Emailtext.setBounds(500,300,400,40);
        Emailtext.setFont(new Font("Arial", Font.BOLD, 14));
        add(Emailtext);
        
        Pass = new JLabel("Password      :");
        Pass.setFont(new Font("Osward", Font.BOLD, 38));
        Pass.setBounds(180,350,800,40);
        add(Pass);
        
        Passwordtext = new JPasswordField();
        Passwordtext.setBounds(500,350,400,40);
        Passwordtext.setFont(new Font("Arial", Font.BOLD, 14));
        add(Passwordtext);
        
        Submit = new JButton("Submit");
        Submit.setFont(new Font("Osward", Font.BOLD, 38));
        Submit.setBackground(Color.black);
        Submit.setForeground(Color.white);
        Submit.setBounds(500,420,400,60);
        Submit.addActionListener(this);
        add(Submit);
        
        Signup = new JButton("New here ? Signup");
        Signup.setFont(new Font("Osward", Font.BOLD, 38));
        Signup.setBackground(Color.black);
        Signup.setForeground(Color.white);
        Signup.setBounds(400,520,600,40);
        Signup.addActionListener(this);
        add(Signup);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){

        if  (ae.getSource()==Signup){
            Emailtext.setText("Email id to be entered");
    }   else if(ae.getSource()==Submit){
            Emailtext.setText("Email id/Password to be entered");
    }
    }
    public static void main (String args[]){
        new Login();
    }
}
