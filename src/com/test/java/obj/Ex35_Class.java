package com.test.java.obj;

import java.lang.ProcessHandle.Info;

public class Ex35_Class {

	public static void main(String[] args) {
		
		//Ex35_Class.java
		
		//부장
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setDepartment("영업부");
		
		//과장
		Employee e2 = new Employee();
		e2.setName("아무개");
		e2.setDepartment("영업부");		
		e2.setSuperior(e1);
		
		System.out.println(e1.getName());
		System.out.println(e2.getSuperior().getName());
		
		
		
		Parent father = new Parent();
		father.setName("홍길동");
		father.setAge(40);
		
		Parent mother = new Parent();
		mother.setName("성춘향");
		mother.setAge(35);
		
		Child child = new Child();
		child.setName("홍무개");
		child.setAge(12);
		child.setFather(father); //관계
		child.setMother(mother); //관계
		
		
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setAddress("서울시 강남구 역삼동");
		//p1.setNick("홀쭉이");
//		String[] nick = new String[3];
//		nick[0] = "홀쭉이";
//		nick[1] = "젓가락";
//		nick[2] = "철사";
//		
		//p1.setNick(nick);
		
		
		//com.test.java.obj.Person
		//@
		//8efb846
//		System.out.println(p1);
//		System.out.println(p1.toString());
//		
//		
//		System.out.println(p1.info());
		p1.addNick("홀쭉이");
		p1.addNick("젓가락");
		p1.addNick("철사");
		System.out.println(p1.info());
		System.out.println(p1.getNick(0));
		System.out.println(p1.getNick(1));
		System.out.println(p1.getNick(2));
		

		
	}
	
}//Ex35
