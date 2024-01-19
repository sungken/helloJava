package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Scanner dad = new Scanner(System.in);
		System.out.print("아빠 생일(년): ");
		int dadYear = dad.nextInt();
		System.out.print("아빠 생일(월): ");
		int dadMonth = dad.nextInt();
		System.out.print("아빠 생일(일): ");
		int dadDay = dad.nextInt(); 
		
		Scanner daughter = new Scanner(System.in);
		System.out.print("딸 생일(년): ");
		int daughterYear = daughter.nextInt();
		System.out.print("딸 생일(월): ");
		int daughterMonth = daughter.nextInt();
		System.out.print("딸 생일(일): ");
		int daughterDay = daughter.nextInt(); 
		
		Calendar dadBirthday = Calendar.getInstance();
		dadBirthday.set(dadYear, dadMonth - 1, dadDay);
		long dadBirthday2 = (now.getTimeInMillis() - dadBirthday.getTimeInMillis()) / 1000 / 60 / 60 / 24;
		//System.out.println(dadBirthday2);
		
		Calendar daughterBirthday = Calendar.getInstance();
		daughterBirthday.set(daughterYear, daughterMonth - 1 , daughterDay);
		long daughterBirthday2 = (now.getTimeInMillis() - daughterBirthday.getTimeInMillis()) / 1000 / 60 / 60 / 24;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다. \n", dadBirthday2 - daughterBirthday2);
		
	}//main

}
