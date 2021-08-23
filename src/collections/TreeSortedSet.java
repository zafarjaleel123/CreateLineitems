package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSortedSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=1;i<=10;i++) {
			ts.add(i);
		}
		System.out.println(ts);
		SortedSet<Integer> sts=ts.subSet(3, 8);
		TreeSet<Integer> t1=new TreeSet<Integer>(sts);
		System.out.println(t1);
		
		SortedSet<Integer> s2=ts.tailSet(6);
		TreeSet<Integer> t2=new TreeSet<Integer>(s2);
		System.out.println(t2);
		
		SortedSet<Integer> s3=ts.headSet(6);
		TreeSet<Integer> t3=new TreeSet<Integer>(s3);
		System.out.println(t3);
	}

}
