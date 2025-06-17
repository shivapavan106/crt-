package basics;

import java.util.Scanner;

public class TableWithoutUsingMultiplicationOperator {
	public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:"+" ");
		int num = sc.nextInt();
		System.out.println("enter the table length:"+" ");
		int length = sc.nextInt();
		for(int i = 1;i<=length;i++)
		{
			int result = 0;
			for(int j = 0;j<i;j++)
			{
				result += num;
			}
			System.out.println(num+"x"+i+"="+result);
		}
		sc.close();
		    }
	}
