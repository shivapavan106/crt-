package basics;

import java.util.Scanner;

public class Example 
{
	public static void main(String[] args) 
	{
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter a number:");
		 int number = input.nextInt();
		if(number % 2 == 0)
			System.out.println("it is an even number");
		else
			System.out.println("it is an odd number");
	}
}
