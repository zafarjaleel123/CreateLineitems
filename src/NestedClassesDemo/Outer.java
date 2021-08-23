package NestedClassesDemo;

 class Outer {
	int a=10,b=20;
	void m1() {
		System.out.println("Outer Class");
	}
	class Inner{
		int x=20,y=30;
		void m2() {
			System.out.println("Inner Class");
			System.out.println(x+y);
			System.out.println(a+b);
			m1();
		}
		
	}

}
 class NormaInnerClass {
	 public static void main(String[] args) {
		Outer o=new Outer();
		o.m1();
		Outer.Inner i=o.new Inner();
		i.m2();
	}
}
