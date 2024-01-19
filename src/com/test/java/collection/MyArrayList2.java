package com.test.java.collection;

public class MyArrayList2 {
	
	private String[] list;
	private int index;
	
	public MyArrayList2() {
		
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean add(String s) {
		
		
		
		this.list[index] = s;
		this.index++;
		
		return true;
	}
	
//	@Override
//	public String toString() {
//		
//		String temp = "";
//		
//		temp += String.format("length: %d\r\n", this.list.length);
//		temp += String.format("index: %d\r\n", this.index);
//		temp += "[\r\n";
//		
//		for(int i = 0; i < this.list.length; i++) {
//			temp += String.format()
//		}
//		
//		
//		return;
//	}
}// MyArrayList2
