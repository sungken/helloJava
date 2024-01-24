package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q124 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader reader1 
				= new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\검색_회원.dat"));
		BufferedReader reader2 
				= new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\검색_주문.dat"));
		System.out.print("이름: ");
		String member = reader.readLine();
		String line = null;
		
		System.out.println("====구매내역====");
		System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
		
		try {
			String[] temp = line.split(",");
			while ((line = reader1.readLine()) != null) {
				String num1 = temp[0];
				String num2 = temp[1];
				String num5 = temp[4];
				
				if (num2.equals(member)) {
					break;
				} 
			}
//			while ((line = reader2.readLine()) != null) {
//				String num3 = temp[1];
//				String num4 = temp[2];
//				String num6 = temp[3];
//				
//				if (num2.equals(member)) {
//					break;
//				} 
//			}
//			reader.close();
		} catch (Exception e) {
			//예외문 처리하는방버 ?
			System.out.println("요청하신 회원은 없습니다.");
			e.printStackTrace();
		}
		
		
	}// main

}//Q124




