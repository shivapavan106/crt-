package patterns;
public class EvenNumbersBetweenTwoNumbers {
public static void main (String []args)
{
	int m = 2121;
	int n = 5474;
	for(int i=m;i<=n;i++)
		if(i%2==0)
		{
			System.out.println(i);
		}
}

}
