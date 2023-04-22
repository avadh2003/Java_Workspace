package com.dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.model1.Model1;
import com.mysql.jdbc.ResultSet;

public class Dao1
{
	public static Connection getconnect()
	{
		Connection con = null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return con;		
	}
	
	
	public static int savedata1(Model1 m1)
	{
		int status = 0;
		
		Connection con = Dao1.getconnect();
		
		try
		{
			PreparedStatement ps = con.prepareStatement("insert into employee(name,email,address,phone) values(?,?,?,?)");
			
	
			ps.setString(1, m1.getName());
			ps.setString(2, m1.getEmail());
			ps.setString(3, m1.getAddress());
			ps.setString(4, m1.getPhone());
			
			status = ps.executeUpdate();
		}
			catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
		
	}
	
	public static List<Model1> viewdata1()
	{
		
		List<Model1>list = new ArrayList<Model1>();
		Connection con = Dao.getconnect();
		
		try
		{
			PreparedStatement ps = con.prepareStatement("Select * from employee ");
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String address = rs.getString(4);
				String phone = rs.getString(5);
				
				Model1 m1 = new Model1();
				m1.setId(id);
				m1.setName(name);
				m1.setEmail(email);
				m1.setAddress(address);
				m1.setPhone(phone);
				
				list.add(m1);
	
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static void deletedata(int id)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("delete from register where id =?");
			 ps.setInt(1,id);
			
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Model1 editdata(int id)
	{
		Model1 m1=new Model1();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("select * from e where id =?");
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				
				m1.setId(id2);
				m1.setName(name);
				m1.setEmail(email);
				m1.setPhone(phone);
				m1.setAddress(address);
			}
			 
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m1;
	}
	
	public static int updatedata(Model1 m1)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("update register set name=? , email =?, address=? , phone =?  where id =?");
		
			ps.setString(1, m1.getName());
			ps.setString(2, m1.getEmail());
			ps.setString(3, m1.getAddress());
			ps.setString(4, m1.getPhone());
			ps.setInt(5,m1.getId());
	
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
	
