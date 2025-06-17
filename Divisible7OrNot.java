package basics;
import java.util.*;
public class Divisible7OrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:"+" ");
		int num = sc.nextInt();
		if(num % 7 == 0)
			System.out.println("it is divisible by 7");
		else 
			System.out.println("it is not divisible by 7");
		sc.close();		
	}
}