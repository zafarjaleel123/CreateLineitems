package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapData {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("zafar");
		al.add("jaleel");
		System.out.println("Before swaping :"+al);
		Collections.swap(al, 0, 1);
		System.out.println("After Swaping :"+al);

	}

}
