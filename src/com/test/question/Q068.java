package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {
		
		//요구사항 - 배열의 요소를 삭제하시오.
		//조건 - 배열 길이: 10
		// - 마지막 요소는 0으로 채우시오.
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("삭제 위치: ");
		int index = sc.nextInt();
		
		int[] list = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		System.out.println("원본: " + Arrays.toString(list));
		
		for(int i = index; i < list.length - 1; i++) {
			list[i] = list[i + 1];
		}
		list[list.length - 1] = 0;
		System.out.println("결과: " + Arrays.toString(list));
		
	}//main

}


