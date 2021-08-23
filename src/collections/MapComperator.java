package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class MapComperator {

	public static void main(String[] args) {

		TreeMap<Integer,String> t1=new TreeMap<Integer,String>(new MyComp());
			t1.put(1, "zafar");
			t1.put(20, "jaleel");
			t1.put(5, "ravi");
			t1.put(10, "vikram");
			System.out.println(t1);
	}

}
class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}