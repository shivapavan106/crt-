package basics;

public class EvenOrOdd {
	public static void main(String[] args) {
		int a = 2;
//		if(a%2==0)
//			System.out.println("a is even");
//		else 
//			System.out.println("a is odd");
				//variable = (condition) ? expressionTrue :  expressionFalse;
       String value = (a%2==0) ? "even" : "odd";
       System.out.println(value);
	}

}
