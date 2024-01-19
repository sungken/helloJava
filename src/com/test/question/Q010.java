package com.test.question;

public class Q010 {

	public static void main(String[] args) {
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
//		digit(-1);
//		digit(1243512346);
//		digit(4);
	}//main

	private static void digit(int num) {
		
		//int num -> String으로 형 변환 1000단위 이상 바로 출력하기 위한 변수
		String str = Integer.toString(num);
		//3항 연산자 ->  true일경우 1의 자리는 "000", 10의 자리는 "00", 100의 자리는 "0" 추가, false경우 str변수로 num값 그대로 출력
		String math = num > 0 && num <= 9 ? "000" + num : num > 10 && num <= 99 ? "00" + num : num > 100 && num <= 999 ? "0" + num : str;
		System.out.printf("%d -> %s\n", num, math);
	}//digit

}
