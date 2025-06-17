package basics;

public class SmallestOfThree {
 public static void main(String[] args) {
	int  a = 79;
	int b = 389;
	int c = 4;
	if(a<b && a<c)
	System.out.println("a is smallest");
	else if (b<c)
		System.out.println("b is smallest");
	else
		System.out.println(" c is smallest");
//	String man =(a<b && b<c) ? "a is smallest": (b<c) ? "b is smallest":"c is smallest";
//	System.out.println(man);

}
}
