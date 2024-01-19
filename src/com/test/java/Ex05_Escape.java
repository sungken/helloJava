package com.test.java;

public class Ex05_Escape {
	
	public static void main(String[] arg) {
		
		// 특수문자 -> Escape Sequence
		// -컴파일러가 번역을 할 때, 소스의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		
		// 1. \n (Enter)
		String msg = "안녕하세요. \n홍길동 입니다.";
		System.out.println(msg);
		
		System.out.println();
		// 2. \r
		msg = "안녕하세요. \r홍길동 입니다.";
		System.out.println(msg);
		
		System.out.println("하나 \r\n둘");//정석
		System.out.println("하나 \n둘");//잘 사용
		
		msg = "하나\t둘\t셋\t넷";
		System.out.println(msg);
		
		//\b
		
		// \", \', \\
		msg = "홍길동: \"안녕하세요.\"";
		System.out.println(msg);
		
		//수업폴더의 경로를 출력하세요.
		System.out.println("C:\\class\\code\\java");
		
		
		
		
		
		
	}

}
