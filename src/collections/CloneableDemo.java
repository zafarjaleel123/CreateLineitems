package collections;

public class CloneableDemo implements Cloneable {
	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneableDemo c=new CloneableDemo();
		System.out.println(c.a);
		System.out.println(c.b);
		CloneableDemo c1=(CloneableDemo)c.clone();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
	}

}
