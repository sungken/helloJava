package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex66_Lambda {

	public static void main(String[] args) {
		
		m1();
		
		
		
		
		
		
		
		
	}// main

	private static void m1() {
		
		//배열, 컬렉션 정렬 > sort(익명 객체)
		Random rnd = new Random();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			nums.add(rnd.nextInt(30) + 1);
		}
		
		System.out.println(nums);
		
//		Collections.sort(nums, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		
		//역순 정렬 - 람다식
		Collections.sort(nums, (o1, o2) -> o2 - o1);
		System.out.println(nums);
		
		//오름차순 정렬 - 람다식
		nums.sort((o1, o2) -> o1 - o2);
		System.out.println(nums);
		
		
	}

}// Ex66_Lambda







