package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> h=new HashMap<Integer,String>();
		h.put(121, "zafar");
		h.put(122, "jaleel");
		h.put(123, "hasan");
		h.put(124, "kamal");
		System.out.println(h);
		Set<Integer> s=h.keySet();
		System.out.println(s);
		System.out.println(h.get(s));
		Collection<String> c=h.values();
		System.out.println(c);
		Set<Entry<Integer,String>> s1=h.entrySet();
		for(Entry<Integer,String> e:s1) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		

	}

}
