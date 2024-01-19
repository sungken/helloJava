package com.test.java.collection;

import java.util.ArrayList;
import java.util.Random;

public class Ex54_ArrayList {

	public static void main(String[] args) {

		// 배열 + 컬렉션 + 제어문 + 클래스

		// 컬렉션, Collection
		// - JCF, Java Collecrtion Framework
		// - (향상된) 배열
		// - 향상?
		// 1. 성능 향상
		// 2. 사용법 향상
		// 3. 길이 가변 > 배열의 길이가 늘었다 줄었다 가능

		// 컬렉션 종류
		// 1. List 계열
		// - ArrayList (*****)중요
		// - LinkedList
		// - Queu
		// - Stck
		// - Vector ( - )별로

		// 2. Set 계열
		// - HashSet (***)중요
		// - TreeSet

		// 3. Map 계열
		// - HashMap (*****)중요
		// - TreeMap
		// - Properties ( - )별로
		// - HashTable ( - )별로

		// ArrayList 클래스
		// - Iterable<E>, Collection<E>, List<E>
		// - Resizable-array implementation of the List interface.
		// - 순수 배열하고 구조가 가장 유사함.

		// m1();
		// m2();
		// m3();
		// m4();
		//m5();
		//m6();
		//m7();
		m8();
		
		
		

	}// main

	private static void m8() {
		
		//배열 생성
		MyArrayList list = new MyArrayList();
		
//		System.out.println(list);
//		//추가
//		list.add("홍길동");
//		list.add("아무개");
//		list.add("하하하");
//	
//		System.out.println(list);
//
//		//읽기
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		//.out.println(list.get(3));
//
//		//개수
//		System.out.println(list.size());
//
//		//탐색 + 읽기
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
//
//		//수정
//		list.set(0, "우하하");
//		System.out.println(list.get(0));
//		System.out.println(list);
//		
//		//삭제
//		list.remove(1);
//		System.out.println("삭제 후");
//		System.out.println(list);
//		
//		list.add("하하하");
//		
//		
////		for (int i=0; i<list.size(); i++) {
////		      System.out.println(list.get(i));
////		}
//
//		//삽입
//		list.add(1, "호호호");
//		System.out.println(list);
////		for (int i=0; i<list.size(); i++) {
////		      System.out.println(list.get(i));
////		}
//
//		//검색
//		if (list.indexOf("홍길동") > -1) {
//		      System.out.println("홍길동 있음");
//		} else {
//		      System.out.println("홍길동 없음");
//		}
//		System.out.println();
//		
//		
//		System.out.println(list.lastIndexOf("호호호"));
//		
//		System.out.println(list.indexOf("호호호", 2));
//		
//
//		//초기화
//		list.clear();
//		System.out.println(list.size());
//		
		//trimToSize
		list.add("홍길동");
		list.add("아무개");
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		System.out.println(list);
		
		list.trimToSize();
		System.out.println(list);
		
//		MyArrayList list2 = new MyArrayList(100);
//		
//		System.out.println(list2);
//		for(int i = 0; i < 100; i++) {
//			list2.add(i + "");
//		}
//		System.out.println(list2);
		
	}// m8

	private static void m7() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		System.out.println(nums.size()); // 처음 생성되면 데이터는 없다,
		
		nums.add(10);
		System.out.println(nums.size()); //데이터를 넣었을때 1번방부터 생성이 된다.
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		
		
		for (int i = 0; i < 10; i++) {
			nums.add(i);
		}
		
		//size(): 배열의 길이가 아니다.
		//size(): 는 데이터의 개수 이다.
		System.out.println(nums.size()); 
		//nums.remove(0);
		System.out.println(nums);
	
		
	}// m7

	private static void m6() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("강아지");
		names.add("고양이");
		names.add("참새");
		
		//dump
		//- Arrays.toString(배열)
		//- toString() 재정의
		
		System.out.println(names);
		
		
		
		
	}// m6

	private static void m5() {

		// 선택? 데이터 집합?
		// 1. 배열 > 길이 고정 > 학생수가 정확할때(고정)
		// 2. ArrayList > 길이 가변 > 학생수가 유동적일때(불 명확)

		// 성적표
		ArrayList<Student> list = new ArrayList<Student>(); // 학생 명단

		Random rnd = new Random();

		String[] names = { "홍길동", "아무개", "강아지", "고양이", "병아리" };

		for (int i = 0; i < 5; i++) {
			
			Student s = new Student(); // 학생 1명

			s.setNo(i + 1);
			s.setName(names[i]);

			// 60 ~ 100
			// 0 ~ 40 + 60
			s.setKor(rnd.nextInt(41) + 60);
			s.setEng(rnd.nextInt(41) + 60);
			s.setMath(rnd.nextInt(41) + 60);

			list.add(s);
		}

		
		// 출력
		System.out.println("===========================================");
		System.out.println("                        성적표");
		System.out.println("===========================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");

		for (Student s : list) {
			System.out.printf("%5d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
					, s.getNo()
					, s.getName()
					, s.getKor()
					, s.getEng()
					, s.getMath()
					, s.getTotal()
					, s.getAvg());

		}

	}// m5

	private static void m4() {

		// 객체 배열
		// Cup[] list = new Cop[5]; //기본 리스트 만드는 방법

		ArrayList<Cup> list = new ArrayList<Cup>();

		Cup cup = new Cup("white", 5000);
		list.add(cup);

		list.add(new Cup("blue", 3000));
		list.add(new Cup("yellow", 4500));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (Cup c : list) {
			System.out.println(c);
		}

	}// m4

	private static void m3() {

		int[] 		ns1 = new int[3];
		int[][] 	ns2 = new int[2][3];
		int[][][] 	ns3 = new int[2][3][4];

		// ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ms1.add(10);

		// ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ms2.add(new ArrayList<Integer>());
		ms2.get(0).add(10);

		// ns3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();

	}// m3

	private static void m2() {

		ArrayList<String> list = new ArrayList<String>();

		// 1. 요소 추가하기
		// - boolean(T value)
		// - 배열의 마지막에 추가 > Append Mode
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("포도");
		list.add("귤");

		// 2. 용소의 개수
		// - int size
		System.out.println(list.size());

		// 3. 요소 읽기
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		// System.out.println(list.get(5)); // IndexOutOfBoundsException - 에러
		// System.out.println("홍길동".charAt(5)); // StringIndexOutOfBoundsException - 에러

		System.out.println(list.get(list.size() - 1)); // 마지막 방 읽어오기

		// 4. 요소 수정
		// - T set(int index, T newValue)
		list.set(2, "파인애플");
		System.out.println(list.get(2));

		// 5. 요소 삭제
		// - 배열은 요소 삭제가 없다.
		// - 방 없애기 > 길이가 줄어든다.
		// - T remove(int index) > 방 번호를 찾아서 삭제
		// - boolean remove(T value) > 값을 찾아서 삭제
		// - 시프트 발생 > 삭제된 방 이후로 모든 요소의 방번호 - 1
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size()); // 방 자체를 삭제

		// 6. 요소 추가
		// - 배열의 요소를 원하는 위치에 추가
		// - Insert Mode
		// - void add(int index, T value)
		// - 시프트 발생 > 삽입된 방 이후의 모든 요소는 방번호 + 1
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.add(2, "망고");   // - Insert Mode
		System.out.println(list.get(3));
		System.out.println(list.size());

		// 7. 요소 검색
		// - int indexOf(T value)
		// - int lastIndexOf(T value)
		// - boolean contains(T value)
		System.out.println(list.indexOf("사과")); // -1은 찾을수 없다는 표식이다.
		System.out.println(list.indexOf("파인애플"));
		System.out.println(list.indexOf("포도"));
		System.out.println(list.indexOf("망고"));

		list.remove("포도"); // 문자열로 지우면 중복단어중 첫번째 것만 삭제한다.
		list.remove(3);// 그래서 숫자로 방 위치를 지정해서 삭제해주는것이 좋다.
		System.out.println(list.indexOf("포도"));

		// 8. 요소 탐색
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// for문 (ArrayList에서 사용하는 for 문)
		// - 향상된 for문(Enhanced for statement)

		for (String item : list) {
			System.out.println(item); // 배열의 모든 값이 나온다.
		}
		System.out.println();

		// 9. 초기화
		// - 모든 요소 삭제 > 모든방.remove()
		// - void clear()

		list.clear();
		System.out.println(list.size());

		// 10. 빈배열 확인
		// - boolean isEmpty
		System.out.println(list.isEmpty()); // 빈 배열인지 확인하는 메소드
		System.out.println(list.size() == 0); // 위와 같이 확인하는 메소드

		list.add("사과");

		System.out.println(list.isEmpty());
		System.out.println(list.size() == 0);

	}// m2

	private static void m1() {

		// 배열
		// - 타입 명시(int)
		// - 길이 명시(3)
		int[] nums1 = new int[3];

		// 요소 접근 > 첨자(index) 사용
		nums1[0] = 10; // 배열[index] > 인덱서(Indexer)
		nums1[1] = 20;
		nums1[2] = 30;

		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);

		System.out.println(nums1.length);
		System.out.println();

		// 컬렉션
		// - 타입 명시(x) > Object 배열
		// - 길이 명시(x) > 가변
		// ArrayList Nums2 = new ArrayList();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();

		// 요소 접근
		// - boolean add(T value)
		// - Append(차례대로 추가)
		nums2.add(100); // nums2[0] = 100;
		nums2.add(200); // nums2[1] = 200;
		nums2.add(300); // nums2[2] = 300;
		nums2.add(300); // nums2[2] = 300;

		System.out.println(nums2.get(0)); // 배열 확인 방법
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));

		System.out.println(nums2.size()); // .length() 처럼 확인 // 길이 3

		nums2.add(400);
		nums2.add(500);
		System.out.println(nums2.size()); // 길이 5
		System.out.println();

		for (int i = 0; i < nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}

	}// m1

}// Ex54_ArrayList

class Cup {

	private String color;
	private int price;

	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[color=" + color + ", price=" + price + "]";
	}

}

class Parent {
	
	private int a;
	private int b;
	
//	public Parent() {
//		this.a = 0;
//		this.b = 0;
//	}
	
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + ", b=" + b + "]";
	}
	
	public void hello() {
		
	}
	
}

class Child extends Parent {
	
	private int c;
	private int d;
	
//	public Child() {
//		this.c = 0;
//		this.d = 0;
//		
//	}
	
	public Child(int c, int d) {
		//부모생성자 생성
		super(0, 0); // 부모 생성자를 명시적으로 호출
		this.c = 0;
		this.d = 0;
		
		//객체 접근 연산자
		//1. this > 자기 자신
		//2. super > 자기 부모
		
		
		
	}

	@Override
	public String toString() {
		return "Child [c=" + c + ", d=" + d + "]";
	}
	
	
	
}
