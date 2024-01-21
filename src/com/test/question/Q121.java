package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q121 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\파일 입출력 문제\\숫자.dat"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\파일 입출력 문제\\숫자 수정.txt"));

		String line = null;

		try {
			while ((line = reader.readLine()) != null) {
				line = line.replace("0", "영");
				line = line.replace("1", "일");
				line = line.replace("2", "이");
				line = line.replace("3", "삼");
				line = line.replace("4", "사");
				line = line.replace("5", "오");
				line = line.replace("6", "육");
				line = line.replace("7", "칠");
				line = line.replace("8", "팔");
				line = line.replace("9", "구");
				line = line.replace(". ", ". \r\n");
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

}// Q121
