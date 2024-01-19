package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일 경로 : ");
		String path = sc.next();
		//String path = "F:\\class\\java\\file\\test.txt";
		File file = new File(path);
		
		String fileName = file.getName();
		String targetString = ".";
		
		int index = fileName.indexOf(targetString);
		String result = fileName.substring(index + targetString.length());
		
		if (file.exists()) {
			System.out.printf("파일명: %s\n", file.getName());
			System.out.printf("종류: %s 파일\n", result);
			System.out.printf("파일크기: %dB", file.length());
		} else {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
		
		
	}// main

}// Q110



