package com.test.question;

import java.util.Arrays;
import java.util.Random;

public class Q064 {

	public static void main(String[] args) {
		
		//int randomNum = 0;
		
		int[] num = new int[20];
		System.out.print("원본: ");
		for (int i = 0; i < 20; i++) {
			int a = (int)(Math.random() * 20) + 1;
			num[i] += a;
			System.out.printf("%d, ", a);
		}
		System.out.println();
		Arrays.sort(num);
		System.out.printf("최댓값: %d\n", num[19], "");
		System.out.printf("최소값: %d\n", num[0]);
		
		
	}//main

}
