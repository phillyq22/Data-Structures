import java.util.ArrayList;

public class ListArrayListBasedPlus<T> extends ListArrayListBased<T>{
	protected ArrayList<T> items = new ArrayList<T>();

	public ListArrayListBasedPlus()
	{
		super();
	}
	
	public void reverse()
	{
		ArrayList<T> newArray = new ArrayList<T>();
		for(int i = size()-1; i >= 0; i--)
		{
			newArray.add(get(size()-i-1));
		}
		items = newArray;
	}
	
	public String toString()
	{
		String returnString = "";
		for(int i = 0; i < size(); i++)
        {
            returnString += (get(i) + " ");
        }
		return returnString;
	}
}
