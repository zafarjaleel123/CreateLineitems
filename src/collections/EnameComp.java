package collections;

import java.util.Comparator;

public class EnameComp implements Comparator<Employee>{

	
	

	@Override
	public int compare(Employee o1, Employee o2) {

		
		return o2.ename.compareTo(o1.ename);
	}

}
