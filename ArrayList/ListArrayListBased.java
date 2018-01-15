import java.util.ArrayList;

public class ListArrayListBased {
	protected ArrayList<Object> items = new ArrayList<Object>();
	
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
		items = new ArrayList<Object>();
	}
	
	public void add(int index, Object obj) 
	{
		items.add(index,obj);
	}
	
	public Object get(int index)
	{
		return items.get(index);
	}
	
	public void remove(int index)
	{
		items.remove(index);
	}
}
