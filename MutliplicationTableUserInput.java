package basics;
import java.util.Scanner;

public class MutliplicationTableUserInput {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();
	        for (int i = 1; i <= 10; i++) 
	        {
	            int result = number * i;
	            System.out.println(number + " * " + i + " = " + result);
	        }
	        input.close();
	    }
	}


