package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {

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
		 
		 TreeMap
		 - 이진 탐색 트리 > 내부 정렬
		 - 키 + 값
		 - 
		 
		 */
		
		TreeMap<String, String> map = new TreeMap<>();
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("yello", "노랑");
		
		System.out.println(map); // 키 값으로 자동 정렬
		
		System.out.println(map.get("white")); // 가져오기
//		System.out.println(map.get("흰색")); // 앞쪽 키 갑만 입력 가능
		
		System.out.println(map.firstKey()); // 정렬 첫번째 값 출력
		System.out.println(map.lastKey()); //  정렬 마지막 값 출력
		
		System.out.println(map.firstEntry()); // 정렬 첫번째 값 + Key 출력
		System.out.println(map.lastEntry()); //  정렬 마지막 값 + Key 출력
		
		System.out.println(map.headMap("c")); // 알파벳 순서 c 이전으로 정렬값 출력
		System.out.println(map.tailMap("m")); // 알파벳 순서 m 이후로 정렬값 출력
		System.out.println(map.subMap("r", "w")); // 알파벳 순수 r과 w 사이의 값 출력
		
		
	}// main

}// Ex64_TreeMap
