package basics;
class box<T>
{
	private int item;
	public int getItem()
	{
		return item;
	}
	public void setItem(int item)
	{
		this.item=item;
	}
}
public class Box {
	public static void main(String[] args) {
		box<Integer> bb = new box();
		bb.getItem(5);
		System.out.println(bb.getItem());
	}
}
