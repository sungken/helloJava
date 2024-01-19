package com.test.java;

public class Ex10_Casting {

	public static void main(String[] args) {
		
//		byte b1;
//		short s1;
//		
//		b1 = 10;
//		//LValue = RValue 두 형이 무조건 같아야 에러가 나지 않는다
//		s1 = (short)b1;
//		System.out.println(s1);
		
		byte b2;
		short s2;
		
		s2 = 10;
		b2 = (byte)s2;
		System.out.println(b2);
		
		//기업은행 -> 계좌
	       int m1;
	       long m2 = 3000000000L;
	       
	       m1 = (int)m2;
	       System.out.printf("계좌이체 결과: %,d원\n", m1);
	       
	     //정수 > 정수
	     //실수 > 정수
	     //실수 > 정수
	     //정수 > 실수
	     int n1 = 100;
	     float n2;
	     
	     n2 = n1;
	     System.out.println(n2);
	     
	     int n3;
	     float n4 = 100;
	     
	     n3 = (int)n4;
	     System.out.println(n3);
	     
	     long n5;
	     float n6 = 10;
	     
	     //long(8) = float(4)
	     n5 = (long)n6;
	     System.out.println(n5);
	     
	     //char 형변환
	     char c1 = 'A';
	     System.out.println(c1);
	     System.out.println((int)c1);
	     
	     System.out.println((char)65);
	     
	    char c2;//2byte
	    short t2;//2byte
	     
	    c2 = 'A';
	     
	    //short(2) = char(2)
	    t2 = (short)c2;//문자 코드값으로 변환
	    System.out.println(t2);
	     
	    char c3;//2byte
	    short t3;//2byte
		
	    t3 = 65;
	    c3 = (char)t3;
	    System.out.println(c3);
	    
	    
	    //값형과 참조형간에는 형변환이 절대 불가능하다.
	    //System.out.println((int)"A");
	    System.out.println((int)'A');
	    
	    //100 -> "100"
	    String txt2 = String.valueOf(100); //정석
	    
	    String txt3 = 100 + "";
	    String txt4 = "" + 100;
	    String txt5 = 3.14 + "";
	    String txt6 = true + "";
	    System.out.println(txt2);
	    System.out.println(txt3);
	    System.out.println(txt4);
	    System.out.println(txt5);
	    System.out.println(txt6);
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
