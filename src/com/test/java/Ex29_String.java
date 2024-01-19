package com.test.java;

import java.util.Scanner;

public class Ex29_String {

	public static void main(String[] args) {

		// 문자열, String
		// - String class에서 문자열 조작에 관련된 기능 제공

		// m1();//문자열 생성
		// m2();//-문자열 추출
		// m3();//-문자열 추출(주민등록 번호)
		// m4();//- 문자 추출(영어 소문자로만)
		// m5();//m4번을 쉽게
		// m6();//문자열 공백 제거
		// m7();//- 문자열 검색
		// m8();//- int indexOf(char c) 연습문제
		// m9();//대소문자 변경 메소드
		// m10();//패턴 검색
		//m11();// m7과 같은 결
		//m12();
		//m13();//문자열 포함 여부 확인 메소드.contains
		//m14();//문자열 치환(바꾸기) - String replace(char old, char new)
		m15();// 문자열 분리 - String replace(char old, char new)

	}// main

	private static void m15() {
		
		//문자열 분리
		//- String[] split(String delimiter)
		
		String txt = "홍길동, 아무개, 아무개. 하하하, 호호호, 후후후";
		
		String[] list = txt.split(",");// 구분자 ","는 사라짐
		
		//정규 표현식 --> .을 찾고 싶을때 \\.으로 찾아야 한다. --> \\|도 마찬가지
		for (int i = 0; i < list.length; i++) {
			System.out.println("이름: " + list[i].trim());
		}
		
	}//m15

	private static void m14() {
		
		//문자열 치환(바꾸기)
		//- String replace(char old, char new)
		//- String replace(String old, String new)
		
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판 글을 씁니다, 바보야!!";
		String word = "바보";
		
		//masking
		System.out.println(content.replace(word, "**"));
		
		
		txt = "    하나     둘    셋     	";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		System.out.println(txt.replace("하나", ""));
		
		
		
	}//m14

	private static void m13() {
		
		//문자열 검색
		//- indexOf
		//- lastIndexOf
		//- boolean contains(String s)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		if (txt.indexOf("홍길동") > -1) {
			System.out.println("O");
		}
		if (txt.contains("홍길동")) {//문자열 포함 여부 확인
			System.out.println("O");
		}
		
		
		
		
		
		
		
	}//m13

	private static void m12() {
	
		//문자열 추출
		//- String substring(int beginIndex, int endIndex)
		//- String substring(int beginIndex)
		//- beginIndex: 포함(inclusive)
		//- endIndex: 미포함(exclusive)
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(0));
		System.out.println(txt.substring(3,7));
		System.out.println(txt.substring(3));
		
		System.out.println(txt.charAt(4)); // char입니다. > 문자 코드값 알아낼수 있음 
		System.out.println(txt.substring(4, 5)); // String > 문자코드값 X
		System.out.println();
		
		String jumin = "970410-2098765";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		//몇 년생?
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); 
		//빈문자열을 더하면 char이 아니라 String이 된다.
		System.out.println(jumin.substring(0, 2));
		
		//몇 월생?
		System.out.println(jumin.substring(2, 4));
		
		//몇 일생?
		System.out.println(jumin.substring(4, 6));
		
		//파일 경로
		
		String path = "C:\\class\\code\\java\\Hello.java";
		//1. 파일명 추출 > Hello.java
		
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1);
		System.out.println("파일명: " + filename);
		
		//2. 파일명 > 확장자 없이 순수 파일명만 추출 > (Hello)
		index = filename.lastIndexOf(".");
		filename.substring(0, index);
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println("순수 파일명: " + filenameWithoutExtension);
		
		//3. 확장자만 추출 > .java
		String extension = filename.substring(index);
		System.out.println("확장자: " + extension);
		
		
	}//m12

	private static void m11() {

		// ***문자열 검색***
		// - 문자열 내에서 원하는 문자(열)을 검색 > 발견된 위치 (index) 반환
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int beginIndex)
		// - int indexOf(String s, int beginIndex)

		// - int lastindexOf(char c)
		// - int lastindexOf(String s)
		// - int lastindexOf(char c, int beginIndex)
		// - int lastindexOf(String s, int beginIndex)
		
		String txt = "홍길동 자바 아무개 자바 테스트";
		
		System.out.println(txt.indexOf("자바"));//4
		System.out.println(txt.indexOf("자바", 6));//11
		
		System.out.println(txt.lastIndexOf("자바"));
		System.out.println(txt.lastIndexOf("자바", 10));
		
		
		
		
	}// m11

	private static void m10() {

		// 패턴 검색
		// - boolean startsWith(String word)
		// - booelan endWith(String word)

		String name = "홍길동";

		// 이 사람이 "홍"씨?? > boolean
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));// 앞에 있는 문자열이 시작하는 문자입니까?

		// '동'으로 끝나는지?
		System.out.println(name.charAt(name.length() - 1) == '동');
		System.out.println(name.indexOf('동') == name.length() - 1);
		System.out.println(name.endsWith("동"));

		// 자원 경로
		String path = "C:\\class\\code\\java\\Hello.java";

		// 위의 자원이 java소스 파일인가? --> 확장자 검사할때 많이 쓰임
		if (path.endsWith(".java")) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

	}// m10

	private static void m9() {

		// 대소문자 변경
		// - String toUpperCase()
		// - String toLowerCase()

		String content = "오늘 수업하는 과목은 JAVA입니다.";
		String word = "java";

		System.out.println(content.toUpperCase());
		// System.out.println(content.toLowerCase());
		System.out.println(word.toUpperCase());

		// 대소문자 구분(Case sensitive)
		// - 정확도가 높음
		// - 검색율이 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("검색 결과 O");
		} else {
			System.out.println("검색 결과 X");
		}

		// 메서드().메서드().메서드() ---> 메서드 체이닝

		// 대소문 구분X (Case insensitive)
		// - 검색율 높음
		// - 정확도 낮음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("검색 결과 O");
		} else {
			System.out.println("검색 결과 X");
		}

	}// m9

	private static void m8() {

		// 게시판 글쓰기 > 금지어!!
		String stop = "바보"; // 금지어

		String content = "안녕하세요. 바보야저는 자바를 배우는 학생입니다.";

		if (content.indexOf(stop) > -1) {
			System.out.println("금지어 금지!!");
		} else {
			System.out.println("글쓰기 처리");

		}

		String[] stops = { "바보", "멍청이", "메롱", "ㅂㅏㅂㅗ" };

		for (int i = 0; i < stops.length; i++) {
			if (content.indexOf(stops[i]) > -1) {
				System.out.println("금지어 금지!!");
				break;
			}
		}

	}// m8

	private static void m7() {

		// ***문자열 검색***
		// - 문자열 내에서 원하는 문자(열)을 검색 > 발견된 위치 (index) 반환
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int beginIndex)
		// - int indexOf(String s, int beginIndex)

		String txt = "안녕하세요. 홍길동 입니다.";

		int index = -1;

		index = txt.indexOf('하');
		System.out.println(index);// 발견된 위치를 알려준다

		index = txt.indexOf('홍');
		System.out.println(index);// 발견된 위치를 알려준다

		index = txt.indexOf("상");
		System.out.println(index);

		index = txt.indexOf("홍길동");
		System.out.println(index);

		txt = "안녕하세요. 홍길동입니다. 반삽습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";

		index = txt.indexOf("홍길동");// 처음 문자를 찾았을때 Stop 중복 문자는 찾지 못함
		System.out.println(index);

		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);

		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);

	}// m7

	private static void m6() {

		// 문자열 공백 제거
		// - String trim()
		// - 문자열에 존재하는 공백(whitespace > 스페이스, 탭, 개행)을 제거하는 메서드
		String txt = "     하나     둘  	셋		";
		System.out.printf("[%s]\n", txt.trim());// 문자열의 시작과 끝에 존재하는 공백문자를 제거한다.

		System.out.println("자바".equals("자바"));
		System.out.println(" 자바 ".trim().equals("자바"));

	}// m6

	private static void m5() {

		Scanner scan = new Scanner(System.in);

		System.out.print("단어: ");
		String word = scan.nextLine();

		if (isVaild(word)) {
			System.out.println("소문자 O");
		} else {
			System.out.println("소문자 X");
		}

	}// m3

	private static boolean isVaild(String word) {

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

			if (c < 'a' || c > 'z') {
				return false;

			}
		}
		return true;
	}

	private static void m4() {

		// 단어 입력
		// - 영어 소문자로만

		Scanner scan = new Scanner(System.in);

		System.out.print("단어: ");
		String word = scan.nextLine();

//		System.out.println(word.charAt(0));
//		System.out.println(word.charAt(1));
//		System.out.println(word.charAt(2));

		boolean result = true;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

//			if (c >= 'a' && c <= 'z') {
//				System.out.println("소문자 O");
//			} else {
//				System.out.println("소문자 X");
//				
//			}
			/// *** 꿀팀(유효성 검사는 잘못된 것을 찾는 조건을 만드는것이 쉽다.(좋다))

			if (c < 'a' || c > 'z') {
				System.out.println("소문자 X");
				result = false;
				break;
			}

		}
		System.out.println(result);
		if (result) {
			System.out.println("소문자O");
		} else {
			System.out.println("소문자X");
		}

	}// m4

	private static void m3() {

		// 주민등록 번호
		// ex) 중간에 "-" 꼭 넣어주세요

		Scanner scan = new Scanner(System.in);

		System.out.println("주민번호 입력('-'필수): ");

		String jumin = scan.nextLine();

		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}

	}// m3

	private static void m2() {

		// 문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메서드

		String txt = "안녕하세요. 홍길동 입니다";

		System.out.println(txt.charAt(0));
		txt.charAt(0);

		char c = txt.charAt(4);
		System.out.println(c);

		// 에러 글자의 크기보다 크게 출력하면 에러
//		c = txt.charAt(15);
//		System.out.println(c);

		c = txt.charAt(txt.length() - 1);
		System.out.println(c);

	}// m3

	private static void m1() {

		// 문자열 생성
		// 1. 리터럴
		// 2. 객체생성

		// 1.
		String str1 = "홍길동";

		// 2. 정석
		String str2 = new String("홍길동");

		// 문자열 == 문자의 집합
		// String == char[]

		// 문자열 길이
		// - int lenth()

		String txt = "홍길동";
		System.out.println(txt.length());// 문자의 수를 알수 있는 메서드
		System.out.println("자바".length());
		System.out.println("ABC한글123!@#".length());

		// 요구사항 - 사용자 입력 > 문자수 ?
		Scanner scan = new Scanner(System.in);

		System.out.print("문장 입력: ");
		String statement = scan.nextLine();

		System.out.printf("%s > %d문자\n", statement, statement.length());

		// 유효성 검사
		// - 이름 입력
		// - 2자 ~ 5자

		System.out.print("이름: ");
		String name = scan.nextLine();

		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름");

		} else {
			System.out.println("이름을 2 ~ 5자 이내로 입력하세요.");
		}

	}/// m1

}
