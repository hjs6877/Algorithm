package kr.ac.korea.datastructure.hashtable;

public class Student {
	private int id;
	private String name;
	private int grade;
	
	private Student(int id, String name, int grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public static class Builder{
		private int id;
		private String name;
		private int grade;
		
		public Builder withId(int id){
			this.id = id;
			return this;
		}
		
		public Builder withName(String name){
			this.name = name;
			return this;
		}
		
		public Builder withGrade(int grade){
			this.grade = grade;
			return this;
		}
		
		public Student build(){
			return new Student(id, name, grade);
		}
	}
}
