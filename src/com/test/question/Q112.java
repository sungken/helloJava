package com.test.question;

import java.io.File;

public class Q112 {

	public static void main(String[] args) {
		
		//요구사항
		//지정한 파일을 다른 폴더로 이동하고, 
		//이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		
		//조건
		//- C:\class\java\file\AAA\test.txt 
		//  → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		
		//- BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		
		String path = "C:\\class\\java\\file\\AAA\\test.txt";
		File file = new File(path);
		
		if(file.exists()) {
			
		} else {
			System.out.println("메롱");
		}
		
		
		
		
	}// main

}//  Q112







