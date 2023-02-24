package cafeProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends WindowAdapter implements ActionListener
{

	JFrame frame;
	JLabel l,l1,l2;
	JTextField t1,t2;
	JPasswordField p1;
	JButton b1,b2;
	JCheckBox c1;
	JOptionPane showMessageDialog;
	public LoginPage()
	{
		
		frame = new JFrame();
		
		l = new JLabel("Login Page");
		l.setBounds(180, 28, 138, 29);
		
		l1 = new JLabel("Username");
		l1.setBounds(89, 97, 94, 14);
		
		l2 = new JLabel("Password");
		l2.setBounds(89, 136, 86, 14);
		
		t1 = new JTextField();
		t1.setBounds(210, 94, 120, 20);
		
		p1 = new JPasswordField();
		p1.setBounds(210, 133, 120, 20);
		
		c1 = new JCheckBox("show password");
		c1.setBounds(151, 166, 197, 23);
		
		b1 = new JButton("Login");
		b1.setBounds(89, 196, 89, 23);
		
		b2 = new JButton("Reset");
		b2.setBounds(241, 196, 89, 23);
			
		
		frame.add(l);
		frame.add(l1);
		frame.add(l2);
		frame.add(t1);
		frame.add(p1);
		frame.add(c1);
		frame.add(b1);
		frame.add(b2);
		frame.setTitle("Login Form");
		frame.setSize(450,300);
		frame.setLayout(null);
		frame.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		c1.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new LoginPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		 if (e.getSource() == b1)
		 {
	            String userText;
	            String pwdText;
	            userText = t1.getText().toString();
	            pwdText = p1.getPassword().toString();
	            if (userText.equals("avadh") && pwdText.equals("2003")) 
	            {
	                JOptionPane.showMessageDialog(frame, "Login Successful");
	            } else 
	            {
	                JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
	            }
	 
	        }
	        // RESET button
	        if (e.getSource() == b2) 
	        {
	            t1.setText("");
	            p1.setText("");
	        }
	       // showPassword 
	        if (e.getSource() == c1)
	        {
	            if (c1.isSelected()) 
	            {
	                p1.setEchoChar((char) 0);
	            }
	            else 
	            {
	                p1.setEchoChar('x');
	            }
	        }
	        
	}
	
		public void windowClosing(WindowEvent e)
		{
			
			super.windowClosing(e);
			int a = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
			
			if(a==JOptionPane.YES_OPTION)
			{
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			if(a==JOptionPane.NO_OPTION)
			{
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
			if(a==JOptionPane.CANCEL_OPTION)
			{
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
	
		}
	
}