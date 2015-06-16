package kr.ac.korea.designpattern.factorymethod;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessA {
	DatabaseFactory df = new DatabaseFactoryImpl();
	
	/**
	 * We can obtain object needed through DatabaseFactory which is delegated for creating Database object.
	 */
	Database db = df.getDatabase();
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
