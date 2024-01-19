package com.test.java.obj;

public class Ex34_Access {

	public static void main(String[] args) {
		
		Monitor m1 = new Monitor();
		
		//자바에서..
		//public 변수 > Field(필드)
		//Getter + Setter > Property(프로퍼티)
		
		
		m1.setModel("TG200");//쓰기
		System.out.println(m1.getModel());//읽기
		
		
		//m1.setSize();
		System.out.println(m1.getSize());
		
		m1.setPrice(30000);//쓰기 전용 프로퍼티
		//System.out.println(m1.getPrice);
		
		//가상 프로퍼티 or 계산된 프로퍼티
		System.out.println(m1.getLevel());
		
	}//main

}
