package kr.ac.korea.serialize;

import java.io.Serializable;

public class Car implements Serializable {
	String color;
	transient int cc;
	
	public Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
	public void go(){
		System.out.println(color + " going");
		System.out.println(cc + " speeding");
	}
	
	
}
