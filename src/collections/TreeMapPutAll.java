package collections;

import java.util.TreeMap;

public class TreeMapPutAll {

	public static void main(String[] args) {
		//adding one map into another map:
		//1.constructor 2.putAll()
		TreeMap<String, Integer> t1=new TreeMap<String,Integer>();
		t1.put("zafar", 111);
		TreeMap<String, Integer> t2=new TreeMap<String,Integer>(t1);
		t2.put("jaleel", 222);
		System.out.println(t2);
		//putAll
		TreeMap<String, Integer> m1=new TreeMap<String,Integer>();
		m1.put("vikram", 333);
		TreeMap<String, Integer> m2=new TreeMap<String,Integer>();
		m2.put("suresh", 555);
		TreeMap<String, Integer> m3=new TreeMap<String,Integer>();
		m3.putAll(m1);
		m3.putAll(m2);
		m3.putAll(t1);
		m3.putAll(t2);
		System.out.println(m3);
		
		
	}

}
