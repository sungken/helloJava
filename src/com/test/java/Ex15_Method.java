package com.test.java;

public class Ex15_Method {

	public static void main(String[] args) {
		
		//public static void hello()
		
		// void -> 반환타입
		// hello -> 메서드명 -> ***메서드 명은 캐멀 표기법
		// () -> 인자리스트
		
		//메서드 인자리스트
		//파라미터(Parameters), 인자(Arguments), 매개변수
		
		//요구사항 - '홍길동'에게 인사하는 메서드를 구현하기오.
		//요구사항 - '아무개'에게 인사하는 메서드를 구현하기오.
		//요구사항 - '테스트'에게 인사하는 메서드를 구현하기오.
		hello();
		hello2();
		hello3();
		helloEveryOne("홍길동");
		helloEveryOne("아무개");
		helloEveryOne("테스트");//실인자(Real Args)
		
		checkAge(25);
		checkAge(40);
		checkAge(90);
		checkAge(5);
		long a = 22;
		checkAge((int)a);
		
		checkScore(80, 80, 80);
		
		
		
	}//main
	/**
	 * 성적을 평가합니다.
	 * @param kor 국어 점수
	 * @param eng 영어 점수
	 * @param math 수학 점수
	 */
	public static void checkScore(int kor, int eng, int math) {
		
		int total = kor + eng + math;
		
		double avg = total / 3.0;
		
		String result = avg >= 60 ? "합격" : "불합격";
		
		System.out.printf("평균 점수 %.1f점은 %s입니다. \n", avg, result);
	}
	
	public static void checkAge(int age) {
		
		String result = age >= 18 ? "통과" : "거절";
		
		System.out.printf("입력한 나이 %d세는 %s입니다. \n", age, result);
	}
	
	public static void hello() {
		//구현부
		System.out.println("홍길동님. 안녕하세요.");
	}
	
	public static void hello2() {
		//구현부
		System.out.println("아무개님. 안녕하세요.");
	}
	
	public static void hello3() {
		//구현부
		System.out.println("테스트님. 안녕하세요.");
	}
	
	public static void helloEveryOne(String name) {//가인자(Formal Arge)
		//구현부
		//String name = "홍길동";
		System.out.println(name + "님. 안녕하세요.");
	}
	
	
}
