package Lambda;
interface It2 {
	void add(int a,int b);
}

public class AddLambda {

	public static void main(String[] args) {
		It2 i=new It2() {
			public void add(int a,int b) {
				System.out.println(a+b);
			}
		};
		i.add(10, 20);
		It2 i1=(int a,int b)->System.out.println(a+b);
		i1.add(20,30);
	}
	
}
