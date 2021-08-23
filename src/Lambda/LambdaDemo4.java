package Lambda;
interface Message {
	void disp();
}

public class LambdaDemo4 {
	static void one(Message m) {
		m.disp();
	}

	public static void main(String[] args) {
		LambdaDemo4.one(new MyClass());// TODO Auto-generated method stub
		LambdaDemo4.one(new Message() {

			@Override
			public void disp() {

				System.out.println("Good morning two");
				
			}
			
		});
		LambdaDemo4.one(()->System.out.println("Good Morning 3"));
		
	}

}
class MyClass implements Message{

	@Override
	public void disp() {

		System.out.println("good morning");
		
	}
	
}