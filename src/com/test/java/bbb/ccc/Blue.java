package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;

//다른 패키지
public class Blue extends Red{
	
	public void test() {
		
		this.a = 10;
		//this.b = 20;
		//this.c = 30; // defalt 는 나와 같은 패키지 이면 open
		this.d = 40; // protected는 다른 패키지에 있지만 상속 받으면 공개할수 있다
 		
		
	}
	

}
