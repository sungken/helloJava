package com.test.question;

import java.util.regex.Pattern;

public class Q095 {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); // 직속 상사 없음

		e1.info();

		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); // 직속 상사 e1(홍길동)

		e2.info();

	}// main

}// Q095

class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 5) {
			boolean name_check = Pattern.matches("^[가-힣]*$", name);
			if (name_check) {
				this.name = name;
			}
		}
		return;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if ("영업부".equals(department)) {
			department = "영업부";
		} else if ("기획부".equals(department)) {
			department = "기획부";
		} else if ("총무부".equals(department)) {
			department = "총무부";
		} else if ("개발부".equals(department)) {
			department = "개발부";
		} else if ("홍보부".equals(department)) {
			department = "홍보부";
		}
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if ("부장".equals(position)) {
			position = "부장";
		} else if ("과장".equals(position)) {
			position = "과장";
		} else if ("대리".equals(position)) {
			position = "대리";
		} else if ("사원".equals(position)) {
			position = "사원";
		}
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		int index = 0;
		index = tel.indexOf('-');
		if (index == 3) {
			if(index + 3 == 4 && tel.length() == 13) {
				this.tel = tel;				
			}
		}		
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}

	public String info() {
		return String.format("[%s]\n"
				+ "- 부서: %s\n"
				+ "- 직위: %s\n"
				+ "- 연락처: %s\n"
				+ "- 직속상사: %s"
				, this.name
				, this.department
				, this.position
				, this.tel
				, this.name);
	}
}
