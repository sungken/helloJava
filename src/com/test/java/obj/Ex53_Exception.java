package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {

	public static void main(String[] args) {
		
		//예외, Exception
		//- 런타임 오류
		//- 컴파일 발견 (X) > 실행 중 발견(O)
		//- 개발자 미리 예측 > 사전 조치
		
		//예외 처리, Exception Handling
		//1. 제어문 사용
		//2. 전용 처리 구문 > try catch문
		
		//m1();
		//m2();
		//m3();
		//m4();
		try {
			//m5();			
			//m6(); // 메인에서 add throws로 미루면 뻑남 main에서 쓰지 말것.
		} catch (Exception e) {
			
		}
		m7();
		
		
		
		
		
		
	}// main
	
private static void m7() {
	
	int n = 0;
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.print("입력: ");
		int input = Integer.parseInt(reader.readLine());
		
	} catch (Exception e) {
		//뭔가를 입력해야 에러를 확인할수 있어서 꼭 catch절에 안내 문구 넣어라!!!
		//비워두면 큰일!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("숫자 넣어라");
		
	}
	
	System.out.println("종료");
	
	}// m7

private static void m6() throws IOException {
	
	//Wrapping Class
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	String input = reader.readLine();
	
	
	}// m6

private static void m5() throws Exception {
		
	//예외 미루기 
	//- 특정 메서드에 발생한 예외를 해당 메서드가 직접 처리하지 않고, 
	// 	그 예외 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술
	
	// 지금은 그때그때 수정하자 미루지 말고
	
	int n = 0;
	System.out.println(100/n);

	}// m5

private static void m4() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("숫자: ");
	int num = scan.nextInt();
	
	
	try {
		//비즈니스 코드 영역
		System.out.println(100 / num);
		
	} catch (Exception e) {
		//예외 처리 영역
		System.out.println("예외 처리");
		
	} finally {
		//자원 해제 영역
		//성공 or 실패 > 무조건 실행
		System.out.println("finally");
		scan.close(); // 자원 해제 > Clean-Up Code
		
	}
	
	
	
	}// m4

private static void m3() {
		
	try {
		int num = 10;
		System.out.println(100 / num); //thow new ArithmeticException
		
		int[] nums = {10, 20, 30};
		System.out.println(nums[0]); //thow new ArrayIndexOutOfBoundsException
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(1, 11));//thow new NullPointerException
		
	} 
	catch(ArithmeticException e) { 
		System.out.println("0입력 > 김대리 연락");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("첨자 오류 > 박과장 연락");
	}
	catch(NullPointerException e) {
		System.out.println("Null > 최대리 연락");
	}
	catch (Exception e) { 
		// 위쪽 Exception의 부모 클래스(앞쪽에는 디테일하게 잡고 예외가 생길경우 잡는 것{중요})
		//System.out.println(e.getMessage());
		System.out.println("예외 처리");
	}
		
	}// m3

	private static void m2() { // 하드코딩
		
		int num = 0;
		try {
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("0으로 나누기 > 김대리 연락");
		} 
		
		
		int[] nums = {10, 20, 30};
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("0으로 나누기 > 박과장 연락");
		
		}
		
		try {
			Random rnd = null;
		} catch (Exception e) {
			System.out.println("0으로 나누기 > 최대리 연락");
		}
		
		
		
	}// m2

	private static void m1() {
		
		//요구사항] 숫자를 입력받아 처리를 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
		//예외 조건
		if(num != 0) {
			//비지니스 코드(업무 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		
		//try catch 문
		//try 문 > 감시!! > 에러가 발생하는지 계속 검사!!
		//catch문 > 예외처리
		try {   
			//비지니스 코드(업무 코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(222);
			
		} catch (Exception e) {   
			
			//e: 예외 객체
			//- 발생한 예외에 대한 여러가지 정보를 제공하는 객체
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
			//예외 처리 코드
			System.out.println("0을 입력하지 마시오.");
		}
		
		System.out.println("종료");
		
		
	}// m1

}// Ex53_Exception
















