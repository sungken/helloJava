package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q013 {
	public static void main(String[] arg) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어: ");
		//BufferReader 함수로 String kor 국어 점수 입력
		String kor = reader.readLine();
		//String kor 을 int kor2로 형 변환
		int kor2 = Integer.parseInt(kor);
		//위와 동일
		System.out.print("영어: ");
		String eng = reader.readLine();
		int eng2 = Integer.parseInt(eng);
		//위와 동일
		System.out.print("수학: ");
		String math = reader.readLine();
		int math2 = Integer.parseInt(math);
		
		test(kor2, eng2, math2);
		
	}//main

	private static void test(int kor, int eng, int math) {
		//kor 점수가 0 ~ 100 사이인지 확인
		if ( kor > 0 && kor < 101) {
			//eng 점수가 0 ~ 100 사이인지 확인
			if ( eng > 0 && eng < 101 ) {
				// math 점수가 0 ~ 100 사이인지 확인
				if ( math > 0 && math < 101 ) {
					//평균 점수가 41 ~ 100 사이인가 맞으면 "합격", 틀리면 "불합격" 출력
					if (((kor + eng + math) / 3) > 40) {
						System.out.println("합격");
					} else if (((kor + eng + math) / 3) <= 40){
						System.out.println("불합격");						
					}else {
						System.out.println("0 ~ 100 사이 정수로 다시 입력하시오.");
					}
				} else {
					System.out.println("0 ~ 100 사이 정수로 다시 입력하시오.");
				}
			} else {
				System.out.println("0 ~ 100 사이 정수로 다시 입력하시오.");
			} 
		} else {
			System.out.println("0 ~ 100 사이 정수로 다시 입력하시오.");
		}
	}//test

}
