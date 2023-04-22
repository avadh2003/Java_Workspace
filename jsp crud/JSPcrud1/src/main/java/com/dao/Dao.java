package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Model;
import com.mysql.jdbc.ResultSet;

public class Dao 
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
	
	public static int savedata(Model m)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into manager(fname,lname,email,password) values (?,?,?,?)");
			 ps.setString(1, m.getFname());
			 ps.setString(2, m.getLname());
			 ps.setString(3, m.getEmail());
			 ps.setString(4, m.getPassword());
	
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public static Model login(Model m)
	{		
		Model obj = null;

		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from manager where email=? and password=?");
			
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
		
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			if (rs.next()) 
			{
				obj = new Model();
				obj.setFname(rs.getString("fname"));
				obj.setLname(rs.getString("lname"));
				obj.setEmail(rs.getString("email"));
				obj.setPassword(rs.getString("password"));

			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
		
	}
	
}
