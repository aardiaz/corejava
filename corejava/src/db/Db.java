package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. register driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.getConnection(url,username,password)
		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db8pm", "root", "1234");
		
		//================ insert sql ========================
//		String sql = "insert into user(username,password)values('rup','ppp9')";
//		Statement  stm = con.createStatement();
//		stm.execute(sql);
//		
//		con.close();
//		System.out.println("added success");
		
		//======================== select sql ========================
//		String sql = "select * from user";
//		Statement  stm = con.createStatement();
//		ResultSet  rs  = stm.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println("Id = "+rs.getInt("id"));
//			System.out.println("UserName = "+rs.getString("username"));
//			System.out.println("Password = "+rs.getString("password"));
//			System.out.println("=================");
//		}
		
		
		//================== update sql ================
//		String sql = "update user set password='test123' where id=2";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("update success");
		
		//=============== delete sql ==================
		String sql = "delete from user where id =  1";
		Statement stm = con.createStatement();
		stm.execute(sql);
		System.out.println("delete success");
		
		
	}

}
