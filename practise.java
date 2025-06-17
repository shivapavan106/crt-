package src;

import java.util.Scanner;

public class practise {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int first = 0;
    int second = 1;
    int count = 2;
    while(count<=n){
        int next = first+second;
//        second = next;
        first = second;
        second = next;
        count++;
    }
    System.out.print(second);
}
}
