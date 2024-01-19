package com.test.question;

public class Q018 {
	public static void main(String[] arg) {
		
		positive(10);
		positive(10, 20);
		positive(10, 20, -30);
		positive(10, 20, -30, 40);
		positive(10, 20, -30, 40, 50);
		
	}//main

	private static void positive(int i, int j, int k, int l, int m) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		if ( i > 0 ) {
			num1 = 1;
		}else {
			num1 = 0;
		}
		if( j > 0) {
			num2 = 1;
		}else {
			num2 =0;
		}
		if( k > 0) {
			num3 = 1;
		}else {
			num3 =0;
		}
		if( l > 0) {
			num4 = 1;
		}else {
			num4 =0;
		}
		if( m > 0) {
			num5 = 1;
		}else {
			num5 =0;
		}
		int integer = num1 + num2 + num3 + num4 + num5;
		System.out.printf("양수: %d개\n", integer);
		
	}//positive(int i, int j, int k, int l, int m)

	private static void positive(int i, int j, int k, int l) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		if ( i > 0 ) {
			num1 = 1;
		}else {
			num1 = 0;
		}
		if( j > 0) {
			num2 = 1;
		}else {
			num2 =0;
		}
		if( k > 0) {
			num3 = 1;
		}else {
			num3 =0;
		}
		if( l > 0) {
			num4 = 1;
		}else {
			num4 =0;
		}
		int integer = num1 + num2 + num3 + num4;
		System.out.printf("양수: %d개\n", integer);
		
	}//positive(int i, int j, int k, int l)

	private static void positive(int i, int j, int k) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		if ( i > 0 ) {
			num1 = 1;
		}else {
			num1 = 0;
		}
		if( j > 0) {
			num2 = 1;
		}else {
			num2 =0;
		}
		if( k > 0) {
			num3 = 1;
		}else {
			num3 =0;
		}
		int integer = num1 + num2 + num3;
		System.out.printf("양수: %d개\n", integer);
		
	}//positive(int i, int j, int k)

	private static void positive(int i, int j) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		if ( i > 0 ) {
			num1 = 1;
		}else {
			num1 = 0;
		}
		if( j > 0) {
			num2 = 1;
		}else {
			num2 =0;
		}
		int integer = num1 + num2;
		System.out.printf("양수: %d개\n", integer);
		
	}//void positive(int i, int j)

	private static void positive(int num) {
		
		int integer = (num > 0) ? 1 : 0;
		System.out.printf("양수: %d개\n", integer);
		
	}//positive(int num)

}
