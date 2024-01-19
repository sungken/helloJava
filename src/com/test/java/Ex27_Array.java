package com.test.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex27_Array {
	public static void main(String[] arg) {
		
		//배역, Array
		//- 자료 구조 > 데이터 저장하는 물리적인 구조
		//- 데이터의 집합 > 변수들을 모아놓은 집합
		//- 같은 자료형을 저장하는 데이터의 집합
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();//배열 삽입
		m15();//배열 삭제
		
		//m16();//배열의 차원 1, 2, 3 차원 배열
		//m17();// 배열 초기화 리스트
		//m18();//난수 만들기(로또) 중복된값이 나온다
		//m19();
		//m20();// 2차원 배열 값 넣기 (70번 문제 참고)
		
		
		
		
		
	}//main

	private static void m20() {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		//2차원 배열 값 넣기
		for(int i = 4; i >= 0 ; i--) {
			for(int j = 4; j >= 0; j--) {
				nums[i][j] = n;
				n++;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
		
	}//m20

	private static void m19() {
		
		//******중요 >> 배열의 길이는 불변이다.
		//- 한번 만들어진 배열의 방은 더 늘리거나 삭제할 수 없다.
		
		int[] nums = new int[3]; // 배열의 길이를 정적으로 할당
		//이렇게 한번 선언하면 추가로 더 늘릴수 없다.
		//고로 선언하기 이전에 약간의 여유치를 넣어주는게 좋다.
		//미리 예측한 값이 너무 많이 넣어주면 메모리 잡아먹어서 안좋다.
		
		
		Scanner scan = new Scanner(System.in);
		int length =  scan.nextInt();
		int[] kor = new int[length];// 배열의 길이를 동적으로 할당
		//int length = 3;
		
		
		
	}//m19

	private static void m18() {
		
		for (int i = 0; i < 10; i++) {
			
			int a = (int)(Math.random() * 45);
			
		}
		
		
		
		
	}//m18

	private static void m17() {
		
		//초기화 리스트
		
		int[] nums1 = {10,20,30}; //1차원 초기화
		
		int[][] nums2 = {
				{10,20,30}, 
				{40,50,60}
				}; //2차원 초기화
		
		int[][][] nums3 = {
				{
					{10,20,30}, 
					{40,50,60}
				}, 
				{
					{70,80,90}, 
					{100,110,120}
				}
		}; //3차원 초기화
		
		//Jagged Array, 비정형 배열, 불규칙 배열
		
		 int[][] nums4 = new int[3][4]; //이렇게 만들지 못한다
		 
		 int[][] nums5 = 
			 {
					 {10, 20, 30},
					 {40, 50},
					 {60, 70, 80, 90}
			 }; //이렇게 밖에 못만든다.
		 
		 //Jagged Array 탐색
		 for (int i = 0; i < nums5.length; i++) {
			 for (int j = 0; j < nums5[i].length; j++) {
				 System.out.printf("%5d", nums5[i][j]);
			 }
			 System.err.println();
		 }
		
		
		
		
		
	}//m17



	private static void m16() {
		
		//배열의 차원
		//- 1차원 배열, 2차원 배열, 3차원 배열 ~~ 제한이 없음
		
		//1차원 배열
		int[] nums1 = new int[3];
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		System.out.println(Arrays.toString(nums1));
		
		//2차원 배열
		int[][] nums2 = new int[2][3];
		
		nums2[0][0] = 10;
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		nums2[1][0] = 40;
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.deepToString(nums2));
		
		//2차원 배역 탐색
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[0].length; j++) {
				System.out.print(nums2[i][j] + "\t");
			}
			System.out.println();
		}
		//ex
		//num2 자료형? > int[][] 인티저 2차령 배열 입니다
		//nums2[0] 자료형? > int[] 인티저 1차형 배열 입니다
		//nums2[0][0] 자료형? > int 인티저 배열 입니다
		nums2[0][1] = 20;
		System.out.println(nums2.length);//2
		System.out.println(nums2[0].length);//3
		System.out.println(nums2[0][0]);//10
		System.out.println();
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0] = 10;
		nums3[0][0][1] = 20;
		nums3[0][0][2] = 30;
		
		nums3[0][1][0] = 40;
		nums3[0][1][1] = 50;
		nums3[0][1][2] = 60;
		
		nums3[1][0][0] = 70;
		nums3[1][0][1] = 80;
		nums3[1][0][2] = 90;
		
		nums3[1][1][0] = 100;
		nums3[1][1][1] = 110;
		nums3[1][1][2] = 120;
		
		//3차원 배열의 탐색
		for (int i = 0; i < nums3.length; i++) {
			for(int j = 0; j < nums3[0].length; j++) {
				for (int k = 0; k < nums3[0][0].length; k++) {
					System.out.printf("%5d", nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}//m16



	private static void m15() {
		
		//- 배열 요소삽입(Deletion)
		//- Left Shift > 왼쪽으로 한칸씩 이동했다.
		//- *** 삭제 이후의 요소들이 인덱스가 변경된다.(앞으로 방 번호가 밀리면서 번호가 바뀌는 것)중요!
		int[] nums = { 1, 2, 3, 4, 5 };
		int index = 1;
		
		System.out.println(Arrays.toString(nums));
		for(int i = index; i<=nums.length-2; i++) {
			nums[i] = nums[i+1];
		}
		
		nums[nums.length-1] = 0;
		System.out.println(Arrays.toString(nums));
		
	}//m15


	private static void m14() {
		
		//배열 조작
		//- 삽입, 삭제
		//- 비용 발생
		
		//- 배열 삽입(Insertion)
		//- Right Shift > 오른쪽으로 한칸씩 이동했다.(일괄적인 이동 행동)
		//- *** 삽입 이후의 요소들이 인덱스가 변경된다.(뒤로 방 번호가 밀리면서 번호가 바뀌는 것)중요!
		int[] nums = {1, 2, 3, 4, 5};
		int index = 1;
		int value = 9;
		
		System.out.println("nums[0] = " + nums[0]);
		System.out.println("nums[3] = " + nums[3]);
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = nums.length-2; i>=index ; i--) {
			//System.out.println(i);
			nums[i+1] = nums[i];
			System.out.println(Arrays.toString(nums));
		}
		nums[index] = value;
		System.out.println(Arrays.toString(nums));
		
		System.out.println("nums[0] = " + nums[0]);
		System.out.println("nums[3] = " + nums[3]);
		
		
		
	}//m14



	private static void m13() {
		
		int[] nums = {5, 3, 1, 4, 2};
		String[] names = {"홍길동", "아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리"};
		
		//Quick solt(오름차순 정렬)
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		

		
	}//m13

	private static void m12() {
		
		//정렬
		//- 크기 비교 후 > 재배치
		
		//1. 오름차순 
		// a. 숫자: 작은수 > 큰수
		// b. 문자열: 문자코드값 순서(숫자 정렬)
		// c. 날짜시간: 과거 > 미래
		
		
		
		//2.내림차순
		// a. 숫자: 큰수 > 작은수
		// b. 문자열: 문자코드값 역순
		// c. 날짜시간: 미래 > 과거
		
		//정렬 구현
		//1. 직접 구현 > 정렬 알고리즘
		//2. JDK 수현된 기능
		
		//버블 정렬 + swap
		
		//swap > 두 공간의 데이터를 서로 바꾸는 작업
		int a = 10;
		int b = 5;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a: " + a);
		
		int[] nums = {5, 3, 1, 4, 2};
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length -1; i++)
			
			for (int j = 0; j < nums.length - 1 - i; j++) {
				
				//내림차순
				if(nums[j] > nums[j+1]) {
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				} 
				//오름차순
//				if(nums[j] < nums[j+1]) {
//					temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
//				} 
			}
		System.out.println(Arrays.toString(nums));
		
		
		String[] names = {"홍길동", "아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리"};
		
		for (int i = 0; i<names.length -1; i++) {
			for (int j= 0 ; j<names.length -1 -i; j++) {
				
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp2 = names[j];
					names[j] = names[j+1];
					names[j+1] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(names));
		
		
		
//		String name1 = "홍길동";
//		String name2 = "홍길순";
//		//문자코드값 비교 메서드
//		System.out.println(name1.compareTo(name2));
		
		//두 글자의 문자코드값 차이
//		System.out.println((int)'A');
//		System.out.println((int)'B');
//		System.out.println((int)'A' - (int)'B');
		
		

		
	}//m12

	private static void m11() {
		
		//배열 초기화 리스트
		
		int[] nums1 = new int[5];
		
		nums1[0] = 95;
		nums1[1] = 88;
		nums1[2] = 67;
		nums1[3] = 89;
		nums1[4] = 64;
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = new int[] {95, 88, 67, 89, 64};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {95, 88, 67, 89, 64};
		System.out.println(Arrays.toString(nums3));
		System.out.println(nums3[2]);
		
		String[] name1 = new String[3];
		name1[0] = "홍길동";
		name1[1] = "임꺽정";
		name1[2] = "도깨비";
		
		String[] name2 = {"홍길동", "임꺽정", "도깨비"};
		
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		
		
	}//m11

	private static void m10() {
		
		//배열 자동 초기화
		//- 배열은 생성 직후 모든 요소 (방)가 초기화 된다.
		
		//초기화 규칙
		//1. 정수배열 > 0
		//2. 실수 배열 > 0.0
		//3. 문자열 > \0(\ㅕ0000)
		//4. 논리배열 > false
		//5. 참조형배열 > null
		
		int[] list1 = new int[3];
		System.out.println(Arrays.toString(list1));
		
		int[] list2 = new int[3];
		System.out.println(Arrays.toString(list2));
		
		double[] list3 = new double[3];
		System.out.println(Arrays.toString(list3));
		
		char[] list4 = new char[3];
		System.out.println(Arrays.toString(list4));
		
		boolean[] list5 = new boolean[3];
		System.out.println(Arrays.toString(list5));
		
		String[] list6 = new String[3];
		System.out.println(Arrays.toString(list6));
		
		
		
		
		
	}//m10

	private static void m9() {

		//Array 클래스
		//- 배열과 관련된 여러가지 기능을 구현한 클래스
		//- 배열을 조작하는 편리한 기능을 제공하는 역할
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		//배열의 상태를 확인?
		//- [I -> int[
		//- @ -> 구분지어두기위한 구분자
		//- 2ff4acd0 -> 메모리 주소
		
		System.out.println(nums);//  [I@2ff4acd0 -> 쓸모없음
		
		
		printArray(nums);
		System.out.println(Arrays.toString(nums)); // dump(덤프) 한다
		
		//*** c계열의 언어들은 범위를 나타날때
		// - 시작위치(inclusive) ~ 끝위치(exclusive)
		
		int[] copy;
		//깊은 복사
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		//깊은 복사로 인해 복사값이 변하지 않고 원본만 복사되었다.
		nums[0] = 100;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
		
		
		
	}//m9

	private static void printArray(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d", nums[i]);
		}
		System.out.println();
		
	}//printArray(int[] nums)

	private static void m8() {
		
		//배열 복사
		//1. 얕은 복사, Shallow Copy
		//- 주소값 복사
		//- Side Effect 발생
		
		
		
		//2. 깊은 복사, Deep Copy
		//- 실제 배열 복사
		//- Side Effect 발생 안함
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3];
		for (int i = 0; i < nums.length; i++) {
			
			//방과 방끼리의 복사 > 요소끼리의 복사
			//int = int
			copy[i] = nums[i];
			
		}
		
		nums[0] = 100;
		System.out.println(copy[0]);
		System.out.println(nums[0]);
		
	}//m8

	private static void m7() {
		
		int a = 10;
		changValur(a);
		System.out.println(a);
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		changeArray(nums);
		System.out.println(nums[0]);
		
	}//m7

	private static void changeArray(int[] nums) {
		
		nums[0] = 123;
		System.out.println(nums[0]);
		
		
	}//changeArray(int[] nums)

	private static void changValur(int a) {
		
		a = 20;
		System.out.println(a);
		
	}//changValur(int a)

	private static void m6() {
		
		//배열 복사(= 참조형 복사)
		
		//값령 복사
		int a = 10;
		int b;
		
		b = a ;
		//값형 > 원본을 수정해도 복사본에 영향을 주지 않는다. > Side Effect가 발생하지 않는다.
		a = 20; //원본 수정
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int [] copy;
		
		//배열도 복사 가능
		//int[] = int[]
		copy = nums;
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		
		//원본을 수정하면 복사본도 수정된다.
		//복사본을 수정하면 원본도 수정된다.
		//*** 모든 참조형은 주소값 복사를 한다.***
		// > Side Effect가 발생한다.
		nums[0] = 100;
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		
		copy[1] = 200;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		
		
		
	}//m6

	private static void m5() {
		
		//값형 vs 참조형
		//- 값형 > 변수에 데이터를 직접 저장
		//- 참조형 > 데이터는 따로 생성 + 변수에 메모리 주소값 저장
		
		//*** 원인
		//- 데이터의 크기가 고정 > 값형
		//- 데이터의 크기가 일정하지 않음 > 참조형
		//- *** 변수만 보고 데이터의 길이를 추측 가능 > 값형 ***
		//- *** 변수만 보고 데이터의 길이를 추측 불가능 > 참조형 ***
		
		int a1 = 10;
		//a1의 메모리 크기?  4byte
		
		int a2 = 200000000;
		//a2의 메모리 크기? 4byte
		
		//----------------------------------
		
		String s1 = "홍길동";
		//s1의 메모리의 크기? 6byte
		
		String s2 = "안녕하세요";
		//s1의 메모리의 크기? 10byte
		//길이가 고정되어있지 않고 유동적이면 참조형이다!!!
		
	}//m5

	private static void m4() {
		
		//각 자료형 > 배열
		
		//정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자 배열(char) == String
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형 배역
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		Calendar c1 = Calendar.getInstance();
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);
		System.out.println(list6[1]);
		
		
		
		
	}

	private static void m3() {
		
//		int num ;
//		System.out.println(num);  --> 에러
		
		//참조형의 특징
		//- 모든 참조형들은 공간은 초기화하지 않아도 자동으로 초기화가 된다.
		int[] nums = new int[10];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]); //--> 방을 초기화하지 않아도 기본값 0 이 들어있다.
		//System.out.println(nums[10]); --> 존재하지 않는 방은 에러를 발생시킨다.
		
		//배열의 길이 = 10
		//첨자의 범위 = 0 ~ 9
		//첨자의 범위 = 0 ~ 길이 - 1
		
		//
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = ");
		}
		
		
		
	}//m3

	private static void m2() {
		
		//요구사항 - 학생 3명 > 국어점수 > 총점, 평균
		//추가사항 - 학생수 증가 > 300명
		
		//배열 선언하기
		//-자료형[ 변수명 = mew 자료형[길이];
		//배열타입 배열명 = new 배열타입[배열의 길이]
		int[] kors = new int[300];	
		
		//배열의 방(요소, Element)에 접근 > 방 번호(첨자, Index)사용

//		kors[0] = 100;
//		kors[1] = 90;
//		kors[2] = 80;
		
		//int total = kors[0] + kors[1] + kors[2];
		int total = 0;
		
		for (int i = 0; i < kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / kors.length;//속성, 필드, 프로퍼티
		System.out.printf("총점: %d점, 평균: %.1f\n", total, avg);
		
		
		
		
	}//m2

	private static void m1() {
		
		//요구사항 - 학생 3명 > 국어점수 > 총점, 평균
		//추가사항 - 학생수 증가 > 300명
		
		int kor1;
		int kor2;
		int kor3;
		//+297 추가 선언
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297
		
		
		int total = kor1 + kor2 + kor3;// + kor4 ...+kor300;
		double avg = total / 3.0;// 300.0
		
		System.out.printf("총점: %d점, 평균: %.1f\n", total, avg);
		
		
		
		
	}//m1

}
