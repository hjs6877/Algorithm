package kr.ac.korea.designpattern.factorymethod;

import java.sql.Connection;

public interface Database {
	public Connection getConnection();
}
