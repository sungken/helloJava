package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {

	public static void main(String[] args) {
		
		//ADT, Adstract Data Type(추상적 자료형)
		//- 배열 + 사용법 용도에 맞게 구현
		//- Stack
		//- Queue
		
		//Stack
		//- 후입선출
		//- LIFO, Last Input First Output
		//- 저장소에 나중에 들어간 요소가 먼저 나온다.
		//ex) 메모리 구조(Stack)
		//ex) 되돌리기(Ctrl + Z), 다시하기(Ctrl + Y) 등등
		//ex) 브라우저 > 뒤로가기, 앞으로 가기
		
		//Queue
		//- 선입선출
		//- FIFO, First Input Fitst ouput
		//- 저장소에 먼저 들어간 요소가 먼저 나온다.
		//ex) 식당주문, 줄서기 (순서가 있는 모든 목록~~)
		
		//m1(); //Stack
		//m2();
		//m3(); // Queue
		m4(); //Stack

	}// main

	private static void m4() {
		
		//배열 생성
		MyStack stack = new MyStack();

		System.out.println(stack);
		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		System.out.println(stack);
		

		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack);

		//개수
		System.out.println(stack.size());

		//확인
//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.size());
//
		//크기 조절
		stack.trimToSize();
//		System.out.println(stack.size());
//
//		//초기화
//		stack.clear();
//		System.out.println(stack.size());
		
	}

	private static void m3() {
		
		//배열 생성
		MyQueue queue = new MyQueue();

		System.out.println(queue);
		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		System.out.println(queue);

		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);

		//개수
		System.out.println(queue.size());
//
		//확인
		System.out.println(queue.peek());
		System.out.println(queue.size());
//
//		//크기 조절
//		queue.trimToSize();
//
		//초기화
		queue.clear();
		System.out.println(queue);
		System.out.println(queue.size());
		
		
	}// m3

	private static void m2() {
		
		//Queue
		//Queue<String> queue = new Queue<String>(); --> 사용 못함
		//Queue<String> queue = 자식 객체;
		Queue<String> queue = new LinkedList<String>(); // 문법이 조금 다름
		
		//1. 요소 추가하기
		//- boolean add(T value)
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		//2. 요소 개수 확인
		System.out.println(queue.size());
		
		//3. 요소 읽기 --> 선입선출
//		System.out.println(queue.poll()); //dequeue()
//		System.out.println(queue.size());
//
//		System.out.println(queue.poll()); 
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		while(queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		//4.요소 미리보기
		System.out.println(queue.peek());
		
	
		
	}// m2

	private static void m1() {
		
		//Stack
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가하기
		// T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		
		//2. 요소 개수
		//- int size()
		System.out.println(stack.size());
		
		//3. 요소 읽기
		//- T pop()
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());

		//System.out.println(stack.pop()); 
		
//		//3. 빈배열 확인
//		System.out.println(stack.isEmpty());
		
//		while(stack.size() > 0) {
//			System.out.println(stack.pop());
//		}
		
		//4. pop을 하면 가져올 메서드를 미리 보는 메서드
		System.out.println(stack.peek());

	}

}// Ex55_Stack








