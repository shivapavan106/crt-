package basics;
import java.util.ArrayList;
public class inheritance {
	void read(){
		System.out.println("i am reading");
	}
	void eat(){
		System.out.println("i am eating");
	}
	void sleep() {
		System.out.println("i am sleeping");
	}
	public static void main(String[] args) {
		inheritance ii = new inheritance();
		ii.read();
		ii.eat();
		ii.sleep();	
	}
}