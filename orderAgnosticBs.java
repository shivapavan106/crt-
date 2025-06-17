package src;

public class orderAgnosticBs {
    public static void main(String[] args) {
        int arr[] = {90,50,49,40,30,25,1,-15};
        int arr1[] = {1,3,5,7,9,11,22,28,33,39,50};
        int target = 39;
        int ans = OABS(arr1,target);
        System.out.println(ans);
    }
    static int OABS(int arr[],int target) {
        int st = 0;
        int end = arr.length - 1;
        boolean isorder = arr[st] < arr[end];
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isorder) {
                if (target > arr[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
