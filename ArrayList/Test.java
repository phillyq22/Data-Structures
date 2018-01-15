
public class Test {
	static int[] test = new int[4];
	public static void main(String[] args)
	{
		ListArrayBased list = new ListArrayBased();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);
		//list.add(4, 5);
		//list.remove(4);
		//list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);
	}

}
