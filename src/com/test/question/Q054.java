package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
		String a = "";
		for (int i = 2; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i / j == 0) {
					System.out.print(i);
				}
			}
		}
		
		
		
	}//main

}
