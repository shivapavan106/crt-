package src;

import java.util.Arrays;

public class funct {
    public static void main(String[] args) {
//        String name = "karthik";
//        names(name);
//        System.out.println(name);
        int arr[] = {1,2,2,3,4,9};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
//    static void names(String naam){
//        System.out.println(naam);
//    }
    static void change(int arr[]){
        arr[0] = 12;
        //System.out.println(Arrays.toString(arr));
    }
}
