package com.test.question;

public class Q092 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);
		
		System.out.println(b1.info());
		
		
		
		

	}// main

}// Q092

class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() > 0 && title.length() < 50) {
			this.title = title;			
		} else {
			this.title = "최대 50자가 넘었습니다.\n";
		}
		return;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0 && price < 1000000) {
			this.price = price;			
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

//	public String getPubYear() {
//		return pubYear;
//	}

//	public void setPubYear(String pubYear) {
//		this.pubYear = pubYear;
//	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		} else {
			this.page = 0;
		}
	}

	public String info() {
		return String.format("제목: %s\n" + 
									"가격: %d원\n" + 
									"저자: %s\n" + 
									"출판사: %s\n" + 
									"발행년도: %s년\n" + 
									"ISBN: %s\n" + 
									"페이지: %,d장"
									, this.title
									, this.price
									, this.author
									, this.publisher
									, this.pubYear
									, this.isbn
									, this.page);

	}
}
