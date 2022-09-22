package com.inheritence_interface.bll;

public class TestBook {
	public static void main(String[] args) {
		Author aut=new Author("Munna","munnabhaiya@mirzapur.com");
			
			Book book=new Book("420420","Katta",aut,1500.0);
			System.out.println(book);
			System.out.println(book.getAuthor().getName());
			
			Book book1=new Book("420420","Penda",aut,100,4);
			System.out.println(book1);	
			System.out.println(book1.getAuthor().getName());
		
			 
			
			System.out.println(aut.getName()); 
		}

}
