package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행: ");
		int top = sc.nextInt();
		
		for (int i = 1; i <= top; i++) {
			for (int j = 0; j < top - i; j++) {
				System.out.print(" ");
			}
			char a = 97;
			int reflect = 0;
			for (int k = 0; k < i; k++) {
				System.out.print(a);
				//System.out.print(b);
				a += 1;
				reflect += 1;
			}
			for (int k = 0; k < i; k++) {
				System.out.print(a -= 1);
			}
		
			System.out.println();
		}

		
	}//main

}
