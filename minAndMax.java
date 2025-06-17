package src.test;

public class minAndMax {
    public static void main(String[] args) {
        int result1 = max(20,80,99);
        int result2 = min(1,-1,-99);
        System.out.println(result1);
        System.out.println(result2);
    }
    static int max(int a,int b,int c){
        int ans  = Math.max(c,Math.max(a,b));
        return ans;
    }
    static int min (int a,int b,int c){
        int ans = Math.min(c,Math.max(a,b));
        return ans;
    }
}
