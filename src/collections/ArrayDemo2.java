package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*ArrayList<Emp> al=new ArrayList<Emp>();
				al.add(new Emp(111,"Zafar"));
				al.add(new Emp(123,"Jaleel"));
				al.add(new Emp(122,"hasan"));
				for(Emp e:al) {
					System.out.println(e.eid+" "+e.ename);
				}
				Emp e1=al.get(0);
				System.out.println(e1.eid+" "+e1.ename);
				al.add(1, new Emp(786,"hasan"));
				for(Emp e:al) {
					System.out.println(e.eid+" "+e.ename);
				}
				//al.remove(1)index
				//al.remove("zafar")Object
				//al.set(index, element)replace
				//al.isEmpty();
*/				/*FileOutputStream fos=new FileOutputStream("abc.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(al);
				oos.close();*/
				
				FileInputStream fis=new FileInputStream("abc.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				ArrayList<Emp> newal=(ArrayList<Emp>)ois.readObject();
				for(Emp e:newal) {
					System.out.println(e.eid+" "+e.ename);
				}
				ois.close();
	}

}
