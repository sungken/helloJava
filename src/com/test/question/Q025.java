package com.test.question;

import java.util.Scanner;

public class Q025 {

	public static void main(String[] args) {
		
		System.out.print("첫번째 숫자 입력: ");
		Scanner numOne = new Scanner(System.in);
		int num1 = numOne.nextInt();

		System.out.print("두번째 숫자 입력: ");
		Scanner numTwo = new Scanner(System.in);
		int num2 = numTwo.nextInt();
		
		if (num1 > num2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이 납니다.\n", num1, num2, num1 - num2);
		} else if (num1 < num2){
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이 납니다.\n", num2, num1, num2 - num1);			
		} else {
			System.out.printf("두 숫자는 동일합니다.");						
		}
		
	}//main

}
