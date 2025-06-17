package src.test;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {-11,2,33,53,-99,567,88};
        int target = 53;
        int ans = LinearRange(arr,target,0,3);
        //System.out.println(ans);
        //System.out.println(Linear2(arr,target));
        String str = "Karthik";
        char target1 = 'k';
        //System.out.println(Arrays.toString(str.toCharArray()));
        //System.out.println(searchInString(str,target1));
        int ans2 = min(arr);
        //System.out.println(ans2);


        int arrof2d[][] = {
                {21,7,8},
                {89,34,24,98},
                {3,66}
        };
        int targetof2d = 9;
        int ansof2d[] = searchIn2D(arrof2d,targetof2d);
        System.out.println(Arrays.toString(ansof2d));
        System.out.println(MaxIn2D(arrof2d));

    }
    static int Linear(int arr[],int target){
        for(int i = 0;i<arr.length;i++)
        {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    static boolean Linear2(int arr[],int target){
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
    static boolean searchInString(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    static int LinearRange(int arr[],int target,int start,int end){
        for(int i = start;i<=end;i++)
        {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    static int min(int arr[]){
        int min = arr[0];
        for(int element : arr){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
    static int[] searchIn2D(int arr[][],int target){
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                int value = arr[row][col];
                if(value == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int MaxIn2D(int arr[][]){
        int maxof2d = Integer.MIN_VALUE;
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] > maxof2d){
                    maxof2d = arr[row][col];
                }
            }
        }
        return maxof2d;
    }
}
