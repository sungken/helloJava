package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q043 {
//----------------다시
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//컴퓨터가 1~10 사이의 숫자 1개를 생각하면 
		//사용자가 맞추는 프로그램을 구현하시오.
		
		//조건 - 시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();
		int random = (int)(Math.random() * 10 + 1);
		
		for (int i = 1; i <= 10 ;i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if(random == num) {
				System.out.print("맞았습니다.\n");
				System.out.println();
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다\n", i);
					break;
			} else if (i == 10){
				System.out.print("틀렸습니다.\n");	
				System.out.println();
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
				System.out.println("모든 기회를 실패했습니다.");
			} else {
				System.out.print("틀렸습니다.\n");				
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
				
		
		
		
	}//main

}
