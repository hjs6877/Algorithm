package kr.ac.korea.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Car serialObj = new Car("red", 1500);
		serialObj.go();
		System.out.println("write start..");
		
		FileOutputStream fos = new FileOutputStream("test.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serialObj);
		System.out.println("write complete!");
		
		System.out.println("read start..");
		FileInputStream fis = new FileInputStream("test.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car DeserialObj = (Car)ois.readObject();
		
		System.out.println("read complete!");
		
		DeserialObj.go();
		
		oos.close();
		ois.close();
	}
}
