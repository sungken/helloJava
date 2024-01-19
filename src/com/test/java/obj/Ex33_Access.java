package com.test.java.obj;

public class Ex33_Access {
	
	
	public static void main(String[] arg) {
		
		//ex - OOO지정자(제어자
		//- 클래스 or 클래스 멤버 > 부가적인 기능을 제공하는 키워드
		
		//접근 지정자(제어자), Access Modifier
		//- 클래스 멤버에 붙어서 사용한다.(멤버 변수 or 멤버 메서드)
		//- 클래스 자체에 붙여서 사용한다.
		//- 지역 변수에는 사용이 불가능 하다.
		
		//1. public
		//- 오픈적으로 밖에서도 호출해서 수정이 가능하다.(찾을수 있다)
		
		//2. private
		//- private은 밖에서 수정할수 없게(찾을수 없게)한다
		
		//------------
		
		//3. protected
		//4. (defalt)
//		Book b1 = new Book();
//		b1.check();
//		
//		b1.a = 100;
//		b1.b = 200;
//		b1.check();
//		
		Book b1 = new Book();
		b1.title = "자바 개발서";
		b1.price = 25000;
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		
		Book b2 = new Book();
		b2.title = "코딩 테스트 문제집";
		b2.aaa(-5000);
		
		System.out.println(b2.title);
		System.out.println(b2.price);
		//System.out.println(b2.setPublisher(null));
		System.out.println(b2.price);
		
	}//main
	
}//Ex33_Access
