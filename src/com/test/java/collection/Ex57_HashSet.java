package com.test.java.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex57_HashSet {

	public static void main(String[] args) {

		// Ex57_HashSet.java

		/*
		 
		 1. List 
		  - 순서가 있는 집합 
		  - 첨자(방번호) 
		  - 데이터 중복을 허용
		 
		 2. Map 
		 - 순서가 없는 집합 
		 - 키(방이름) 
		 - 데이터 중복을 허용
		 
		 3. Set 
		 - 순서가 없는 집합 
		 - 식별자가 없다.(방번호x, 방이름x) > 방을 구분할 수 없다. 
		 - 데이터 중복을 허용 않음(***)
		 
		 */

		// m1();
		m2();
		//m3();
		//m4();
		//m5();

	}// main

	private static void m5() {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		Random rnd = new Random();
		
		while (set.size() < 5) {
			set.add(rnd.nextInt(10) + 1);
		}
		
		System.out.println(set);
		
		
		
		
	}// m5

	private static void m4() { //*****************************************************************
		
		
		//***** 어려운 중요 예제
		//객체 배열
		HashSet<Member> set = new HashSet<Member>();
		//HashSet 은 중복 값이 들어갈수 없다.
		Member m1 = new Member("홍길동", 20);
		set.add(m1);
		
		set.add(new Member("아무개", 25));
		set.add(new Member("강아지", 3));
		set.add(new Member("고양이", 2));
		
		System.out.println(set.add(m1));
		
		set.add(new Member("홍길동", 20)); // 동일 인물로 처리하고 싶음
		System.out.println(set);
		System.out.println();
		
		Member m2 = new Member("유재석", 50);
		Member m3 = new Member("유재석", 50);
		
		System.out.println(m2 == m3); // 사용X
		System.out.println(m2.equals(m3)); // 사용O
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		
		
	}// m4

	private static void m3() {
		
		//마트 경품 추첨
		//- 중복 당첨 허용O
		//- 중복 당텀 허용X
		
		String[] list = {"홍길동", "아무개", "강아지", "고양이", "병아리", "사자", "호랑이", "독수리", "부엉이", "까치",  "햄스터"};
		
		Random rnd = new Random();
		
		ArrayList<String> result1 = new ArrayList<>();
		
		//중복 당첨 허용
		for(int i = 0; i < 5; i++) {
			result1.add(list[rnd.nextInt(list.length-1)]);
		}
		System.out.println(result1);
		
		
		
		HashSet<String> result2 = new HashSet<>();
		
		//중복 당첨 허용X
		while(result2.size() < 5) {
			result2.add(list[rnd.nextInt(list.length-1)]);
		}
		System.out.println(result2);
		
		
		
		
		
	}//m3

	private static void m2() {

		// 로또 번호 > 난수 + 유일 숫자들로만

		// Case 1.
		Random rnd = new Random();

		ArrayList<Integer> lotto = new ArrayList<>();

//		for (int i = 0; i < 6; i++) {
//
//			int n = rnd.nextInt(45) + 1;
//
//			// 기존 요소들과 중복 검사
//			if (check(lotto, n)) {
//				// 중복O
//				i--;
//			} else {
//				// 중복X
//				lotto.add(n);
//			}
//
//		}
		while (lotto.size() < 6) {

			int n = rnd.nextInt(45) + 1;

			// 기존 요소들과 중복 검사
			if (check(lotto, n)) {
				// 중복O
				//i--;
			} else {
				// 중복X
				lotto.add(n);
			}

		}

		System.out.println(lotto);
		Collections.sort(lotto);
		System.out.println(lotto);

		// Case 2.
		HashSet<Integer> lotto2 = new HashSet<>();

		while (lotto2.size() < 6) {

			int n = rnd.nextInt(45) + 1;
			lotto2.add(n);

		}

		System.out.println(lotto2);
		//Collections.sort(lott2);// set은 정렬이 불가능
		//Set > 변환 > List  or  List > 변환 > Set  
		ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2);
		//set 을 ArrayList로 변환해서 정렬
		Collections.sort(lotto3);
		System.out.println(lotto3);

	}

	private static boolean check(ArrayList<Integer> lotto, int n) {

		for (int i = 0; i < lotto.size(); i++) {
			if (lotto.get(i) == n) {
				return true;
			}
		}

		return false;
	}

	private static void m1() {

		HashSet<String> set = new HashSet<>();

		// 1. 요소 추가
		set.add("사과");
		System.out.println(set.add("딸기"));
		set.add("바나나");
		System.out.println(set.add("딸기"));

		// 2. 요소 개수
		System.out.println(set.size());
		System.out.println(set);
		System.out.println();

		// 3. 요소 읽기 > 방을 구분 불가능 > 원하는 요소 추출 불가능;;
		// - 읽기 도구 제공(**********) > iter == 향상된 for문

		Iterator<String> iter = set.iterator();

//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 루프 종료 == iterator 모두 소비(끝까지 탐색)
		// System.out.println(iter.next());

		// 새로운 반복기 생성
		iter = set.iterator();

		System.out.println(iter.next());

		for (String item : set) {
			System.out.println(item);
		}

		for (String item : set) {
			System.out.println(item);
		}

	}

}// Ex57_HashSet
