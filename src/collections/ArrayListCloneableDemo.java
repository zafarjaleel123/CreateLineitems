package collections;

import java.util.ArrayList;

public class ArrayListCloneableDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("zafar");
		al.add("jaleel");
		ArrayList<String> copy=(ArrayList<String>)al.clone();
		System.out.println(copy);

	}

}
