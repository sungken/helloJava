package com.test.java;

//import com.test.java.aaa.Yellow;
import com.test.java.bbb.Yellow;

public class Ex44_package {

	public static void main(String[] args) {
		
		//패키지, Package
		//- 클래스를 저장하기 위한 폴더
		//- 많은 클래스들을 체계적으로 관리하기 위한 용도
		//- 파일/폴더: C:aaa/bbb/ccc
		//- 패키지:aaa.bbb.ccc > 라고 읽는다.
		//-  . : 멤버 접근 연산자
		
		// 기본적으로 모든 코드는 자신과 같은 패키지내레 있는 모든 요소글은 인식이 가능하다.
		// 패키지가 다르면 인식이 불가능 하다.
		
		//패키지 + 접근 지정자
		//1. private > 100% 비공개
		//2. public > 100% 공개
		//----------------
		
		//3. pritected
		//	- 같은 패키지 내에서는 100% 공개
		//	- 다른 패키지에서는 100% 비공개
		//	- 다른 패키지에 있어도 자식클래스라면 100% 공개
		
		//4. (default) > 패키지 접근 지정자
		//	   - 같은 패키지 내레서는 100% 공개
		//	   - 다른 패키지에서는 100% 비공개
		
		
		
		//다른 패키지의 class가지고 오는 방법
		com.test.java.aaa.Red r1 = new com.test.java.aaa.Red();// 기본으로 임폴트 없이 가져오는 방법
		Yellow y1 = new Yellow(); // import키워드 이용 하는 방법
		com.test.java.aaa.Yellow y2 = new com.test.java.aaa.Yellow();
		
		
	}// main

}// Ex44_package
