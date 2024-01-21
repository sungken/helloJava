package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class Q120 {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			BufferedReader reader = 
					new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\이름수정.dat"));
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter("C:\\class\\code\\java\\파일 입출력 문제\\이름수정_변환.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				line = line.replace("유재석", "메뚜기");
				line = line.replace(".", ".\r\n");
				writer.write(line);
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");

		} catch (Exception e) {
			System.out.println("??????????????");
			e.printStackTrace();
		}

	}// main

}// Q120
