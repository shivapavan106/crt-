import java.util.Scanner;

public class condMedium {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
//        System.out.println("Enter number : ");
//        int num = in.nextInt();
//        int orgnum = num;
//        int result = 0;
//        while(num>0){
//            int rem= num%10;
//            result = result+rem*rem*rem;
//            num = num/10;
//        }
//        if (result == orgnum) {
//            System.out.println("its true");
//        }
//        else{
//            System.out.println("false");
//        }
//        System.out.print("enter org string : ");
//        String str = in.nextLine();
//        String org = str;
//       String reverse = "";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reverse = reverse+str.charAt(i);
//       }
//        if(org.equals(reverse)){
//            System.out.print("yes!");
//        }
//        else{
//            System.out.print("No!");
//        }
//        System.out.print("enter Number : ");
//        int n = in.nextInt();
//        int rev = 0;
//        int orgNum = n;
//        while (n > 0) {
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n = n / 10;
//        }
//        if (orgNum == rev) {
//            System.out.print("yes it 22 is : " + rev);
//        }
//        else {
//            System.out.println("Not palindrpme");
//        }
//        int n1= 15,n2=12,numerator,denominator,rem,hcf,lcm;
//        if (n1 > n2) {
//
//            numerator = n1;
//            denominator = n2;
//        }
//        else {
//            numerator = n2;
//            denominator = n1;
//        }
//        rem = numerator%denominator;
//        while(rem!=0){
//            numerator = denominator;
//            denominator = rem;
//            rem = numerator%denominator;
//        }
//        hcf = denominator;
//        System.out.println("hcf is : "+denominator);
//        lcm  = (n1*n2)/hcf;
//        System.out.println("LCM is :"+lcm);
//        System.out.print("Enter a string : ");
//        String str = in.nextLine();
//        String vowels  = "";
//        String consonants = "";
//        for(int  i =1; i<str.length();i++){
//            char ch = str.charAt(i);
//            if (Character.isLetter(ch)) {
//                char lch = Character.toLowerCase(ch);
//                if(lch=='a'||lch=='e'||lch=='i'||lch=='o'||lch=='u'){
//                    vowels = vowels+ch+" ";
//                }
//                else {
//                    consonants = consonants+ch+" ";
//                }
//            }
//            else {
//                System.out.println("not a character");
//            }
//        }
//        System.out.println(" vowels are : "+vowels);
//        System.out.println("Consonants are :"+consonants);
        //perfercct number in java
//        System.out.print("Enter number : ");
//        int num = in.nextInt();
//        int sum = 0;
//        int orgnum = num;
//        for (int i = 1; i <num ; i++) {
//            if(num%i==0){
//                sum = sum+i;
//            }
//        }
//        if(orgnum == sum){
//            System.out.println("perfect number factors : "+sum);
//        }
//        else{
//            System.out.print("not!");
//        }
        int n = 123456;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        System.out.print(sum);

    }
}