package com.test.question;

public class Q105 {

	public static void main(String[] args) {
		
		//배열 생성
		MyQueue queue = new MyQueue();

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
		
	}// main

}// Q105


class MyQueue { //모든 컬렉션이 배열을 쓰진 않는다.
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}// MyQueue()
	
	
	
public String toString() {
		
		String temp = "";
		
		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i=0; i<this.list.length; i++) {
			temp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		temp += "]\r\n";
		
		return temp;
	}// toString()

public boolean add(String s) {
	
	if (checkLength()) {
		doubleList();
	}
	
	this.list[this.index] = s;
	this.index++;
	
	return true;
}

private boolean checkLength() {
	
	if (this.index == this.list.length) {
		//방이 꽉찼다.
		return true;
	}
	
	//방이 남아있다.
	return false;
}

private void doubleList() {
	
	//기존 배열 > (복사+교체) > 새로운 배열
	String[] temp = new String[this.list.length * 2]; //새로운 배열
	
	//깊은 복사
	for (int i=0; i<this.list.length; i++) {
		temp[i] = this.list[i];
	}
	
	//** 교체
	this.list = temp;		
}



public String poll() {
	
	//무조건 (첫번째 방의)요소를 주세요!! == 선입선출
	String item = this.list[0];
	
	for(int i = 0; i < this.list.length - 2; i++) {
		this.list[i] = this.list[i+1];
	}
	this.index--;
	return item;
}



public int size() {
	return this.index;
}



public String peek() {
	
	return this.list[0];
}

public void clear() {
	
	this.index = 0;
	
}

public void trimToSize() {

	String[] temp = new String[this.index];

	for (int i = 0; i < this.index; i++) {
		temp[i] = this.list[i];
	}
	this.list = temp;
}

}// MyQueue