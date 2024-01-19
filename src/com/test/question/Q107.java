package com.test.question;

public class Q107 {

	public static void main(String[] args) {
		
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");
		System.out.println(map);

//		//읽기
//		System.out.println(map.get("국어"));
//		System.out.println(map.get("영어"));
//		System.out.println(map.get("수학"));
//
//		//개수
//		System.out.println(map.size());
//
//		//수정
//		map.put("영어", "합격");
//		System.out.println(map.get("영어"));
//
//		//삭제
//		map.remove("영어");
//		System.out.println(map.get("영어"));
//
//		//검색(key)
//		if (map.containsKey("국어")) {
//		      System.out.println("국어 점수 있음");
//		} else {
//		      System.out.println("국어 점수 없음");
//		}
//
//		//검색(value)
//		if (map.containsValue("합격")) {
//		      System.out.println("합격 과목 있음");
//		} else {
//		      System.out.println("합격 과목 없음");
//		}
//
//		//초기화
//		map.clear();
//		System.out.println(map.size());
		
		
	}// main

}// Q107

class MyHashMap{
	
	private String[] listOne;
	private String[] listTwo;
	private int index; 
	
	
	
	public MyHashMap() {
		this.listOne = new String[4];
		this.listTwo = new String[4];
		this.index = 0;
	}// MyHashMap
	
	public void put(String s1, String s2) {
		
		if(checkLength()) {
			addList();
		}
		this.listOne[this.index] = s1;
		this.listTwo[this.index] = s2;
		this.index++;
		
	}// put
	
	
	
	
	
	private void addList() {
		
//		String[] temp = new String[this.list.length * 2]; // 새로운 배열
//		// 깊은 복사
//		for (int i = 0; i < this.list.length; i++) {
//			temp[i] = this.list[i];
//		}
//		// ** 교체
//		this.list = temp;
		
		String[] add1 = new String[this.listOne.length * 2];
		String[] add2 = new String[this.listTwo.length * 2];
		for(int i = 0; i < this.listOne.length; i++) {
			add1[i] = this.listOne[i];
		}
		for(int i = 0; i < this.listTwo.length; i++) {
			add2[i] = this.listTwo[i];
		}
		
		this.listOne = add1;
		this.listOne = add2;
	}

	private boolean checkLength() {
		
		if(this.index == this.listOne.length) {
			return true;
		}
		return false;
	}// checkLength

	public String toString() {

		String temp1 = "";
		String temp2 = "";
		String temp3 = "";

		temp1 += String.format("length: %d\r\n", this.listOne.length);
		temp2 += String.format("length: %d\r\n", this.listTwo.length);
		temp3 += String.format("index: %d\r\n", this.index);
		temp1 += "[\r\n";
		for (int i = 0; i < this.listOne.length; i++) {
			temp1 += String.format("   %d: %s\r\n", i, this.listOne[i]);
			temp2 += String.format("   %d: %s\r\n", i, this.listTwo[i]);
		}
		temp2 += "]\r\n";

		return temp1 + temp2 + temp3;
	}// toString()

	
	
}// MyHashMap



