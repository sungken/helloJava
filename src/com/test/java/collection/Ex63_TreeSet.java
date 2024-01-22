package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {

	public static void main(String[] args) {
		
		/*
		 컬렉션 이름
		 
		 [물리구조]  	[사용법=인터페이스]
		 Array 			+ List
		 Lingked 		+ List
		 
		 Hash 			+ Set (정렬이 안됌)
		 Tree 			+ Set (정렬이 가능)
		 
		 Hash 			+ Map
		 Tree 			+ Map
		 
		 TreeSet
		 - 순서가 없다.
		 - 중복값을 가지지 않는다.
		 - 이진 탐색 트리 구조, Biary Sarch Tree
		 - 내부 데이터가 정렬이 되어있는 구조로 저장.
		 
		 */
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<String> set2 = new TreeSet<String>();
		
		set.add(6);
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(1);
		set.add(9);
		set.add(3);
		set.add(4);
		set.add(10);
		set.add(7);
		
		set2.add("나");
		set2.add("하");
		set2.add("가");
		set2.add("바");
		set2.add("마");
		set2.add("라");
		set2.add("다");
		
		System.out.println(set);
		System.out.println(set2);
		
		//범위 관련 기능 제공(= List 계열이 할 수 있음음)
		System.out.println(set.first());
		System.out.println(set.last());
		
		//범위: 시작위치(포함) ~ 끝 위치 (미포함)
		System.out.println(set.headSet(3)); // 3을 찾아서 그 이하 출렷
		System.out.println(set.tailSet(7)); // 7을 찾아서 그 이상 출력
		System.out.println(set.subSet(3, 7)); // 3부터 7 아래까지 찾아서 출력
		
		System.out.println(set2.headSet("다")); // 문자열도 가능
		System.out.println(set2.tailSet("마"));
		System.out.println(set2.subSet("나", "바")); // 나부터 하 아래까지 찾아서 출력
		
		//HashSet & Tree > iterator, 향상된 for문
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for ( int n : set) {
			System.out.println(n);
		}
		
		//Set 사용
		//- HashSet vs TreeSet > HashSet
		//- 둘다 사용법이 같기에 중요하니까 자세히 보기 
		//- 특히 HashSet 위주로 보기***********
		
		
		
	}// main

}// Ex63_TreeSet
