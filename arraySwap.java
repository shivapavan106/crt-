package src;

import java.util.Arrays;

public class arraySwap {
    public static void main(String[] args) {
        int arr[] = {1,23,45,99,6,8};
//        swap(arr,0,3);
//        reverse(arr,0, arr.length);
//        System.out.println(Arrays.toString(arr));
        int ans = maxFun(arr);
        System.out.println(ans);
    }
    static void reverse(int[] arr,int i,int j){
         i = 0;
         j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int maxFun(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
