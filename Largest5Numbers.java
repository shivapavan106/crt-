package basics;

public class Largest5Numbers {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 35;
		int d = 4;
		int e = 5;
		if(a>b && a>c && a>d && a>e)
			System.out.println(" a is largest number");
		else if(b>c && b>d && b>e)
			System.out.println(" b is largest number");
		else if(c>d && c>e)
			System.out.println(" c is largest number");
		else if(d>e)
			System.out.println(" d is largest number");
		else
			System.out.println(" e is largest number");
	}
}
