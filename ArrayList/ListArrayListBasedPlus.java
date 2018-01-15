import java.util.ArrayList;

public class ListArrayListBasedPlus extends ListArrayListBased{
	protected ArrayList<Object> items = new ArrayList<Object>();

	public ListArrayListBasedPlus()
	{
		super();
	}
	
	public void reverse()
	{
		ArrayList<Object> newArray = new ArrayList<Object>();
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