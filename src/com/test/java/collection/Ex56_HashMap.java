package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex56_HashMap {

	public static void main(String[] args) {
		
		//아래 두개만 공부해도 가장 활용도가 좋다.
		//List > ArrayList
		//Map > HashMap
		
		//ArrayList
		//- 요소 접근 > 첨자(index) 사용 > 방번호
		//- 순서가 있는 집합(방번호 == 요소의 순서)
		//ex) 1강의실, 2강의실, 3강의실
		//- 스칼라 배열(Scalar array)
		//- 요소 = 첨자(index) + 값(value)
		//- 첨자(index)는 유일하다. 
		//- 값(value)은 중복이 가능하다. > 방번호가 유일해서 가능

		
		//HashMap
		//- 요소 접근 > 키(Key) 사용 > 방이름
		//- 순서가 없는 집합 (방 번호가 없어서)
		//ex) 햇님반, 달님반, 별님반
		//- 연관 배열, 사전 구조(Dictionary)
		//- 요소 = 키(key) + 값(value)
		//- 키(key)가 유일하다.
		//- 값(value)은 중복이 가능하다. > 키가 유일하니까.
		
		//m1();
		//m2();
		m3();
		
		
		
	}// main

	private static void m3() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//loop 탐색 
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for (String item : keys) {
			System.out.println(item);
		}
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		for (String item : values) {
			System.out.println(item);
		}
		
		for (String item : keys) {
			System.out.printf("map.get(%s) = %s\n", item, map.get(item));
		}
		
		
		
	}// m3

	private static void m2() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//1. 요소 추가
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		//2. 요소 개수
		System.out.println(map.size());
		
		//3. 요소 읽기
		System.out.println(map.get("yellow"));
		System.out.println(map.get("green"));
		
		//4. 요소 수정
		map.put("blue", "퍼렁");
		System.out.println(map);
		
		//5. 요소 삭제
		map.remove("blue");
		System.out.println(map);
		
		//6. 검색
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("빨강"));
		
		//7. 초기화
		map.clear();
		System.out.println(map);
		
		
		
	}// m2

	private static void m1() {
		
		//학생 1명의 국어, 영어, 수학 점수 저장 > 집합?
		//1. 배열?
		//2. ArrayList?
		//3. Class?
		//4. HashMap?
		
		//1. 배열 
		//- 몇번째 방이 어떤 과목인지 인지하기 어렵다.
		int[] s1 = new int[3];
		
		s1[0] = 100;//국어
		s1[1] = 90;//영어
		s1[2] = 80;//수학
		System.out.println(s1[0] + s1[1] + s1[2]);
		
		//2. ArrayList
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		s2.add(100);
		s2.add(90);
		s2.add(80);
		System.out.println(s2.get(0) + s2.get(1) + s2.get(2));
		
		//3. Class
		//- 집합
		//- 방번호(x) > 이름 사용 > 가독성이 높아짐
		//- 클래스 선언 비용 발생
		Score s3 = new Score(100, 90, 80);
		System.out.println(s3.getTotal());
		
		//4. HashMap
		//- 집합
		//- 방이름 사용 > 
		HashMap<String,Integer> s4 = new HashMap<String, Integer>();
		
		s4.put("kor", 100);
		s4.put("eng", 90);
		s4.put("math", 80);
		
		System.out.println(s4.get("kor") + s4.get("eng") + s4.get("math"));
		
		s4.put("kor", 200);
		System.out.println(s4.get("kor"));
		
	}// m1

}// Ex56_HashMap

class Score{
	public int kor;
	public int eng;
	public int math;
	
	public Score() {
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
}
