import java.util.*;
class Twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target value");
        int t=sc.nextInt();
        int[] arr={2,7,11,15};
        int a[]=twosum(arr,t);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    public static int[] twosum(int arr[],int target)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
