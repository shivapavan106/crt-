package basics;

public class Smallest5Number {
	public static void main(String [] args)
	{
		int a = 19;
		int b = 4;
		int c = 3;
		int d = 0;
		int e = 34;
		if(a<b && a<c && a<d && a<e)
			System.out.println("a is smallest number");
		else if(b<c && b<d && b<e)
			System.out.println("b is smallest number");
		else if(c<d && c<e)
			System.out.println("c is smallest number");
		else if(d<e)
			System.out.println("d is smallest number");
		else
			System.out.println("e is smallest number");
	}

}
