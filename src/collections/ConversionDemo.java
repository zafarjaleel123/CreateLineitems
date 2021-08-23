package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionDemo {

	public static void main(String[] args) {
		// Conversion of array to collection
		String s[]= {"Zafar","Jaleel","Hasan","Kamal"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		al.add("junaid");
		al.add("Shoaib");
		System.out.println(al);
		//Conversion of  generic collection to array
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("zafar");
		a2.add("jaleel");
		a2.add("kamal");
		String[] s1=new String[a2.size()];
		a2.toArray(s1);
		for(String ss:s1) {
			System.out.println(ss);
		}
		

	}

}
