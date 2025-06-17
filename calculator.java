package src;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("ENter operaator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%') {
                System.out.print("ENTER number 1 and 2 : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("breaked the loop");
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("answer is :" + ans);
        }

    }
}

