package basics;

public class MiddleNumber3 {
	public static void main(String[] args) {
		int a = 143;
		a = a/10;
		System.out.println(a);
		a = a%10;
		System.out.println(a);
		if(a%10==0)
			System.out.println(a);
		else 
			System.out.println("something went wrong");

	}

}
