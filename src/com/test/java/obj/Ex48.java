package com.test.java.obj;

public class Ex48 {

	public static void main(String[] args) {

		// 1. 추상 클래스 or 인터페이스
		// 2. 업 캐스팅 or 다운 캐스팅

		// 상황] 프린터 대리점 운영
		// 1. LG100 모델 x 5대, HP200 모델 x 3대
		// 2. 하루 1번씩 > 제품 점검 > 모델과 상관없이 출력 기능 확인!!!

		// 추가 상황]
		// 1. 프린터 제고가 늘어났을때
		// - LG100 >> 500대
		// - HP200 >> 300대
		// 2. 프린터 종류 증가
		// - Dell300
		// - BenQ400
		// 3. 각 브랜드 별 고유 기능 점검
		// - LG100 > selfTest()
		// - HP200 > call()

		// m1();
		// m2();
		m3();

	}// main

	private static void m3() {

		LG100 lg1 = new LG100("LG100", 300000, "black", 100);
		Printer p1;

		// 업캐스팅
		// Printer = LG100
		// 부모 클래스 = 자식 클래스
		// 100% 안전
		p1 = lg1;

		// 자식 객체를 부모 변수에 넣을수 있다.
		Printer p2 = new LG100("LG100", 300000, "black", 100);
		Printer p3 = new HP200("HP200", 350000, "white");

		Printer[] plist = new Printer[3];
		plist[0] = new LG100("LG100", 300000, "black", 100);
		plist[1] = new HP200("HP200", 350000, "white");

		// Case 3.
		// - 배열 사용 + 업 / 다운 캐스팅
		Printer[] list = new Printer[8]; // LG(5), HP(3)

		for (int i = 0; i < list.length; i++) {
			if (i < 5) {
				list[i] = new LG100("LG100", 300000, "black", 100);
			} else if (i < 7) {
				list[i] = new HP200("HP200", 350000, "white");
			} else {
				list[i] = new Dell300("dell300", 350000);
			}
		}

		// 점검
		for (int i = 0; i < list.length; i++) {
			list[i].print();
			// list[i].selfTest();
			// list[i].call();

			// 다운 캐스팅
			//- 평소엔 형제 객체끼리 하나의 집합에서 관리 > 업캐스팅 사용
			//- 특별히 자신만의 멤버를 호출해야 항 때 > 다운캐스팅 사용
			if (list[i] instanceof LG100) {
				LG100 lg = (LG100) list[i];
				lg.selfTest();
			} else if (list[i] instanceof HP200){
				HP200 hp = (HP200) list[i];
				hp.call();
			}
			
			//연산자
			//- 객체 instanceof 자료형
			System.out.println(list[i] instanceof LG100);

		}

	}

	private static void m2() {
		// Case 2.
		// 배열 사용
		// - 같은 종류의 프린터를 조작 > 아주 가성비 높은 방식
		// - 다른 종류의 프린터가 증가 > 같은 패턴 증가
		LG100[] lg = new LG100[5];
		HP200[] hp = new HP200[3];
		Dell300[] dell = new Dell300[5];

		for (int i = 0; i < lg.length; i++) {
			lg[i] = new LG100("lg100", 300000, "black", 100);
		}

		for (int i = 0; i < hp.length; i++) {
			hp[i] = new HP200("HP200", 350000, "white");
		}
		for (int i = 0; i < dell.length; i++) {
		}

		// 점검
		for (int i = 0; i < lg.length; i++) {
			lg[i].print();
			lg[i].selfTest();
		}

		for (int i = 0; i < hp.length; i++) {
			hp[i].print();
			hp[i].call();
		}
	}

	private static void m1() {
		// Case 1.
		// - 가장 비효율적인 방식
		// - 대당 비용 동일
		LG100 lg1 = new LG100("LG100", 300000, "black", 100);
		LG100 lg2 = new LG100("LG100", 300000, "black", 100);
		LG100 lg3 = new LG100("LG100", 300000, "black", 100);
		LG100 lg4 = new LG100("LG100", 300000, "black", 100);
		LG100 lg5 = new LG100("LG100", 300000, "black", 100);

		HP200 hp1 = new HP200("hp200", 350000, "white");
		HP200 hp2 = new HP200("hp200", 350000, "white");
		HP200 hp3 = new HP200("hp200", 350000, "white");

		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();

		hp1.print();
		hp2.print();
		hp3.print();
	}

}// Ex48

//클래스의 부모 역할
//1. 일반 클래스
//2. 추상 클래스
//3. 인터페이스
abstract class Printer {

	private String model;
	private int price;

	public Printer(String model, int price) {
		this.model = model;
		this.price = price;
	}

	// 제품의 종류와 상관없이 공통된 기능 선언 > 출력 기능 > void print()
	public abstract void print();

}

class LG100 extends Printer {

	public LG100(String model, int price, String color, int size) {
		super(model, price);
		this.color = color;
		this.Size = size;
		// TODO Auto-generated constructor stub
	}

	// private String model;
//	private int price;
	private String color;
	private int Size; // A4, A5

	public void print() {
		System.out.printf("%d 사이즈로 출력합니다.\n", this.Size);
	}

	public void selfTest() {
		System.out.println("자가 진단을 합니다.");
	}

}

class HP200 extends Printer {

//	private String model;
//	private int price;
	private String type; // 터치, 비터치

	public HP200(String type, int price, String model) {
		super(model, price);
		this.type = type;
	}

//	public void output() {
//		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
//		
//	}

	public void call() {
		System.out.println("상담원과 연결합니다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);

	}

}

class Dell300 extends Printer {

	public Dell300(String model, int price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("Dell 방식으로 출력합니다.");
	}

}
