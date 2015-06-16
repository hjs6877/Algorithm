package kr.ac.korea.designpattern.factorymethod;

public class DatabaseFactoryImpl implements DatabaseFactory {
	private Database db;
	
	@Override
	public Database getDatabase() {
		db = new DatabaseImpl();
		return db;
	}

}
