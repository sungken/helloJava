package com.test.java.collection;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", name, age);
	}
	
	
	@Override
	public int hashCode() {
		
		//이름 + 나이
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	}
	
	
	

}// Member
