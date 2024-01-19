package com.test.question;

import java.util.Calendar;

public class Q094 {

	public static void main(String[] args) {

		Bugles snack = new Bugles();

		snack.setSize(500);
		snack.setCreationTime("2024-01-10");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();

		Bugles snack2 = new Bugles();

		snack2.setSize(300);
		snack2.setCreationTime("2024-01-02");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();

	}// main

}// Q094

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	// getter, setter 구현

	
	public void setSize(int weight) {
		if(weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
			
			if (weight == 300) {
				this.price = 850;
				this.expiration = 7;
			} else if (weight == 500) {
				this.price = 1200;
				this.expiration = 10;
			} else if(weight == 850) {
				this.price = 1950;
				this.expiration = 15;
			}
		}
	}

	public int getPrice() {
		
		return price;
		
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}

//	public int getWeight() {
//		return weight;
//	}

//	public void setWeight(int weight) {
//		this.weight = weight;
//	}

//	public Calendar getCreationTime() {
//		return creationTime;
//	}

	public void setCreationTime(String date) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(Integer.parseInt(date.substring(0, 4))  //"2024-01-10"
				, Integer.parseInt(date.substring(5, 7)) - 1
				, Integer.parseInt(date.substring(8)));
		
		this.creationTime = c;
	}

	public int getExpiration() {
		
		Calendar now = Calendar.getInstance();
		return this.expiration - (int)((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
	}

//	public void setExpiration(int expiration) {
//		this.expiration = expiration;
//	}
	public void eat() {
		if(getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.\n");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
		}
		
	}
	
}