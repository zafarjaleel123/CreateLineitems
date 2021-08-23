package collections;

import java.util.ArrayList;

public class CopyCollection {

	public static void main(String[] args) {
		//Approach-1
		ArrayList< Integer> al=new ArrayList<Integer>();
		al.add(10);
		ArrayList<Integer> a2=new ArrayList<Integer>(al);
		a2.add(20);
		
		ArrayList<Integer> b1=new ArrayList<Integer>();
		b1.add(30);
		ArrayList<Integer> b2=new ArrayList<Integer>();
		b2.add(40);
		ArrayList<Integer> b3=new ArrayList<Integer>();
		b3.addAll(b1);
		b3.addAll(b2);
		b3.add(50);
		System.out.println(b3);
				
		
	}

}
