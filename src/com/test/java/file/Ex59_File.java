package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_File {

	public static void main(String[] args) {
		
		//1. 파일/ 디렉처리 조작
		
		//2. 파일 > (내용)입출력
		//	a. 텍스트 입출력 > 수업
		//		- 메모장
		//		- 이클립스
		
		//	b. 비텍스트 입출력(바이너리)
		
		//파일 입출력
		//- 자바 프로그램 <-> 데이터 <-> 보조디억장치(HDD, SSD)
		//					->			->		: 쓰기(저장)
		//					<-			<-		: 읽기
		
		//자장 장치
		//- 데이터 1, 0 으로 저장
		//- 데이터의 자료형 규칙이 없음
		
		//인코딩, Encoding
		//- 문자 코드 (응용 프로스램 데이처)를 부호화(0, 1) 시키는 작업
		//- 자바 프로그램("홍길동", String) > 텍스트 파일(10101100110101011100)
		
		//디코딩, Decoding
		//- 부호 데이터를 문자코드로 변환하는 작업
		//- 텍스트 파일(10101100110101011100) > 자바 프로그램("홍길동", String)
		
		//인코딩, 디코딩 규칙
		//- 저장 장치 or 네트워크 상에서 데이터를 표현하는 규칙
		
		//1. ANSI
		
		//2. UTF
		//	2.1 UTF-8
		//	2.2 UTF-16
		
		//3. ISO-8859-1
		
		//4. EUC-KR
		
		//5. MS949
		
		//ANSI(ISO-8859-1, EUC-KR, MS949) 는 같다고 생각하면 된다.
		//- 영어, 숫자, 특수문자, 서유럽 문장 등 ASCII(~255): 1byte
		//- 한글, 한자, 일본어 등: 2byte
		
		//UTF-8 > 국제 표준에 가까움 > 자바 / 오라클 에서 사용
		//- 영어: 1byte
		//- 한글: 3byte
		
		//UTF-16 > 모든 문자를 2바이트로 저장
		//- 영어: 2byte
		//- 한글: 2byte
		
		//C:\class\code\java\file
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		
		//m6();
		//m7();
		
		m8();
		
		
		
		
		
		
	}// main

	private static void m8() {
		
		//성적 관리
		//- 성적표 출력
		//- 성적 파일(ex> score.dat)
		
		//데이터 구조 설계!!!!****
		//- 이름, 국어, 영어, 수학 
		
		System.out.println("============================================");
		System.out.println("	       성적표");
		System.out.println("============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]\t");
		
		try {
			
			// .을 넣으면 자바에 프로젝트 폴더를 자동으로 찾아준다.
			BufferedReader reader = new BufferedReader(new FileReader(".\\det\\score.txt")); // <<
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
//				System.out.println(line); // == 학생 1명
				
			String[] temp = line.split(",");
			String name = temp[0];
			int kor = Integer.parseInt(temp[1]);
			int eng = Integer.parseInt(temp[2]);
			int math = Integer.parseInt(temp[3]);
			int total = kor + eng + math;
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
						, name, kor, eng, math, total, avg);
			}
			
			
			reader.close();
			
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
		
		
		
	}//m8

	private static void m7() {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("자바 파일명: "); //Ex01_DetaType.java
			String filename = sc.nextLine();
			
			//C:\class\code\java\JavaTest\src\com\test\java\파일명
			
			String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1;
			
			while((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n", number, line);
				number++;
			}
			
			reader.close();
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
		
		
		
	}//m7

	private static void m6() {
		
		//FileOutputStream > FileWriter > BufferedWriter
		//FileInputStream > FileReader > BufferedReader
		
		try {
			
//			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
//			
//			writer.write(65); //문자코드 -> A로 나옴
//			writer.newLine(); // == writer.writer("\r\n") 엔터키와 같다.
//			writer.write("문자열");
//			
//			writer.close();
			
//			BufferedReader writer = new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"));
			
			//reader.read(); > 
//			String line = reader.readLine();
//			System.out.println(line);
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
		
		
		} catch (Exception e) {
			System.out.println("Ex59_File.m6");
			e.printStackTrace();
		}
		
		
		
	}//m6

	private static void m5() {
		
		try {
			
			//파일 읽기
			// FileIutputStream 의 버전업 > FileReader 이다.
			//1. 문자 단위 읽기(2byte)
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");
			
			int code = -1;
			
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			
			
//			int code = reader.read();
//			System.out.println((char)code);
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
		
		
		
	}// m5

	private static void m4() {
		
		//메모장 구현 > 콘솔 버전
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String filename = sc.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\" + filename);
			
			boolean loop = true;
			
			while(loop) {
				System.out.print("입력: ");
				String line = sc.nextLine();
				
				if(line.equals("q!")) {
					break;
				}
				
				writer.write(line); // 한줄 입력 > 한줄 쓰기
				writer.write("\r\n"); 

			}
			
			writer.close();
			System.out.println("end");
			
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
		
		
		
	}//m4

	private static void m3() {
		
		try {
			//파일 쓰기
			// FileOutputStream 의 버전업 > FileWriter 이다.
			//1. 문자열 쓰기 지원
			//2. 문자 단위 쓰기(2byte)
			
			//문서가 있거나 없거나 무조건 만들어 준다.
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt", true);
			
			writer.write("홍길동");
			System.out.println("end");
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
		
	}//m3

	private static void m2() {
		
		//파일 읽기 == 파일 입력
		try {
			
			//FileOutputStream <-> FileInputStream
			
//			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\data.txt");
			//한글 깨짐
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex21_If.java");
			
			//로직 기억
			int code = -1;
			
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			stream.close(); // 입 출력 상관없이 모든 스트림은 마지막에 종료해야 한다.
			
			
//			for(int i = 0; ; i++) {
//				int code = stream.read();
//				System.out.print((char)code);
//				 
//			}
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
		
	}// m2

	private static void m1() {
		
		//파일 입출력
		
		//파일 쓰기 == 파일 출력
		//쓰기 스트림 객체, Stream 
		
		try {
			
			//텍스트 파일 참조
			File file = new File("C:\\class\\code\\java\\file\\data.txt");
			
			//파일 객체 > 스트림 생성
			//쓰기 스트림 모드
			//1. Create Mode > 기본 값 > new FileOutputStream(file)
			//2. Append Mode > 이어쓰기 모드 > new FileOutputStream(file, true)
			FileOutputStream stream = new FileOutputStream(file, true);
			
			
//			char c = 'A';
//			
//			stream.write((int)c); // 문자코드를 사용해서 파일에 문자를 작성
//			stream.write('B');
//			stream.write('C');
//			
//			stream.close(); // 스트림 닫기(실제 저장)
//			//stream.write('C'); // 스트림이 닫치면 추가하지 못한다.
//			
//			stream = new FileOutputStream(file, true);// 다시 추가해야 추가할수 있다.
//			stream.write('ㅋ');
			
			String txt = "Hello Java";
			
			for(int i = 0; i < txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			stream.close(); // 스트림 닫기(실제 저장)
			
			System.out.println("end");
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m1");
			e.printStackTrace();
		}
		
		
		
		
	}// m1

}// Ex59_File
