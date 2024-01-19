package com.test.java.obj.inheritance;

public class Ex41_Overriding {

	public static void main(String[] args) {
		
		//면접!!! 알아두기*** (둘의 공통점은 없다.)
		
		//메서드 오버로딩, Method Overloading
		//- 메서드 이름을 동일 x N 생성
		
		//메서드 오버라이딩, Method Overriding
		//- 클래스 상속할때 발생
		//- 메서드 재정의 > 상속받은 메서드를 수정하는기술
		
		OverridingParent hong = new OverridingParent();
		
		hong.name = "홍길동";
		// void com.test.java.obj.inheritance.OverridingParent.hello()
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		
		jhong.name = "홍철수";
		//void com.test.java.obj.inheritance.OverridingChild.hello()	
		jhong.hello();
		//jhong.hi();

		
	}// main

}// Ex41_Overriding


//동네 사람
class OverridingParent{
	
	public String name;//변수
	
	public void hello() {//메서드
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
		
	}
	
}

class OverridingChild extends OverridingParent {
	
//	public void hi() {
//		System.out.printf("하이~ 방가~ 난 %s야~\n", this.name);
//	}
	public void hello() {
		System.out.printf("하이~ 방가~ 난 %s야~\n", this.name);
	}
	
}





























