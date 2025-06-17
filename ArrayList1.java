package basics;
import java.util.ArrayList;
public class ArrayList1 {
	public static void main(String[] args) {
		// class_name object_name =  new class_name ()
		ArrayList arr = new ArrayList();
		arr.add("hey moj");
		arr.add("hey bujji");
		arr.add("hey bujjama");
		arr.add(1432);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);	
		System.out.println(arr.get(0));	
		arr.add(1, "manoj");
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));	
		}
		System.out.println(arr.size());
		arr.set(0, "hey bujjama");
		System.out.println(arr.get(0));
		System.out.println(arr);
		
	}
}
