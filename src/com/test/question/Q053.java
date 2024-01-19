package com.test.question;

public class Q053 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 5; j++) {
				System.out.printf("%d x %d = %2d", j, i, j * i);
				System.out.print("      ");
			}
			System.out.println();
		}
		System.out.println();
		for (int a = 1; a <= 9; a++) {
			for(int b = 6; b <= 9; b++) {
				System.out.printf("%d x %d = %2d", b, a, b * a);
				System.out.print("      ");
			}
			System.out.println();
		}
	}//main

}
