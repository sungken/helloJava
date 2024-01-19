package com.test.question;

import java.util.regex.Pattern;

public class Q093 {

	public static void main(String[] args) {

		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());

		Note note2 = new Note();

		note2.setOwner("이강인");
		note2.setSize("A4");
		note2.setColor("검정색");
		//note2.setPage(100);

		System.out.println(note2.info());

	}// main

}// Q093

class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// setter, getter 구현

//	public String getSize() {
//		return size;
//	}

	public void setSize(String size) {
		if ("A3".equals(size) 
				|| "A4".equals(size) 
				|| "A5".equals(size) 
				|| "B3".equals(size) 
				|| "B4".equals(size)
				|| "B5".equals(size)) {
			this.size = size;
		}
		return;
	}

//	public String getColor() {
//		return color;
//	}

	public void setColor(String color) {
		if ("검정색".equals(color) 
				|| "흰색".equals(color) 
				|| "노란색".equals(color) 
				|| "파란색".equals(color)) {
			this.color = color;
		}
		return;
	}

//	public int getPage() {
//		return page;
//	}

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		}
	}

//	public String getOwner() {
//		return owner;
//	}

	public void setOwner(String owner) {
		if (owner.length() >= 2 && owner.length() <= 5) {
			boolean name_check = Pattern.matches("^[가-힣]*$", owner);
			if (name_check) {
				this.owner = owner;
			}
		}
		return;
	}


	public String getPageString() {
		if (page >= 10 && page <= 50) {
			return "얇다";
		} else if (page >= 51 && page <= 100) {
			return "중간";
		} else if (page >= 101 && page <= 200) {
			return "굵다";
		} else {
			return "허용 범위를 벗어난 페이지 수입니다.";
		}
	}
	
	public int getPrice() {
		int addPrice = 0;
		
		if(size.equals("A5")){
			addPrice += 0;
		} else if(size.equals("A4")){
			addPrice += 200;
		} else if(size.equals("A3")){
			addPrice += 400;
		}  else if(size.equals("B3")){
			addPrice += 500;
		} else if(size.equals("B4")){
			addPrice += 300;
		} else if(size.equals("B5")){
			addPrice += 100;
		} 
		if (color.equals("검정색")) {
			addPrice += 100;
		} else if (color.equals("노란색")) {
			addPrice += 200;
		} else if (color.equals("파란색")) {
			addPrice += 200;
		} else if (color.equals("흰색")) {
			addPrice += 0;
		}
		if ( page >= 10) {
			addPrice += (page - 10) * 10 + 500;
		}
			
		return addPrice;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}


	public String info() {
		
		if(this.owner == null) {
			return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
								+ "주인 없는 노트\n"
								+ "■■■■■■■■■■■■■■■■■■■■\n");
		} else if (this.page == 0 
				|| this.color == null 
				|| this.size == null){
			return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
					+ "주인 없는 노트\n"
					+ "■■■■■■■■■■■■■■■■■■■■\n");	
		}  else {
			return String.format(
					"■■■■■■ 노트 정보 ■■■■■■\n" 
							+ "소유자: %s\n" 
							+ "특성: %s %s %s노트\n" 
							+ "가격: %,d원\n" 
							+ "■■■■■■■■■■■■■■■■■■■■\n"
							, this.owner
							, this.color, getPageString(), this.size
							, getPrice());	
		}

	}

}
