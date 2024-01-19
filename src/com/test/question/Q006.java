package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {

		
		System.out.print("한달 수입 금액(원): ");
		Scanner sc = new Scanner(System.in);
		double suIp = sc.nextDouble(); 
		
		double a = (suIp * 0.033);
		double seHu = (suIp - (suIp * 0.033));
		System.out.printf("세후 금액(원): %,.0f원\n", seHu);
		System.out.printf("세금(원) : %,.0f원", a);
		
		
		
		
		
		
		
		
		
		
	}

}
