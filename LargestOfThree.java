package basics;

public class LargestOfThree {
	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int c = 4;
//		if(a>b && a>c)
//			System.out.println("a is largest");
//		else if(b>c && b>a)
//			System.out.println("b is largest");
//		else
//			System.out.println("c is largest");
	String value = (a>b && a>c) ? "a is largest":(b>c) ? "b is largest":"c is largest";
	System.out.println(value);	
	}

}
