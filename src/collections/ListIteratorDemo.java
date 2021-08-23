package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("zafar");
		al.add("Jaleel");
		al.add("Hassan");
		al.add("kamal");
		//normal way
		ListIterator lstr=al.listIterator();
		while(lstr.hasNext()) {
			String s=(String)lstr.next();
			System.out.println(s);
		}
		while(lstr.hasPrevious()) {
			String s=(String)lstr.previous();
			System.out.println(s);
		}
		
		//Listiterator cursor:with generic
		ListIterator<String> lstr1=al.listIterator();
		while(lstr1.hasNext()) {
			String s=lstr1.next();
			if(s.equals("kamal")) {
				lstr1.remove();
			}
			System.out.println(s);
		}
		while(lstr1.hasPrevious()) {
			String s=lstr1.previous();
			System.out.println(s);
		}
	}
	

}
