package NestedClassesDemo;

public class NormalDemo2 {
	private int a=200,b=300;
	class Inner{
		int a=20,b=30;
		 void add(int a,int b){
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(NormalDemo2.this.a+NormalDemo2.this.b);
		}
	}

	public static void main(String[] args) {

		new NormalDemo2().new Inner().add(3, 5);

	}

}
