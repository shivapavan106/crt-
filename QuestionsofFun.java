package src;

import java.util.Scanner;

public class QuestionsofFun {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int n = input.nextInt();
//       boolean ans  =  isPrime(n);
//        System.out.println(ans);
//        for(int i = 2;i<=50;i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//        int age = input.nextInt();
//        boolean ans  = evenorodd(age);
//        System.out.println(ans);
        //int n = input.nextInt();
//        String ans  = evenodd(n);
//        System.out.println(ans);
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        sumandproduct(n1,n2);
//        int n = input.nextInt();
//        int result = factorial(n);
//        System.out.println(result);
//        boolean ans = palindrome(n);
//        System.out.println(ans);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean result = pytriplets(a,b,c);
        System.out.println(result);

    }
    static boolean isPrime(int n){
            if(n<2){
                return false;
            }
            int c = 2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
            return c*c>n;
    }
    static boolean evenorodd(int age){
        if(age<18){
            return false;
        }
        return true;
    }
    static String evenodd(int n){
        if(n%2==0){
            return "Even";
        }
        return "odd";
    }
    static void sumandproduct(int n1,int n2){
        int sum = n1+n2;
        int product = n1*n2;
        System.out.println("sum is :"+sum);
        System.out.println("product is :"+product);
    }
    static int factorial(int n){
        int fact =1;
        for (int i = 1; i <= n; i++) {
          fact = fact * i;
        }
        return fact;
    }
    static boolean palindrome(int n){
        int ans = 0;
        int org= n;
        while(n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n = n/10;
        }
        return ans == org;
    }
    static boolean pytriplets(int a,int b,int c){
       int sum= (a*a)+(b*b);
       int result = c*c;
       if(sum==result){
           return true;
       }
       return false;
    }
}
