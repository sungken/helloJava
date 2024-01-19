package com.test.java.obj;


//직원, 사원 클래스
public class Employee {
	
	private String name; //직원명
	private String department; //부서명
	
	//직속 상사 정보
	//private String sname;
	//private String sdepartment;
	private Employee superior;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

}
