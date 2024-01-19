package com.test.java.bbb;

import com.test.java.aaa.Red;

public class Yellow {

	public void test() {
		
		// 현재 Yellow와 다른 패키지에 있는 Red 접근
		Red r1 = new Red();

		r1.a = 10;
		// r1.b = 20; // private
		// r1.c = 30; // defalt는 다른 패키지에서는 비공개
		// r1.d = 40; // protected도 안보임
	}

}
