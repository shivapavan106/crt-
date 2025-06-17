package basics;
import java.util.*;
public class ExampleDivisible7
{
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = sc.nextInt();
		
//		if(number%8==0)
//			System.out.println("it is divisible by 8");
//		else
//			System.out.println("it is not divisible by 8");
		String man =(number%7==0) ? "it is divisble by 7": "it is not divisible7";
		System.out.println(man);
		sc.close();
	}

}

