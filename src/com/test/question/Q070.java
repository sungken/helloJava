package com.test.question;

public class Q070 {

	public static void main(String[] args) {
		int num = 1;
		int num2 = 10;
		
		for(int i = 1; i < 4; i++) {
			for (int j = num; j < num + 5; j++) {
				System.out.printf("%3d", j);
			}
			num += 10;
			System.out.println();
			if (num2 < 26) {
				for (int k = num2; k > num2 - 5; k--) {
					System.out.printf("%3d", k);
				}
				num2 += 10;
				System.out.println();
			}
		}
		System.out.println();
		
		
	}//main

}
