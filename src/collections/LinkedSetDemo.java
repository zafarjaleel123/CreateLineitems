package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Book> ls=new LinkedHashSet<Book>();
		ls.add(new Book(1, "java", "zafar"));
		ls.add(new Book(2, "C++", "vikram"));
		ls.add(new Book(3, "Dotnet", "Suresh"));
		ls.add(new Book(1, "java", "zafar"));
		
		//Iterator<Book> ite=ls.iterator();
		
		for(Book bs:ls) {
			System.out.println(bs.id+" "+bs.name+" "+bs.author);
		}
	}

}
