package src;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int arr[] ={12,36,9999,0,1,3-99};
        int ans = Evennoofdigits(arr);
        System.out.println(ans);
    }
    static int Evennoofdigits(int arr[]){
        int count = 0;
        for(int num : arr) {
            {
                if (isEven(num)) {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int noOFdigits = digitscount(num);
        if(noOFdigits%2==0){
            return true;
        }
        return false;
    }
    static int digitscount(int num){
        if(num<0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num  = num/10;
        }
        return count;
    }
}
