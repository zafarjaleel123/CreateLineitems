package collections;

public class ProductDemo implements Comparable<ProductDemo>{
	int id;
	String pname;
	double cost;
	public ProductDemo(int id, String pname, double cost) {
		super();
		this.id = id;
		this.pname = pname;
		this.cost = cost;
	}
	@Override
	public int compareTo(ProductDemo o) {
		if(id==o.id)
		return 0;
		else if(id>o.id)
			return 1;
		else
			return -1;
	}
	
	

}
