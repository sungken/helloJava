package com.test.question;

public class Q098 {

	public static void main(String[] args) {

		Student s1 = new Student(); // 기본 생성자 호출
		System.out.println(s1.info());

		// 학생 2
		Student s2 = new Student("홍길동", 13); // 오버로딩 생성자 호출
		System.out.println(s2.info());

		// 학생 3
		Student s3 = new Student(3, 10, 30); // 오버로딩 생성자 호출
		System.out.println(s3.info());

		// 학생 4
		Student s4 = new Student("아무개", 12, 1, 5, 11); // 오버로딩 생성자 호출
		System.out.println(s4.info());

	}// main

}// Q098

class Student {
	public String name;
	public int age;
	public int grade;
	public int classNumber;
	public int number;

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Student() {

		this.name = "미정";
		this.age = 0;
		this.classNumber = 0;
		this.grade = 0;
		this.number = 0;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.classNumber = 0;
		this.grade = 0;
		this.number = 0;
	}

	public Student(int grade, int classNumber, int number) {
		this.name = "미정";
		this.age = 0;
		this.classNumber = classNumber;
		this.grade = grade;
		this.number = number;
	}

	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
		this.grade = grade;
		this.number = number;
	}

	public String info() {
		return String.format("%s(나이: %d, 학년: %d, 반: %d, 번호: %d)"
				, this.name
				, this.age
				, this.classNumber
				, this.grade
				, this.number);
	}

}// Student
