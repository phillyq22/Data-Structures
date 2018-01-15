
public class ListCDLSBased<T> implements ListInterface<T>{

	NodeD<T> head;
	int numItems;
	public ListCDLSBased()
	{
		head = null;
		numItems = 0;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}
	
	public int size() {
		return numItems;
	}
	
	public void add(int index, T item) throws ListIndexOutOfBoundsException {
		 if (index >= 0 && index <= numItems)
		 {
			 if(numItems == 0)
			 {
				 head = new NodeD<T>(item);
			 }
			 else if(index == numItems)
			 {
				 NodeD<T> back = head.getBack();
				 NodeD<T> newNode = new NodeD<T>(item, head, back);
				 head.setBack(newNode);
				 back.setNext(newNode);
			 }
			 else
			 {
				 NodeD<T> curr = find(index);
				 NodeD<T> currBack = curr.getBack();
				 NodeD<T> newNode = new NodeD<T>(item,curr,currBack);
				 currBack.setNext(newNode);
				 curr.setBack(newNode);
				 if(index == 0)
				 {
					 head = newNode;
				 }
			 }
			 numItems++;
		 }
		 else
		 {
			 throw new ListIndexOutOfBoundsException("List index out of bounds exception on add");
		 }
	}
	
	public T get(int index) throws ListIndexOutOfBoundsException {
		 if (index >= 0 && index < numItems)
	        {
	            // get reference to node, then data in node
	            NodeD<T> curr = find(index);
	            T dataItem = curr.getItem();
	            return dataItem;
	        }
	        else
	        {
	            throw new ListIndexOutOfBoundsException("List index out of bounds exception on get");
	        } // end if
	}
	
	public void remove(int index) throws ListIndexOutOfBoundsException {
		 if (index >= 0 && index < numItems)
		 {
			 if(numItems == 1)
			 {
				 head = null;
			 }

			 else
			 {
				 NodeD<T> curr = find(index);
				 NodeD<T> back = curr.getBack();
				 NodeD<T> next = curr.getNext();
				 back.setNext(next);
				 next.setBack(back);
				 if(index == 0)
				 {
					 head = next;
				 }
			 }
			 numItems--;
		 }
		 else
		 {
			 throw new ListIndexOutOfBoundsException("List index out of bounds exception on remove");
		 }
	}
	
	public void removeAll() {
		head = null;
		numItems = 0;
	}
    private NodeD<T> find(int index)
	{
	        // --------------------------------------------------
	        // // Locates a specified node in a linked list.
	        // Precondition: index is the number of the desired
	        // node. Assumes that 0 <= index <= numItems
	        // Postcondition: Returns a reference to the desired
	        // node.
	        // --------------------------------------------------
		 NodeD<T> curr;
		 if(numItems/2 > index)
	     {
			 curr = head;
			 for (int skip = 0; skip < index; skip++)
		     {
		         curr = curr.getNext();
		     } // end for
	     }
	     else
	     {
	    	curr = head.getBack();
	    	for (int skip = numItems - 1; index < skip; skip--)
		     {
		         curr = curr.getBack();
		     } // end for
	     }
	     return curr;
	 } // end find

    public String toString()
    {
    	String returnString = " ";
    	for(int i = 0; i < numItems; i++)
    	{
    		returnString += (get(i) + " ");
    	}
    	return returnString;
    }
}
