package com.test.java.obj._static;

public class Ex37_Static {
	
	
	//1. 클래스 로딩, Class Loading
	//- 프로그램을 실행하기전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업 > 설계도 인식 작업
	//- *** 로딩 과정중에 만나는 모든 static 요소를 메모리에 구현한다.
	
	//2. Mine 실행
	public static void main(String[] args) {
		
		//static (정적)키워드
		//- 지시자(정적) 키워드
		//- 지시자(제어자)중 하나
		//- 클래스 or 클래스 멤버에 붙이는 키워드
		
		//1. 멤버 변수
		//2. 멤버 메서드
		
		//상황 - 학생 3명
		//- 모두 "역삼중학교"에 다닌다.
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		Student.setSchool("역삼 중학교"); //한번 선언으로 Student 에 생성자들에
		//s1.setSchool("역삼 중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼 중학교");
		
		Student s3 = new Student();
		s3.setName("임꺽정");
		s3.setAge(16);
		//s3.setSchool("역삼 중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
	
	
	}//main 
	 
	
	
}//Ex37_Static

class Student{
	private String name;
	private int age;
	
	//private String school; 
	private static String school; //중복된 값을 편하게 만드는 방법
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	//.this 는 객체 안에서 객체를 가르키는 말이다
	// static으로 공용적으로 뭔가를 가져오려면 this 를 사용하기보다는 static으로 해야한다.
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	public String info() {
		
		//print()
		//String.format() 
		//- 두개가 같은말이다.
		
		return String.format("%s[%d세, %s]"
								, this.name
								, this.age
								, Student.school);
		
	}
	
}










































