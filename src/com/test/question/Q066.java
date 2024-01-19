package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {
		
		//중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		//- 숫자의 범위: 1 ~ 45
		//- 오름차순 정렬
		
		int[] num = new int[6];
		
		for(int i = 0; i < 6 ; i++) {
			num[i] = (int)(Math.random() * 45)+1;
			for (int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(num);
		String a = "[ ";
		for(int i = 0; i < 6; i++) {
			a += num[i] + ", ";
		}
		//for (int i = 0; i)
		a += "]";
		System.out.println(a);
		
		
	}//main

}
