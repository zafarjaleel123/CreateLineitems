package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("ratan");
		link.add("anu");
		link.add("durga");
		link.add(null);
		System.out.println(link);
		link.addFirst("add");
		link.addLast("zzz");
		System.out.println(link.size());
		link.add(2, "jaleel");
		System.out.println(link);
		link.set(1, "vikram");
		System.out.println(link);
		link.remove(1);
		link.remove("durga");
		link.removeFirst();
		link.removeLast();
		System.out.println(link);
		
		LinkedList<Book> books=new LinkedList<Book>();
		books.add(new Book(123, "Math", "Suresh"));
		books.add(new Book(111, "science", "Vikram"));
		for(Book b:books) {
			System.out.println(b.id+" "+b.name+" "+b.author);
		}
		//System.out.println(books.get(0));
		Book b1=books.get(0);
		System.out.println(b1.id);
		Iterator<Book> itr=books.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			if(b.name.equals("science")) {
				itr.remove();
			}
		}
		
		LinkedList<ProductDemo> Plink=new LinkedList<ProductDemo>();
		Plink.add(new ProductDemo(111, "pen", 10));
		Plink.add(new ProductDemo(555, "book", 20));
		Plink.add(new ProductDemo(333, "pencil", 5));
		Plink.add(new ProductDemo(444, "eraser", 2));
		Plink.add(new ProductDemo(222, "pen", 10));
		
		Collections.sort(Plink);
		for(ProductDemo p:Plink) {
			System.out.println(p.id+" "+p.pname+" "+p.cost);
		}
		
		Collections.sort(Plink,new PnameComp());
		
		for(ProductDemo p:Plink) {
			System.out.println(p.id+" "+p.pname+" "+p.cost);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
