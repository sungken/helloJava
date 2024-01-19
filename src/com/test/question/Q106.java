package com.test.question;

public class Q106 {

	public static void main(String[] args) {
		
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();
		System.out.println(stack);

		//초기화
		stack.clear();
		System.out.println(stack.size());
		
	}// main

}// Q106


class MyStack {

	private String[] list;
	private int index;

	public MyStack() {
		this.list = new String[4];
		this.index = 0;

	}

	public void clear() {
		
		this.index = 0;
	}

	public String toString() {

		String temp = "";

		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		temp += "]\r\n";

		return temp;
	}// toString()

	public boolean push(String s) {

		if (checkLength()) {
			doubleList();
		}

		this.list[this.index] = s;
		this.index++;

		return true;

	}

	private void doubleList() {

		// 기존 배열 > (복사+교체) > 새로운 배열
		String[] temp = new String[this.list.length * 2]; // 새로운 배열

		// 깊은 복사
		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		// ** 교체
		this.list = temp;

	}

	private boolean checkLength() {

		if (this.index == this.list.length) {
			// 방이 꽉찼다.
			return true;
		}
		// 방이 남아있다.
		return false;
	}

	public String pop() {

		String item = this.list[index - 1];

		this.list[index - 1] = null;
		
		this.index--;
		
		return item;

	} // pop

	public int size() {

		return this.index;

	}// size

	public String peek() {

		return this.list[this.index - 1];
	}

	public void trimToSize() {

		String[] temp = new String[this.index];

		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;

	}

}// MyStack()