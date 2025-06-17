package basics;

public class AlphabetOrNot {
	public static void main(String[] args) {
		char value = ':';
//		if(value>='a' && value<='z'||value>='A' && value<='Z')
//			System.out.println("it is an alphabet");
//		else
//			System.out.println("it is not a alphabet");
		String result = (value>='a' && value<='z'||value>='A' && value<='Z') ? "it is an alphabet":"it is not alphabet";
		System.out.println(result);
		
		
	}

}
