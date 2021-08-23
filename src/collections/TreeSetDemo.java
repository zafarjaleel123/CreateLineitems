package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("zafar");
		ts.add("ravi");
		ts.add("jaleel");
		ts.add("vikram");
		System.out.println(ts);
		
		TreeSet<ProductDemo> pts=new TreeSet<ProductDemo>(new PnameComp());
		
		pts.add(new ProductDemo(123, "pen", 10.0));
		pts.add(new ProductDemo(124, "table", 1000.0));
		pts.add(new ProductDemo(126, "pencil", 5.0));
		pts.add(new ProductDemo(128, "pnone", 10000.0));
		
		for(ProductDemo p:pts) {
			System.out.println(p.id+" "+p.pname+" "+p.cost);
		}
		

	}

}
