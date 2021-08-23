package collections;

import java.util.Comparator;

public class PnameComp implements Comparator<ProductDemo>{

	@Override
	public int compare(ProductDemo o1, ProductDemo o2) {


		return -o1.pname.compareTo(o2.pname);
	}

}
