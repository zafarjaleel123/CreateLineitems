package NestedClassesDemo;
class A{
	void disp(){
		System.out.println("anonymous class");
	}
}
public class AnonymousDemo {
	A a=new A() {
	void disp(){
		System.out.println("goog morning");
	}
	};
	

	public static void main(String[] args) {
		AnonymousDemo ad=new AnonymousDemo();
		ad.a.disp();
		A a=new A() {
			void disp() {
				System.out.println("Main method");
			}
		};
		a.disp();
		new A() {
			void disp() {
				System.out.println("New Maint");
			}
		}.disp();

	}

}
