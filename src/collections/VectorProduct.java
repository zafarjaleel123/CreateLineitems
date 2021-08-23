package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorProduct {

	public static void main(String[] args) {

		Vector<ProductDemo> v=new Vector<ProductDemo>();
		v.add(new ProductDemo(111, "Mobile", 1000));
		v.add(new ProductDemo(123, "Ac", 34000));
		v.add(new ProductDemo(124, "Shoes", 1500));
		
		Enumeration<ProductDemo> e=v.elements();
		while(e.hasMoreElements()) {
			ProductDemo p=e.nextElement();
			System.out.println(p.id+" "+p.pname+" "+p.cost);
		}
		
		Iterator<ProductDemo> itr=v.iterator();
		while(itr.hasNext()) {
			ProductDemo p=itr.next();
			System.out.println(p.id+" "+p.pname+" "+p.cost);
		}



	}

}
