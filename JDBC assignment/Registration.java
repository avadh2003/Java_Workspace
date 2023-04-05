package registrationform;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class Registration implements ActionListener
{
	JFrame frame;
	JLabel main,l1,l2,l3,bg;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	
	public Registration() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("Registration Form");
		main = new JLabel("NEW STUDENT REGISTRATION");
		l1 = new JLabel("Name");
		l2 = new JLabel("Mobile No");
		l3 = new JLabel("division");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("ADD");
		b2 = new JButton("EDIT");
		b3 = new JButton("DELETE");
		b4 = new JButton("REFRESS");
		bg = new JLabel(new ImageIcon("F:\\photos\\student.png") );
		table = new JTable();
		
		frame.add(main);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(bg);
		
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		main.setBounds(230, 17, 446, 44);
		main.setFont(new Font("Courier", Font.BOLD, 30));
		l1.setBounds(29, 132, 146, 18);
		l1.setFont(new Font("Monospaced", Font.BOLD, 18));
		l2.setBounds(29, 176, 146, 18);
		l2.setFont(new Font("Monospaced", Font.BOLD, 18));
		l3.setBounds(29, 223, 146, 18);
		l3.setFont(new Font("Monospaced", Font.BOLD, 18));
		t1.setBounds(146, 129, 140, 23);
		t2.setBounds(146, 173, 140, 23);
		t3.setBounds(146, 220, 140, 23);
		b1.setBounds(29, 284, 89, 23);
		b2.setBounds(172, 284, 89, 23);
		b3.setBounds(29,335 , 89, 23);
		b4.setBounds(172, 335, 89, 23);
//		table.setBounds(512, 100, 379, 312);
		bg.setSize(1030,500);
		ImageIcon img = new ImageIcon("F:\\photos\\icon.jpg");
		frame.setIconImage(img.getImage());
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 100, 355, 283);
		frame.add(panel);

		JScrollPane sc = new JScrollPane();
		sc.setBounds(650, 100, 450, 312);
		frame.add(sc);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"grno", "name", "mobileno", "division"
				}
			) {
				Class[] columnTypes = new Class[] {
					Integer.class, String.class, double.class, String.class
				};
				public Class getColumnClass(int columnIndex) 
				{
					return columnTypes[columnIndex];
				}
			});
			sc.setViewportView(table);			
			
		frame.setLayout(null);
		frame.setSize(1130,500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Registration();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		Alloperation a = new Alloperation();
		
		if(e.getSource()==b1)
		{
			a.adddata();
		}
		if(e.getSource()==b2)
		{
			
		}
		if(e.getSource()==b3)
		{
			
		}
		if(e.getSource()==b3)
		{
//			a.refressdata();
		}
	}
	
	
	class Alloperation
	{
	
		private void showdata() 
		{
			// TODO Auto-generated method stub
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
						
				}
			});
			
		}	
		
		private void adddata() 
		{
			// TODO Auto-generated method stub
			b1.addActionListener(new ActionListener() 
			{
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					String host = "jdbc:mysql://localhost:3306/";
					String db = "registration";
					String url = host+db;
					
//					String name = t1.getText().toString().toUpperCase();
//					String mobileno = t2.getText().toString();
//					String division = t3.getText().toString();
//					
					String name = t1.getText().toString().toUpperCase();
					String mobileno  =t2.getText().toString();
					String division = t3.getText().toString();
					
					try
					{
						getClass().forName("com.mysql.jdbc.Driver");
						Connection con = (Connection) DriverManager.getConnection(url,"root","");
						String sql = "insert into student_registration values (null,'"+name+"','"+mobileno+"','"+division+"')";
						Statement stmt = (Statement) con.createStatement();
						int status = stmt.executeUpdate(sql);
						
						
						if(status>0)
						{
							JOptionPane.showMessageDialog(frame, "Record Addedd");
							t1.setText("");
							t2.setText("");
							t3.setText("");
							t1.requestFocus();
							
							
						}else
						{
							System.out.println("Error");
						}
					} 
					catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
				
			});
		}
		
		/*private void refressdata() 
		{
			
			// TODO Auto-generated method stub
			b4.addActionListener(new ActionListener() 
			{
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// TODO Auto-generated method stub
					String host = "jdbc:mysql://localhost:3306/";
					String db = "registration";
					String url = host+db;
					
					String name = t1.getText().toString().toUpperCase();
					String mobileno = t2.getText().toString();
					String division = t3.getText().toString();
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = (Connection) DriverManager.getConnection(url,"root","");
						String sql = "select * from student_registration";
						Statement stmt = (Statement) con.createStatement();
						ResultSet set = (ResultSet) stmt.executeQuery(sql);
						ResultSetMetaData RSMD = (ResultSetMetaData) set.getMetaData();
						
						int c = RSMD.getColumnCount();
						DefaultTableModel df = (DefaultTableModel)table.getModel();
						df.setRowCount(0);
						
						while(set.next())
						{
							Vector v2 = new Vector<>();
							for(int a=1;a<=c;a++)
							{
								v2.add(set.getString("grno"));
								v2.add(set.getString("name"));
								v2.add(set.getString("mobileno"));
								v2.add(set.getString("division"));
							
							}
							df.addRow(v2);
						}
						
					} 
						catch (Exception e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
				
			});
		}	
			*/
			
		
		
		
		
	}
}
