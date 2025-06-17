package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylistFun {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(100);
//        list.add(210);
//        list.add(410);
//        list.add(160);
//        System.out.println(list.contains(250));
//        list.set(4,500);
//        System.out.println(list);
        for(int i = 0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.println(list.get(i));
        }
        //System.out.println(list);
    }
}
