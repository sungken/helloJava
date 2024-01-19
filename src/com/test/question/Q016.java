package com.test.question;

public class Q016 {
	public static void main(String[] arg) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);

	}//main

	private static void sum(int i, int j, int k, int l, int m) {
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n", i, j, k, l, m, i + j + k + l + m);				

	}//sum(int i, int j, int k, int l, int m) 

	private static void sum(int i, int j, int k, int l) {
		
		System.out.printf("%d + %d + %d + %d = %d\n", i, j, k, l, i + j + k + l);				
		
	}//sum(int i, int j, int k, int l)

	private static void sum(int i, int j, int k) {
		
		System.out.printf("%d + %d + %d = %d\n", i, j, k, i + j + k);		

	}//sum(int i, int j, int k)

	private static void sum(int i, int j) {
		
		System.out.printf("%d + %d = %d\n", i, j, i + j);		
		
	}//sum(int i, int j)

	private static void sum(int num) {
		
		System.out.printf("%d = %d\n", num, num);
		
	}//sum(int num)

}
