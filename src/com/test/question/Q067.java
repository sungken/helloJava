package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q067 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//요구사항 - 배열에 요소를 삽입하시오.
		//조건 - 배열 길이: 10
		//조건 - 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("삽입 위치: ");
		int index = Integer.parseInt(reader.readLine());
		
		System.out.print("값: ");
		int value = Integer.parseInt(reader.readLine());
		
		int[] list = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		System.out.println("원본: " + Arrays.toString(list));
		
		for (int i = list.length - 2; i >= index; i--) {
			list[i+1] = list[i];
		}
		list[index] = value;
		System.out.println("결과: " +Arrays.toString(list));
		
		

	}//main

}//Q067

