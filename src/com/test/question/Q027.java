package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q027 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자: ");
		int family = reader.read();
		
		if ( family == 70 ||  family == 102 ) {
			System.out.println("Father");
		} else if ( family == 77 ||  family == 109 ) {
			System.out.println("Mother");			
		} else if ( family == 83 ||  family == 115 ) {
			System.out.println("Sister");	
		} else if ( family == 66 ||  family == 98 ) {
			System.out.println("Brother");	
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}

	}//main

}
