package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex71_File {

	private static String data;
	
	static {
		data = "C:\\class\\code\\java\\JavaTest\\det\\data.txt";
	}
	
	
	public static void main(String[] args) throws IOException {
		
		/*
		 파일 입출력
		 - 읽기
		 - 쓰기
		 - 수정하기(X)
		 */
		//m1();
		//m2();
		//m3(); // 삭제 수정
		m4();
		
		
		
		
		
		
	}//main

	private static void m4() {

		try {

			// 수정할 파일을 복사해서 수정
			BufferedReader reader = new BufferedReader(new FileReader(data));

			String txt = "";
			String line = null;

			while ((line = reader.readLine()) != null) {
					txt += line.replace("둘", "two") + "\r\n";;
			}

			// 수정된 파일을 가지고 원본 파일에 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));

			writer.write(txt);

			reader.close();
			System.out.println(txt);
			writer.close();
			System.out.println("complate");

		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}

	}// m4

	private static void m3() {
		
		try {
			
			// 수정할 파일을 복사해서 수정
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String txt = "";
			String line = null;
			
			while ((line = reader.readLine()) != null) {

				if(!line.equals("셋")) {
					
					txt += line + "\r\n";
				
				}
			}
			
			//수정된 파일을 가지고 원본 파일에 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));
			
			writer.write(txt);
				
			reader.close();
			System.out.println(txt);
			writer.close();
			System.out.println("complate");
			
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}
		
		
		
	}//m3

	private static void m2() {
		
		try {
			//편집(=수정) > 일부내용 추가 /삭제
			BufferedWriter writer = new BufferedWriter(new FileWriter(data, true));
			
			writer.write("넷");
			writer.newLine();
			
			writer.write("다섯");
			writer.newLine();
			
			writer.close();
			System.out.println("complate");
			
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}
		
		
		
	}//m2

	private static void m1() throws IOException {
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));
			
			writer.write("하나");
			writer.newLine();
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			writer.newLine();
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m1");
			e.printStackTrace();
		}
		
		
		
	}//m1

}//Ex71_File




