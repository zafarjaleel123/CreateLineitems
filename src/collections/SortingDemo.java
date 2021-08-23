package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Zafar");
		al.add("Jaleel");
		al.add("Vikram");
		al.add("Suresh");
		System.out.println("Before Sorting :"+al);
		Collections.sort(al);
		System.out.println("after sorting :"+al);
		ArrayList<Emp> a=new ArrayList<Emp>();
		a.add(new Emp(333, "Zafar"));
		a.add(new Emp(111, "Vikram"));
		a.add(new Emp(222, "Suresh"));
		a.add(new Emp(444,"jaleel"));
		Collections.sort(a);
		for(Emp e:a) {
			System.out.println(e.eid+" "+e.ename);
		}
		
		
		

	}

}
