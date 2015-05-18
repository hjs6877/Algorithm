package kr.ac.korea.design.factorymethod;

import java.sql.Connection;

public interface Database {
	public Connection getConnection();
}
