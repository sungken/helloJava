package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.util.MyUtil;

public class Ex68_Stream {

	public static void main(String[] args) {
		
		/*
		 자바 스트림
		 1. 입출력 스트림
		 	- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등...
		 	
		 2. 스트림
		 	- Java 8(1.8) + 람다식과 같이 출시
		 	- 배열(컬렉션)의 탐색(조작) 기술(*********)
		 	- 파일 입출력 지원
		 	- 디렉터리 탐색 지원
		 	- 기타 등등.. 여러곳에서 시도 중....
		 	- 익명 객체(적극적ㄱ으로) 사용 >  람다식 사용 + 함수형 인터페이스
		 	
		 표준 API 함수형 인터페이스
		 1. Condumer
		 	- (매개변수) -> {}
		 	
		 2. Supplier
		 	- () -> { reurn 값;}
		 	
		 3. Function
		 	- (매개변수) -> {reurn 값;}
		 	
		 4. Operator
		 	- (매개변수) -> {reurn 값;}
		 	- 매개변수와 반환값이 동일한 타입
		 
		 5. Predicate
		 	- (매개변수) -> {reurn 값;}
		 	- 반환값이 Boolean
		 
		 */
		
		//m1();
		//m2();
		//m3();
		m4(); // 본격 stream 시작
		/*
		 스트림, Stream
		 - 데이터 소스로부터 생성
		 - list.stream().forEach()
		 
		 파이프, Pipe
		 - 스트림 객체 메서드
		 1. 중간 파이프
		 
		 2. 최종 파이프
		 
		 최종 처리
		 - forEach()
		 - 최종 파이프
		 - 앞의 스트림으로 부터 요소를 받아 최종 처리 하는 메서드
		 
		 - 필터링
		 - filter()
		 - 중간 파이프
		 - 앞의 스트림으로 부터 요소를 받아 조건에 맞는 요소만 남기고 맞지 않는 요소는 버린다.
		
		
		 중복 제거
		 - distinct()
		 - 중간 파이프
		 - 앞의 스트림에서 중복 요소를 제거한다.
		 - 유일한 요소만 남아있는 스트림
		 - Set 성질
		 
		 
		 
		 
		 */
		
		//m5(); // stream()에서 .filter 사용 방법
		m6();// 중복값 제거 Set
		
		
	}// main

	private static void m6() {
		
		List<Integer> list = Data.getIntList();
		System.out.println(list);
		
		//위의 집합에서 중복값을 제거 하시오. > Set
		
		//Case 1. 
		Set<Integer> set = new HashSet<Integer>();
		for (int n : list) {
			set.add(n); // 중복값 추가 방지!!
		}
		System.out.println(set);
		System.out.println(set.size());
		
		//Case 2.  --> Set에서 가장 쉬운 방법
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		
		//Case 3. -> 자주 안씀
		System.out.println(list.stream().count()); // 원본 값 그대로
		System.out.println(list.stream().distinct().count()); // 중복값 배제
		
		
		
		
		
		
		
		
	}// M6

	private static void m5() {
		
		Data.getStringList().stream()
							.filter(word -> word.length() >= 5)
							.filter(word -> word.startsWith("애"))
							.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
							.filter(user -> user.getGender() == 1)
							.forEach(user -> System.out.println(user));
		System.out.println();
		
		
		
	}// m5

	private static void m4() {
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//짝수만 출력
		//1. for
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				System.out.printf("%4d", list.get(i));
			}
		}
		System.out.println();
		
		
		//2. for
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%4d", n);
			}
		}
		System.out.println();
		
		//3. stream
		list.stream().forEach(n -> {
			if ( n % 2 == 0) {
				System.out.printf("%4d", n);
			}
		});
		System.out.println();
		
		//파이프 이용 스트림
		list.stream().filter(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
		// 가독성이 좋고 false값은 버려서 데이터 활용도도 좋다.
		list.stream().filter(n -> n % 2 == 0)
						//필터를 추가하면서 접근방식을 조절할수 있다.
					 .filter(n -> n >= 50)
					 .forEach(n -> System.out.printf("%4d", n));
		System.out.println();
		
	}//m4

	private static void m3() {
		
		//스트림을 얻어오는 방법
		//- stream() 메서드를 사용한다.
		//1. 배열로 부터(********)
		//2. 컬렉션으로 부터(********) 
		//--------------------------------
		//3. 숫자 범위
		//4. 파일로 부터
		//5. 디렉토리로 부터
		
		
		//1. 
		int[] nums1 = {10, 20, 30, 40, 50};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer> nums3 = new LinkedList<Integer>();
		nums3.add(100);
		nums3.add(200);
		nums3.add(300);
		nums3.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums4.add(100);
		nums4.add(200);
		nums4.add(300);
		nums4.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		// HashMap은 stream을 지원 안한다.
		
		//3. 
		//Stream<Intger>
		IntStream.range(1, 11).forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		try {
			//4. 파일 > 읽기 작업
			Path path = Paths.get("det\\score.txt");
			Files.lines(path).forEach(str -> System.out.println(str));
			System.out.println();
			
			
			//5. 디렉토리 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
			});
			
		} catch (Exception e) {
			System.out.println("Ex68_Stream.m3");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}//m3

	private static void m2() {
		
		//배역(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		
		//1. for문(while 문)
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t", list.get(i));
		}
		System.out.println();
		System.out.println();
		
		//2. 향상됭 for문
		for(String word : list) {
			System.out.printf("%s\t", word);
		}
		System.out.println();
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\t", iter.next());
		}
		System.out.println();
		System.out.println();
		
		//4. stream
		
		//4.1 list.stream() > ArrayList로 부터 스트림 객체를 생성해라
		//4.2 stream 객체 > ArrayList를 참조
		//4.3 forEach 실행
		// - stream을 통해서 ArrayList 요소를 접근 ( 하나씩 + 순서대로)
		Stream<String> stream = list.stream();
		stream.forEach(word -> System.out.println(word));
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		
		Stream<Integer> stream2 = nums.stream();
		stream2.forEach(num -> System.out.println(num));
//		stream2.forEach(num -> System.out.println(num)); // 한번 소비가 끝난 stream은 재사용이 불가능
		stream2.close();
		
		//배열.stream().메서드().메서드().메서드().메서드().메서드().메서드().메서드()~~
		nums.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
		});
		
		
		
		
		
	}// m2

	private static void m1() {
		
//		int[] nums1 = Data.getIntArray();
//		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		System.out.println(Arrays.toString(nums2));
		
//		List<Integer> nums3 = Data.getIntList();
//		System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(10);
		System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(5);
		System.out.println(Arrays.toString(txt1));
		
		User[] ulist = Data.getUserArray();
		System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
		MyUtil util = new MyUtil();
		System.out.println(util.sum(100, 200));
		
		
		
		
		
	}// m1

}// Ex68_Stream




