package collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {

ArrayList<Employee> al=new ArrayList<Employee>();
al.add(new Employee(111, "Zafar"));
al.add(new Employee(222, "jaleel"));
al.add(new Employee(333, "Vikram"));
al.add(new Employee(444, "Suresh"));
Collections.sort(al,new EnameComp());
for (Employee e:al) {
	System.out.println(e.eid+" "+e.ename);
}
	}

}
