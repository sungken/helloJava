package com.test.question;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 4; i++) {
			System.out.print("숫자: ");
			int num1 = sc.nextInt();
			nums[i] = num1;
		}
		for (int i = 4; i >= 0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
			
		}
		
		
		
	}//main

}
