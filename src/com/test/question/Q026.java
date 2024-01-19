package com.test.question;

import java.util.Scanner;

public class Q026 {
	
	public static void main(String[] arg) {
		
		Scanner integer = new Scanner(System.in);
		System.out.print("점수: ");
		int num = integer.nextInt();
		
		if ( num >= 0 && num < 101 ) {
			if ( num >= 90 && num <= 100) {
				System.out.printf("입력한 %d점은 성적 A입니다.", num);
			} else if ( num >= 80 && num <= 89 ) {
				System.out.printf("입력한 %d점은 성적 B입니다.", num);				
			} else if ( num >= 70 && num <= 79 ) {
				System.out.printf("입력한 %d점은 성적 C입니다.", num);				
			} else if ( num >= 60 && num <= 69 ) {
				System.out.printf("입력한 %d점은 성적 D입니다.", num);				
			} else if( num <= 59 ){
				System.out.printf("입력한 %d점은 성적 E입니다.", num);				
			} 
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
	
	}//main

}
