package NestedClassesDemo;

public class OuterDemo {
	OuterDemo(){
		System.out.println("Outer class Constructor");
	}
	{
		System.out.println("Outer class insta bolck");
		
	}
	static {
		System.out.println("Outer class static block");
	}
	class Inner{
		Inner(){
			System.out.println("inner class constructor");
		}
		{
			System.out.println("Inner class instant Block");
		}
	}
	public static void main(String[] args) {
		new OuterDemo().new Inner();



	}

}
