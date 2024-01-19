package com.test.java;

public class Ex02_Variable {

	public static void main(String[] args) {

		/*
		 
		 자료형 + 변수
		 변수 (Variable)
		 - 여러가지 값으로 변 할수 있는 수
		 - 개발자가 명령어를 사용해서 메모리에 할당받은 공간

		 */
		
		int kor;
		kor = 100;
		System.out.println(kor);
		
		/*
		 
		 학생 1명의 영어점수를 저장한 후 화면에 다시 출력하시오.
		 
		 1. 데이터의 성질을 파악 -> 영어점수
		 	a. 형태 -> 정수 / 실수 -> 정수
		 	b. 길이 -> 0 ~ 100
		 2. 1의 결과에 따라 적당한 자료형 선택
		 
		 3. 2번에서 선택한 자료형으로 변수 생성하기
		
		 */
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		//변수 (값) 수정하기
		eng = 95; //덮어쓰기
		System.out.println(eng);
		
		
		//수학점수 -> 80점

		byte math;
		math = 80;
		System.out.println(math);
		
		/*
		 변수명을 만들 때 규칙
		 1. 영문자 + 숫자 + '_' 만 사용한다.
		 
		 */
		// 지도 좌표(x, y)
		double x1; //우리집 x 좌표
		double y1; //우리집 y 좌표
		
		double x2, y2; //친구집 x, y 좌표
		
		double x3,  //마트 x좌표
			   y3;  //마트 y좌표
		
		//int m;
		//System.out.println(m);
		
		
		
		
		
		
		
		
		
		
	}

}
