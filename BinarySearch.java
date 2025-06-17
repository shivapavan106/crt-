package src;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,22,28,33,39,50};
        int target = 22;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int target){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if (target>arr[mid]) {
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
