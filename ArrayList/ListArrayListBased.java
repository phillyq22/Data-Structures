import java.util.ArrayList;

public class ListArrayListBased <T> {
	protected ArrayList<T> items = new ArrayList<T>();
	
	public boolean isEmpty()
	{
		return items.isEmpty();
	}

	public int size()
	{
		return items.size();
	}
	
	public void removeAll()
	{
		items = new ArrayList<T>();
	}
	
	public void add(int index, T obj) 
	{
		items.add(index,obj);
	}
	
	public T get(int index)
	{
		return items.get(index);
	}
	
	public void remove(int index)
	{
		items.remove(index);
	}
}
