package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; ; i++) {
			
			if (sum < 1000) {
				System.out.print(i + " + ");
				sum += i;				
			} else {
				break;
			}
		}
		System.out.println("\b\b= " + sum);
		
	}//main

}
