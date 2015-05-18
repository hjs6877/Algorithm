package kr.ac.korea.design.factorymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseImpl implements Database {
	private Connection con;
	private Statement stmt;
	private ResultSet rset;
	
	public DatabaseImpl(){
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://55447970fc6b4d799b0000d1-soom.cloudsc.kr:44861/soomalgorithm?useUnicode=true&characterEncoding=utf8";
			con = DriverManager.getConnection(url, "soomalgorithm", "soomalgorithm");
			stmt = con.createStatement();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Connection getConnection(){
		return con;
	}
}	
