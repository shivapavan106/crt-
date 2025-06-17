package basics;
import java.util.*;
public class MAndNDivisible7OrNot {
public static void main(String[] args) {
	int m = 50;
	int n = 100;
	if(m&&n%7==0)
		System.out.println("it is divisible by 7");
	for(int i = m;i<n;i++)
	{
		System.out.println(i);
	}

}
}
