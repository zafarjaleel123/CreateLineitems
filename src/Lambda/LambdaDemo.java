package Lambda;
interface It1{
	void disp();
}

public class LambdaDemo {

	public static void main(String[] args) {
		It1 i=new It1() {
			public void disp() {
				System.out.println("this is anonymous");
			}
		};
		i.disp();
		It1 i1=()->System.out.println("this is Lambda");
		i1.disp();
		
		It1 i2=()->{System.out.println("this is Lambda");
		System.out.println("This is Lambda-2");};i2.disp();
	}
	
	

}	

