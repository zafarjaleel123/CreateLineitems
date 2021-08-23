package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialiationDemo {
	void serializationTest() throws IOException {
		Emp e=new Emp(111,"zafar");
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
	}
	void deserializationTest() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e=(Emp)ois.readObject();
		System.out.println(e.eid+" "+e.ename);
		ois.close();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerialiationDemo sd=new SerialiationDemo();
		sd.serializationTest();
		sd.deserializationTest();
	}

}
