package task_15_3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test1 implements ActionListener 
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public Test1() 
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		btn1 = new JButton("INSERT");
		btn2 = new JButton("VIEW");
		btn3 = new JButton("UPDATE");
		btn4 = new JButton("DELDTE");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Test1();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		AllOperations a = new AllOperations();
		if(e.getSource()==btn1)
		{
			a.insertdata();
		}
		if(e.getSource()==btn2)
		{
			a.viewdata();
		}
		if(e.getSource()==btn3)
		{
			
		}
		if(e.getSource()==btn4)
		{
			
		}
			
	}
	class AllOperations
	{
		JFrame insertframe;
		JTextField tf1,tf2,tf3;
		JButton insert1;
		
		public void insertdata()
		{
			insertframe = new JFrame();
			
			tf1 = new JTextField(20);
			tf2 = new JTextField(20);
			tf3 = new JTextField(20);
			insert1 = new JButton("INSERT DATA");
			
			insert1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					String laptop_name = tf1.getText().toString().toUpperCase();
					String price = tf2.getText().toString();
					String rating = tf3.getText().toString();
					
					String host = "jdbc:mysql://localhost:3306/";
					String db = "gada_electronics";
					String url = host+db;
					
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","");
						String sql ="insert into details values (null,'"+laptop_name+"','"+price+"','"+rating+"')";
						Statement stmt = con.createStatement();
						int status = stmt.executeUpdate(sql);
						
						if(status>0)
						{
							insertframe.setVisible(false);
						}else
						{
							System.out.println("Error");
						}
					} catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
			
			insertframe.add(tf1);
			insertframe.add(tf2);
			insertframe.add(tf3);
			insertframe.add(insert1);
			
			insertframe.setSize(400,400);
			insertframe.setLayout(new FlowLayout());
			insertframe.setVisible(true);
			
		}
		
	public void viewdata()
	{
		String host = "jdbc:mysql://localhost:3306/";
		String db = "gada_electronics";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql = "select * from details";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			System.out.println("\t ID \t Laptop Name \t Price \t Rating");
			while(set.next())
			{
				int id = set.getInt(1);
				String laptop_name = set.getString(2);
				int price = set.getInt(3);
				int rating = set.getInt(3);
			
				
				System.out.println("\t"+id+" \t "+laptop_name+" \t "+price+ "\t" +rating);
			}
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
}
