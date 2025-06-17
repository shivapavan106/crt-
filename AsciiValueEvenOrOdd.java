package basics;

public class AsciiValueEvenOrOdd {
	public static void main(String [] args)
	{
		char value = 99;
		if(value%2==0)
			System.out.println("it is a even");
		else
			System.out.println("it is a odd");
		//variable = (condition) ? expressionTrue :  expressionFalse;
		String man = (value%2==0) ? "it is a even":"it is a odd";
		System.out.println(man);
			
	}

}
