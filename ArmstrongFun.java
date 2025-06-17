package src;

import java.util.Scanner;

public class ArmstrongFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int  n = input.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int org = n;
        int sum = 0;
        while (n > 0) {
           int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (org == sum) {
            return true;
        }
        return false;
    }
}
