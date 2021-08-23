package NestedClassesDemo;

public class StaticNestedDemo {
	int a=10;
	static int b=20;
	
	static class Inner{
		void disp() {
			//System.out.println(a);
			System.out.println(b);
		}
		
	}

	public static void main(String[] args) {
		new StaticNestedDemo.Inner().disp();

	}

}
