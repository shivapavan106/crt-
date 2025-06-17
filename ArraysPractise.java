package src;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 21;
        arr[3] = 31;
        arr[4] = 41;
        change(arr);
        int arr1[] = {51,21,31,41,45};
        String arr2[]= {"DK","AK","KLT","GJ","GH"};
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        for(String a : arr2){
            System.out.println(a);
        }
        for(int i = 0;i< arr1.length;i++) {
            System.out.println(arr[i]);
        }
        change(arr);

    }
    static void change(int arr[]){
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
    }
}
