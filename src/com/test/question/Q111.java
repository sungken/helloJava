package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// C:\class\dev\eclipse
		System.out.print("폴더: ");
		String folder = sc.next();
		//listFiles()
		// exe
		System.out.print("확장자: ");
		String extension = sc.next();
		
		String targetString = ".";

		File dir = new File(folder);
		File[] list = dir.listFiles();

		for (File item : list) {
			if (item.isFile()) {
				int index = item.getName().indexOf(targetString);
				String result = item.getName().substring(index + targetString.length());
//				System.out.println(result);
//				System.out.println(extension);
				if(extension.equals(result)){
					System.out.println(item.getName());
				}
			}
		}

	}// main

}// Q111
