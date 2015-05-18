package kr.ac.korea.design.factorymethod;

public class DatabaseFactoryImpl implements DatabaseFactory {
	private Database db;
	
	@Override
	public Database getDatabase() {
		db = new DatabaseImpl();
		return db;
	}

}
