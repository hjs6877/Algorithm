package kr.ac.korea.design.card;

public class Card {
	private int type;
	private int number;
	
	public Card(int type, int number) {
		this.type = type;
		this.number = type;
	}

	
	public static class Builder {
		private int type;
		private int number;
		
		public Builder withType(int type){
			this.type = type;
			return this;
		}
		
		public Builder withNumber(int number){
			this.number = number;
			return this;
		}
		
		public Card build(){
			return new Card(type, number);
		}
	}
}
