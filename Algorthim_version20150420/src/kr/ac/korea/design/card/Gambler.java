package kr.ac.korea.design.card;

import java.util.List;

public class Gambler {
	private int num;
	private String name;
	private long moneyTotal;
	private long moneyBetting;
	private List<Card> cardList;
	
	public Gambler(int num, String name, long money){
		this.num = num;
		this.name = name;
		this.moneyBetting = money;
	}
	
	
	/**
	 * Dealer로부터 Card를 받는다.
	 */
	public void setCardList(List<Card> list){
		this.cardList = list;
	}
	
	/**
	 * 배팅을 한다.
	 */
	public void doBetting(long money){
		this.moneyBetting = money;
	}
	
	/**
	 * 배팅 금액을 차감한다.
	 */
	public void payBettingMoney(){
		moneyTotal = moneyTotal - moneyBetting;
	}
	
	/**
	 * 배팅된 금액들을 가져온다.
	 */
	public void saveAllBettedMoney(int money){
		moneyTotal = moneyTotal + money;
	}
	
}
