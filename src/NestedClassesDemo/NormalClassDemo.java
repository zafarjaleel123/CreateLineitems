package NestedClassesDemo;

public class NormalClassDemo {
	
	int a=10,b=30;
	class inner {
		int x=20,y=60;
		void add(int i,int j) {
			System.out.println(i+j);
			System.out.println(a+b);
			System.out.println(x+y);
		}
	}

	public static void main(String[] args) {
		new NormalClassDemo().new inner().add(50, 60);
		//outer o=new outer();outer.inner i=o.new inner();i.add(20,30)
		


	}

}
