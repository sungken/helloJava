package com.test.question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q122 {

	public static void main(String[] args) throws IOException {
		
		//요구사항 - 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		//조건 - 합격 조건: 3과목 평균 60점 이상
		//조건 - 과락 조건: 1과목 40점 미만
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\성적.dat"));
		String line = null;
		String studentName = "";
		String studentName2 = ",";
		
		try {
			System.out.println("[합격자]");
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				if(kor > 0 && kor > 40 && eng > 0 && eng > 40 && math > 0 && math > 40) {
					if((kor + eng + math) / 3 > 60 && (kor + eng + math) / 3 <= 100) {
						System.out.println(name);
					}
				} else {
					studentName += (name + studentName2);
				}
			}
			
			String[] str = studentName.split(",");
			System.out.println();
			System.out.println("[불합격자]");
			
			for(String s : str)
			System.out.println(s);
			
			
		} catch (Exception e) {

		
		}
		
		
	}// main

}// Q122
