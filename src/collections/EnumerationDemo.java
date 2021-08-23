package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		v.add("zafar");
		v.add("jaleel");
		v.add("faisal");
		v.add("Malik");
		//Generic way
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			System.out.println(s);
		}
		//normal way
		Enumeration e1=v.elements();
		while(e1.hasMoreElements()) {
			String s=(String)e1.nextElement();
			System.out.println(s);
		}
	}


	
	
	

}
