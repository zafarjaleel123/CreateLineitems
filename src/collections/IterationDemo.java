package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationDemo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<Book> books=new ArrayList<Book>();
	books.add(new Book(111,"java","zafar"));
	books.add(new Book(222,"Dotnet","Vikram"));
	books.add(new Book(333,"sql","Suresh"));
	
	al.add("zafar");
	al.add("jaleel");
	al.add("ali");
	al.add("fazal");
	//Read Data by using iterator
	Iterator<Book> it=books.iterator();
	while(it.hasNext()) {
		Book b=it.next();
		if(b.id==111) {
			it.remove();
		}
		System.out.println(b);
	}
	Iterator<String> i=al.iterator();
	while(i.hasNext()) {
		String s=i.next();
		System.out.println(s);
	}
}
}
