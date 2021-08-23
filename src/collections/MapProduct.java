package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapProduct {

	public static void main(String[] args) {

		LinkedHashMap<Integer, ProductDemo> ph=new LinkedHashMap<Integer,ProductDemo>();
		ph.put(1,new ProductDemo(111, "pen", 10.0));
		ph.put(2, new ProductDemo(222, "bottle", 100.5));
		ph.put(3, new ProductDemo(333, "mobile", 4000));
		
		Set<Entry<Integer,ProductDemo>> s=ph.entrySet();
		Iterator<Entry<Integer,ProductDemo>> itr=s.iterator();
		while(itr.hasNext()) {
			Entry<Integer,ProductDemo> e=itr.next();
			ProductDemo pd=e.getValue();
			if(pd.id==111) {
				itr.remove();
			}			
		}
		for(Entry<Integer,ProductDemo> e:ph.entrySet()) {
			ProductDemo pd=e.getValue();
			System.out.println(pd.id+" "+pd.pname+" "+pd.cost);
		}

	}

}
