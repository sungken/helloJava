package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] num = new int[20];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 범위: ");
		int max = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위: ");
		int min = Integer.parseInt(reader.readLine());
		
		//String b = "";
		System.out.print("원본: ");
		for (int i = 0; i < 20; i++) {
			int a = (int)(Math.random() * 20)+1;
			num[i] += a;
			System.out.printf("%d, ", num[i]);
		}
		System.out.println();
		System.out.print("결과: ");
		for (int i = 0; i < 20; i++) {
			if (num[i] > min && num[i] < max ) {
				System.out.printf("%d, ", num[i]);
			}
			
		}
		System.out.println();

		
	}//main

}
