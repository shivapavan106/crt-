package src.test;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionPractise {
    public static void main(String[] args) {
//       int ans  =  Sum();
//        System.out.println(ans);
        String ans = greeting("hi");
        System.out.println(ans);

   }
//        static int  Sum(){
//            Scanner in = new Scanner(System.in);
//            System.out.println("enter Num1 and Num2 : ");
//            int num1 = in.nextInt();
//            int num2 = in.nextInt();
//            int sum = num1+num2;
//            return  sum;
//        }
    static String greeting(String name){
        String greet = "Hello broo!";
       return greet+name+" namaste ";
        //return name;
    }
}

