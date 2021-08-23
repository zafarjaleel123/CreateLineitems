package collections;

import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Emp(123, "Zafar"));
		al.add(new Student(111, "jaleel"));
		al.add(10);
		al.add("Hasan");
		for(Object o:al) {
			if(o instanceof Emp) {
				Emp e=(Emp)o;
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student) {
				Student s=(Student)o;
				System.out.println(s.sid+" "+s.sname);
			}
			if(o instanceof Integer) {
				System.out.println(o);
			}
			if(o instanceof String) {
				System.out.println(o);
			}
			if(o==null) {
				System.out.println(o);
			}
		}
		ArrayList list=new ArrayList();
		list.add(new Emp(111, "Zfaar"));
		list.add(new Student(222, "jalle"));
		
		for (Object o:list) {
			if(o instanceof Emp) {
				Emp e=(Emp)o;
				System.out.println(e.eid+" "+e.ename);
			}
			if (o instanceof Student) {
				Student st=(Student)o;
				System.out.println(st.sid+" "+st.sname);
			}
		}
		
	}

}
