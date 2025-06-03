mport java.util.*;
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000 */
class Roman {
    public static void main(String[] args) {
        Map<Character,Integer> r=new HashMap<>();
         r.put('I',1);
         r.put('V',5);
         r.put('X',10);
         r.put('L',50);
         r.put('C',100);
         r.put('D',500);
         r.put('M',1000);
         int result=0;
         int prev=0;
         Scanner s= new Scanner(System.in);
         System.out.println("enter roman number");
         String roman=s.nextLine();
        for(int i=roman.length()-1;i>=0;i--)
        {
            int current=r.get(roman.charAt(i));
            if(current>=prev)
            {
                result+=current;
            }
            else
            {
                result-=current;
            }
            prev=current;
        }
        System.out.println(result);
            
        
    }
}