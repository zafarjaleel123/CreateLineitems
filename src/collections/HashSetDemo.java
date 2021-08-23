package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("zafar");
		hs.add("vikran");
		hs.add("suresh");
		hs.add("zafar");
		System.out.println(hs);
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("zafar");
		h.add("vikran");
		h.add("suresh");
		h.add("zafar");
		System.out.println(h);
	}

}
