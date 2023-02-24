package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cafe extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JLabel l1;
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton b1;
	
	
	public Cafe() 
	{
		
		frame =new JFrame();
		
		c1 =new JCheckBox("Black coffee @ rs. 200");
		c1.setBounds(172, 120, 197, 23);
		
		c2 =new JCheckBox("Green tea @ rs. 100");
		c2.setBounds(172, 160, 197, 23);
		
		c3 =new JCheckBox("Regular tea @ rs. 50");
		c3.setBounds(172, 200, 197, 23);
		
		c4 =new JCheckBox("Special tea @ rs. 120");
		c4.setBounds(172, 240, 197, 23);
		
		c5 =new JCheckBox("Cappuccino @ rs. 250");
		c5.setBounds(172, 280, 197, 23);
		
		c6 =new JCheckBox("Arabica @ rs. 200");
		c6.setBounds(172, 320, 197, 23);
		
		b1 =new JButton("PLACE YOUR ORDER");
		b1.setBounds(172, 360, 189, 23);
		
		l1=new JLabel("COSMO CAFE");
		l1.setBounds(195, 80, 146, 14);
		
		frame.add(l1);
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(c4);
		frame.add(c5);
		frame.add(c6);
		frame.add(b1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		b1.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new Cafe();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		StringBuilder builder =new StringBuilder("");
		builder.append("\n your order  \n");
		
		int amount = 0;
		
		if(e.getSource()==b1)
		{
			if(c1.isSelected())
			{
				builder.append("\n Black coffee @ rs. 200");
				amount+=200;
			}
			if(c2.isSelected())
			{
				builder.append("\n Green tea @ rs. 100");
				amount+=100;
			}
			if(c3.isSelected())
			{
				builder.append("\n Regular tea @ rs. 50");
				amount+=50;
			}if(c4.isSelected())
			{
				builder.append("\n Special tea @ rs. 120");
				amount+=120;
			}
			if(c5.isSelected())
			{
				builder.append("\n Cappuccino @ rs. 250");
				amount+=250;
			}
			if(c6.isSelected())
			{
				builder.append("\n Arabica @ rs. 200");
				amount+=200;
			}
			
			builder.append("\n Total :"+amount);
			
			JOptionPane.showMessageDialog(frame, builder.toString());
		}
		
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		super.windowClosing(e);
		
		int select = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(select==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(select==JOptionPane.NO_OPTION)		
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		if(select==JOptionPane.CANCEL_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
	}
}
	