package Lambda;
interface itr1{
	String login(String uname,String password)
;}

public class LambdaDemo2 {

	public static void main(String[] args) {

		itr1 i=(uname,password)-> {
		if(uname.contains("zafar")) {
			return "Pass";
		}
		else {
			return "fail";
		}
		};
		String s=i.login("zafar", "zafar786");
		System.out.println(s);

	}

}
