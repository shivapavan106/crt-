import java.util.*;
class strings{
public static void main(String args[]){
	String a = "12345";
	String b = "2355";
	String ep = "";
	String ans = alphabets(ep,a,b);
	System.out.println(ans);
}
static String alphabets(String ep,String a,String b){
	if(a.isEmpty()){
	return ep;
	}
		char ch = a.charAt(0);
		if (b.contains(String.valueOf(ch)))
		{
			return alphabets(ep,a.substring(1),b);
		}
		else{
			return alphabets(ep+ch,a.substring(1),b);
	}
}
}
	
