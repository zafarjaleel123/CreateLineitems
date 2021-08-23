package NestedClassesDemo;

public class MethodLocalInner {
	void m1() {
		class Inner{
			void disp() {
				System.out.println("method inner class");
			}			
		}
		Inner i=new Inner();
		i.disp();		
	}

	public static void main(String[] args) {
		new MethodLocalInner().m1();

	}

}
