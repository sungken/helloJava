package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.spi.DirStateFactory.Result;

public class Ex12_Operator {

	public static void main(String[] args) throws IOException {
		
//		b. 비교 연산자
		// - >, >=, <,<=, ==(Equals), !=(not Equals)
		// - 2항 연산자
		// - 피연산자들의 우위(동등) 비교
		// - 피연산자는 숫자형을 가진다.
		// - 연산의 결과가 Boolrean이다.(true, false)
		
		int a = 10;
		int b = 3;
		System.out.printf("%d > %d = %b\n", a, b, a > b);
		System.out.printf("%d >= %d = %b\n", a, b, a >= b);
		System.out.printf("%d < %d = %b\n", a, b, a < b);
		System.out.printf("%d <= %d = %b\n", a, b, a <= b);
		System.out.printf("%d == %d = %b\n", a, b, a == b);
		System.out.printf("%d != %d = %b\n", a, b, a != b);
		
		
		//사용자 나이 입력 > 18세 이상이면 통과, 미만이면 거절
//		System.out.println("나이 입력: ");
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
//		
//		String input = reader.readLine();
//		
//		int age = Integer.parseInt(input); //"30" -> 30
//		System.out.println(age >= 18);
//		System.out.println();
		
		// ==, !=
		// 문자열(참조형) 비교
		
		int n1 = 100;
		int n2 = 100;
		int n3 = 50;
		n3 = n3 + 50;
		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 == n3);
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2);	
		System.out.println(s3);	
		System.out.println(s1 == s3);// false
		System.out.println(s1);
		// ***문자열의 비교는 ==, != 연산자를 무조건 사용하면 안된다.
		// *** 문자열의 비교는 equals() 메서드를 사용한다.
		
		System.out.println(s1.equals(s2)); 
		// s1 == s2
		System.out.println(s1.equals(s3)); 
		// 문자 비교 예시 --> true
//----------------------------------------------------------------		
//	 	c. 논리 연산자
		// - &&(ans, 논리 곱), ||(or, 논리 합), !(not)
		// - 2항 연산자(&&, ||)
		// - 1항 연산자(!)
		// - 피연산자의 자료형이 Boolean 이다.
		// - 연산의 결과가 Boolrean 이다
		// - 피연산자를 정해진 규칙에 따라 연산을 한 후에 반환
		
		// A && B = ? ---> Boolean && 연산자 = 값
		
		// 베타적 논리합(xor)
		// A ^ B = ?
		// 	T ^ T = F
		// 	T ^ F = T
		// 	F ^ T = T
		// 	T ^ T = F
		
		boolean f1 = true;
		boolean f2 = false;
		
		System.out.println(f1 && f2); // false
		System.out.println(f1 || f2); // true
		System.out.println(!f1); // false
		System.out.println(f1 ^ f2); // true
		
		// 연산 우선 순위
		// 산술 연산자 -> 비교 연산자 -> 논리 연산자 -> 대입 연산자
	
//----------------------------------------------------------------				
//	 	d. 대입 연산자
		// - =
		// +=, -=, *=, /=, %= (복합대입 연산자)
		// - LValue(변수) = RValue(상수, 변수)
		// - LValue와 RValue의 자료형이 동일해야 한다. -> 형변환
		// - 대입 연산자는 모든 연산자들 중 우선 순위가 가장 낮다.
		// - 대입 연산자는 연산 방향이 오른쪽 -> 왼쪽으로 실행한다.
		
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		
		int m1 = 100;
		int m2;
		int m3;
		//m2 = m1;
		//m3 = m1;
		m3 = m2 = m1; // 대입 연산자는 연산 방향이 오른쪽 -> 왼쪽으로 실행한다.
		System.out.println(m2);
		System.out.println(m3);
		
		// 복합대입 연산자
		int n = 10;
		// n에 1을 추가 하시오. -> n의 값에 1을 누적 시켜라
		n += 1; // n = n + 1; 와 같은 의미 이다.
		System.out.println(n);
		n -= 2;
		System.out.println(n);
		n *= 2;
		System.out.println(n);
		n /= 2;
		System.out.println(n);
		n %= 2;
		System.out.println(n);
//----------------------------------------------------------------					
//	 	e. 증감 연산자
		// - ++(증가), --(감소)
		// - 1항 연산자
		// - 피연산자는 숫자형을 가진다.
		// - 누적 연산을 한다.
		// - 기존의 값에 1을 더하거나(++). 1을 뺀다(--).
		// - ***연산자와 피연산자의 위치를 바꿀수 있다.
		// - **** 연산자의 위치에 따라 연산자의 우선 순위가 달라진다.
		// 		1. ++n: 전위배치(전치) -> 연산자 우선 순위가 가장 높다.
		// 		2. n++: 후위배치(후치) -> 연산자 우선 순위가 가장 뒤로간다.
		n = 10;
	
		//n = n + 1;
		//n += 1;
		//++n;
		// --> 3가지 종류가 모두 같은 의미 이다.
		//System.out.println(n);
		//n = n - 1;
		//n -= 1;
		//--n;
		System.out.println(n);
		int result  = 0;
//		resolt = 10 + ++n;
		++n;
		result = 10 + n;
//		System.out.println(resolt);
		
//		resolt = 10 + n++;
		result = 10 + n;
		++n;
		System.out.println(result);
		System.out.println(n);		
		//----------------------------------------------------------------		
		
		
//	 	f. 조건 연산자
		// - ?:
		// - 3항 연산자
		// - A ? B : C
		// - A -> boolean -> 조건으로 사용
		// - B, C -> 상수, 변수 -> 연산의 결과로 사용
		// - A가 참이면 B를 반환, A가 거짓이면 C를 반환
		int age = 25;
		System.out.println(age >= 18 ? "통과" : "거절");
		// - if문 보다 활용성이 좋다.
		
		

//	 	
//	 2. 형태(피연산자 개수)
//	 	a. 1항 연산자,단항연산자
//	 	b. 2항 연산자
//	 	c. 3항 연산자
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
