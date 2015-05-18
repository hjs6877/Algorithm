package kr.ac.korea.design.factorymethod;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Business {
	DatabaseImpl db = new DatabaseImpl();
	Connection con = db.getConnection();
	
	public void insert(String id, String code, int quality){
		String query = "INSERT INTO PRODUCT VALUES ( " + id + ", " + code + ", " + quality + ")";
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
