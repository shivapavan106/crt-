package src;

import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("enter values : ");
//        float base  = in.nextFloat();
//        double equalsides = in.nextFloat();
//        double height = Math.sqrt(Math.pow(equalsides,2)-Math.pow(base/2,2));
//        double result = 0.5*base*height;
//        System.out.println("Area is : "+result);
//        double results = 0.0;
//        while (true){
//            System.out.println("enter choice");
//            char choice = in.next().trim().charAt(0);
//            if (choice == 'N'||choice=='n'){
//                System.out.print("enter base and height : ");
//                float base1 = in.nextFloat();
//                float height1 = in.nextFloat();
//                results = base1*height1;
//            }
//           if(choice=='D'||choice=='d')
//            {   System.out.print("enter d1 and d2 : ");
//                float d1 = in.nextFloat();
//                float d2 = in.nextFloat();
//                results = 0.5*d1*d2;
//
//            }
//            System.out.println(results);
//
//        }
//
//        System.out.println("enter side : ");
//        double side = in.nextFloat();
//        double ans = (Math.sqrt(3)/4)*Math.pow(side,2);
//
//        System.out.println(ans);
// Input a number and print all the factors of that number (use loops).
//        int num = in.nextInt();
//        for(int i =1;i<=num;i++){
//            if(num%i==0){
//                System.out.println(i);
//            }
//        }
//        Take integer inputs till the user enters 0 and print the sum of all numbers
//        (HINT: while loop)
//        int sum = 0;
//        System.out.println("enter numbers : ");
//        while (true) {
//            int number = in.nextInt();
//            if(number==0){
//                break;
//            }
//            sum = sum+number;
//
//        }
//        System.out.println("sum is : "+sum);
// Take integer inputs till the user enters 0 and print the largest number from all.
//        int largest = Integer.MIN_VALUE;
//        System.out.println("enter numbers : ");
//        while (true) {
//            int number = in.nextInt();
//            if (number == 0) {
//                break;
//            }
//            if(number>largest){
//                largest = number;
//            }
//        }
//        System.out.print("largest number is "+largest);
//        float average = 0;
//        float sum = 0;
//        System.out.println("enter numbers : ");
//        while (true) {
//            int number = in.nextInt();
//            if (number == 0) {
//                break;
//            }
//            sum = sum + number;
//            average = (sum/number)*100;
//
//        }
//        System.out.println(sum);
//        System.out.print("enter number : ");
//        int n = in.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= n ; i++) {
//            fact = fact*i;
//        }
//        System.out.print(fact);
//        System.out.println("enter number of units : ");
//        int units = in.nextInt();
//        System.out.println("enter fixedcharges : ");
//        int fixedcharges = in.nextInt();
//        int cost = 0;
//        if(units<=50){
//            cost=cost+5;
//        } else if (units <=100) {
//            cost = cost+10;
//        } else if (units<=200) {
//            cost = cost+20;
//        }
//        else{
//            cost = cost+30;
//        }
//        int totalcost = cost*units;
//        double tax = totalcost*0.10;
//       double currentBill = totalcost+tax+fixedcharges;
//        System.out.println("Total cost is "+totalcost);
//        System.out.println(tax);
//        System.out.println(currentBill);
//        int sum = 0;
//        System.out.println("enter no of numbers : ");
//        int n = in.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println("enter number "+i+" : ");
//            int number = in.nextInt();
//            sum = sum+number;
//        }
//        double average = (sum)/n;
//        System.out.println("Averge is : "+average+"%");
//        System.out.println("enter price : ");
//        int mrp = in.nextInt();
//        double discount  = 4.0/100;
//        double discountAmount = mrp*discount;
//        System.out.println("discount amount is : "+discountAmount);
//        System.out.println("comission is : "+discountAmount*100);\
        System.out.println("enter commisisonTaken : ");
        float commisionTaken = in.nextFloat();
        System.out.println("Enter total cost : ");
        float totalcost = in.nextFloat();
        double commisionpercentage = (commisionTaken/totalcost)*100;
        System.out.print("commsion of pushpa : "+commisionpercentage+"%");
    }
}