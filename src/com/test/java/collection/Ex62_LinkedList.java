package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex62_LinkedList {

	public static void main(String[] args) {

		// Collection(I) < List(I) < ArrayList(C), LinkedList(C)

		// ArrayList vs LinkedList
		// - 메서드 구성 유사 > 사용법이 아주 유사하다.
		// - 내부 구조가 다르다. > 사용 용도가 다르다.

		// LinkedList 종류
		// 1. LinkedList
		// 2. Double LinkedList
		// 3. Double Circular LinkedList > 순환구조 > 자바의 LinkedList

		// 배열이나 ArrayList 는 중간에 삭제를 하면 Shift 가 발생하는데
		// 이것이 큰 프로그램일수록 엄청 좋지 않은 행동이다.
		// 중간에 끼어 넣거나 뺄일이 있으면 무조건 LinkedList가 좋다.

		// m1();
		m2();

	}// main

	private static void m2() {

		// ArrayList vs LinkedList 속도비교
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		long begin = 0, end = 0;

		// 1. 순차적으로 데이터 추가하기, Append
		System.out.println("[1. 순차적으로 데이터 추가하기, Append]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			list1.add(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %dms\n", end - begin);

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			list2.add(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %dms\n", end - begin);
		System.out.println();

		// 2. 중간에 데이처 추가하기, Insert > ArrayList
		System.out.println("[2. 중간에 데이처 추가하기, Insert]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			list1.add(0, i);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %dms\n", end - begin);

		// LinkedList
		begin = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			list2.add(0, i);
		}
		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %dms\n", end - begin);
		System.out.println();

		
		
		
		// 3. 중간에 데이터 삭제하기, Delete
		System.out.println("[3. 중간에 데이터 삭제하기, Delete]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list1.remove(0);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %dms\n", end - begin);

		// LinkedList
		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list2.remove(0);
		}
		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %dms\n", end - begin);
		System.out.println();
		
		
		
		
		//4. 순차적으로 삭제하기
		System.out.println("[4. 순차적으로 삭제하기]");

		begin = System.currentTimeMillis();

		for (int i = list1.size() - 1; i >= 0; i--) {
			list1.remove(i);
		}

		end = System.currentTimeMillis();

		System.out.printf("ArrayList 작업 시간: %dms\n", end - begin);

		// LinkedList
		begin = System.currentTimeMillis();

		for (int i = list2.size() - 1; i >= 0; i--) {
			list2.remove(i);
		}
		end = System.currentTimeMillis();

		System.out.printf("LinkedList 작업 시간: %dms\n", end - begin);
		System.out.println();

	}// m2

	private static void m1() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list1.add(100);
		list1.add(200);
		list1.add(300);

		list2.add(100);
		list2.add(200);
		list2.add(300);

		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println();

		System.out.println(list1);
		System.out.println(list2);
		System.out.println();

		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		System.out.println();

		for (int n : list1) {
			System.out.println(n);
		}
		System.out.println();
		for (int n : list2) {
			System.out.println(n);
		}
		// ArrayList vs LinkedList 여기까지는 사용법이 완전 똑같다.

	}// m1

}// Ex62_LinkedList
