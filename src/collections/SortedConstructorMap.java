package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedConstructorMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
		t1.put(1, "zafar");
		t1.put(2, "jaleel");
		t1.put(10, "Hasan");
		t1.put(20, "kamal");
		t1.put(50, "vikram");
		t1.put(5, "suresh");
		t1.put(30, "ravi");
		System.out.println(t1);
		SortedMap<Integer,String> sm1=t1.subMap(3, 30);
		TreeMap<Integer,String> t2=new TreeMap<Integer,String>(sm1);
		System.out.println(t2);
		SortedMap<Integer,String> sm2=t1.tailMap(10);
		TreeMap<Integer,String> t3=new TreeMap<Integer,String>(sm2);
		System.out.println(t3);
		SortedMap<Integer,String> sm3=t1.headMap(30);
		TreeMap<Integer,String> t4=new TreeMap<Integer,String>(sm3);
		System.out.println(sm3);


		

	}

}
